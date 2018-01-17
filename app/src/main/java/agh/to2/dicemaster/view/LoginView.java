package agh.to2.dicemaster.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import agh.to2.dicemaster.common.api.*;

import agh.to2.dicemaster.view.R;

public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);
    }

    public void switchToLobby(){
        //todo switch to lobby view
    }

    public void onLoginError(){

    }
}
