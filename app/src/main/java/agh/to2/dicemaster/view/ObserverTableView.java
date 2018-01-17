package agh.to2.dicemaster.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import agh.to2.dicemaster.common.api.*;
import agh.to2.dicemaster.controller.PlayerPresenter;

public class ObserverTableView extends AppCompatActivity {

    private PlayerPresenter pp;

    public ObserverTableView(PlayerPresenter pp){
        this.pp = pp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_table_view);
    }
}
