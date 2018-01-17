package agh.to2.dicemaster.controller;

import agh.to2.dicemaster.common.api.*;
import agh.to2.dicemaster.model.gui.GameEventHandler;
import agh.to2.dicemaster.model.server.*;
import agh.to2.dicemaster.view.*;

public class PlayerPresenter implements GameEventHandler{
    private LoginView loginView = new LoginView(this);
    private LobbyView lobbyView = new LobbyView(this);
    private TableCreatorView tableCreatorView = new TableCreatorView(this);
    private TableView tableView = new TableView(this);

    private Server server;
    private ServerGame serverGame;
    private UserInGame userInGame;
    private String userName;
    private UserType userType;

    public PlayerPresenter() {
        //login view is the default view and shows after launching the app
    }

    public void onLoginButtonPress(String userName) {
        if (!server.registerClient(userName)) loginView.onLoginError();      //TODO: komunikat o błędzie
        else {
            this.userName = userName;
            lobbyView.refresh(userName, server.getAvailableGames());
            loginView.switchToLobby();
        }
    }

    public void onTableListRefresh() {
        lobbyView.refresh(userName,server.getAvailableGames());
    }


    public void onJoinTable(GameDTO gameDTO, UserType userType) {
        if (server.requestJoinGame(gameDTO, null, userType) == null);    //TODO: GameEventHandler, komunikat o błędzie
        else {
            tableView.refresh(gameDTO,userType);
            lobbyView.switchToTable();
        }

    }

    public void onLobbyCreateTableButtonClick() {
        lobbyView.switchToTableCreator();
    }

    public void onCreateTableButtonClick(GameConfigDTO gameConfigDTO, UserType userType) {
        serverGame = server.createGame(gameConfigDTO, null, userType);

        if (serverGame == null){
            tableCreatorView.onCreateTableError();
        }
        else {
            this.userType = userType;
            tableCreatorView.switchToTable();
        }
    }

    public void onDiceClick(MoveDTO moveDTO) {

    }

    public void onRollButtonClick(MoveDTO moveDTO) {
        serverGame.makeMove(moveDTO);
    }

    public void onLeaveTableButtonClick() {
        serverGame.leaveGame();
        tableView.exitTable();
    }

    /*
    public void onGameStatusRefresh(GameDTO gameDTO) {
        tableView.refresh(gameDTO);   //TODO: userType
    }
    //same as below?
    */

    @Override
    public void onGameChange(GameDTO gameDTO) {
        tableView.refresh(gameDTO);
    }
}
