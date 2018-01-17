package agh.to2.dicemaster.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import agh.to2.dicemaster.common.api.*;

import agh.to2.dicemaster.view.R;

public class TableCreatorView extends AppCompatActivity {
    //this activity is not kept in the history stack!
    // set in android manifest - android:noHistory = "true"
    // this can be dynamically changed setting FLAG_ACTIVITY_NO_HISTORY
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_creator_view);
    }

    public void switchToLobby(){
        finish();
    }

    public void onCreateTableError(){

    }

    public void switchToTable(){

    }
}
