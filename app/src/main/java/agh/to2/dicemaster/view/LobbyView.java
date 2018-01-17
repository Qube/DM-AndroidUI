package agh.to2.dicemaster.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import agh.to2.dicemaster.androidui.R;

public class LobbyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_view);
    }

    public void switchToTable(){
        //todo switch from current view to table view
    }

    public void switchToTableCreator(){
        //todo switch to table creator view
    }

    public void refresh(String userName, List<GameDTO> availableGames) {
        //todo refresh displayed list of available Games (tables)
    }
}
