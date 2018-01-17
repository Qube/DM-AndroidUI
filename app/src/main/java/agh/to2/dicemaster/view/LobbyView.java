package agh.to2.dicemaster.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import agh.to2.dicemaster.common.api.*;

import java.util.List;

import agh.to2.dicemaster.controller.PlayerPresenter;
import agh.to2.dicemaster.view.R;

public class LobbyView extends AppCompatActivity {

    private PlayerPresenter pp;

    public LobbyView(PlayerPresenter pp){
        this.pp = pp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_view);

        Button joinTableButton = (Button) findViewById(R.id.button_join_table);
        joinTableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo pp.onJoinTableButtonPress();
                //....

                switchToTable();
            }
        });

        Button openTableCreator = (Button) findViewById(R.id.button_create_new_table);
        joinTableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo - pp.onCreateTableButtonClick();

                switchToTableCreator();
            }
        });

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
