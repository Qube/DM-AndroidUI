package agh.to2.dicemaster.view;

import android.os.Bundle;

public class TableView {
    private UserType userType;
    private ObserverTableView  observerTableView = new ObserverTableView();
    private PlayerTableView playerTableView = new PlayerTableView();
    //update(and display) player or observer view depending on user type

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
}
