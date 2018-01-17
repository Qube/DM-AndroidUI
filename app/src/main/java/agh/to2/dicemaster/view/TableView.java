package agh.to2.dicemaster.view;

import android.os.Bundle;
import agh.to2.dicemaster.common.api.*;
import agh.to2.dicemaster.controller.PlayerPresenter;

public class TableView {
    private UserType userType;
    private ObserverTableView  observerTableView ;
    private PlayerTableView playerTableView;
    //update(and display) player or observer view depending on user type

    private PlayerPresenter pp;

    public TableView(PlayerPresenter pp){
        this.pp = pp;
        this.observerTableView = new ObserverTableView(pp);
        this.playerTableView = new PlayerTableView(pp);
    }

    public void exitTable() {
        //todo switch from current view to lobby view
    }

    public void onGameEnd(){

    }

    public void refresh(GameDTO gameDTO,UserType userType){

    }

    public void refresh(GameDTO gameDTO) {
        //todo refresh the table view
    }

    public void setUserType(UserType userType){
        this.userType = userType;
    }

    public void switchToCorrectTableView(,UserType userType){
        if(userType == UserType.PLAYER){

        }else{

        }

    }


}
