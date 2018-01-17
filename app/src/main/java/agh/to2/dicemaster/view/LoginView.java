package agh.to2.dicemaster.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import agh.to2.dicemaster.common.api.*;

import agh.to2.dicemaster.controller.PlayerPresenter;
import agh.to2.dicemaster.view.R;

public class LoginView extends AppCompatActivity {

    private PlayerPresenter pp;

    public LoginView(PlayerPresenter pp){
        this.pp = pp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);

        Button loginButton = (Button) findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToLobby();
            }
        });
    }

    public void switchToLobby(){
        //todo switch to lobby view
        Intent lobby = new Intent(LoginView.this,LobbyView.class);
        startActivity(lobby);
    }

    public void onLoginError(){

    }
}
