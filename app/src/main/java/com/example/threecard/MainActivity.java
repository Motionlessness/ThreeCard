package com.example.threecard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private NestedScrollView NewGameView;
    private Button NewGameButt;
    private ImageButton playerCard1;
    private ImageButton playerCard2;
    private ImageButton playerCard3;
    private ImageButton playerCard4;
    private ImageButton playerCard5;
    private ImageButton playerCard6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewGameButt = findViewById(R.id.buttNewGame);
        NewGameView = findViewById(R.id.viewNewGame);

        playerCard1 = findViewById(R.id.playerCard1);
        playerCard2 = findViewById(R.id.playerCard2);
        playerCard3 = findViewById(R.id.playerCard3);
        playerCard4 = findViewById(R.id.playerCard4);
        playerCard5 = findViewById(R.id.playerCard5);
        playerCard6 = findViewById(R.id.playerCard6);
    }

    public void onClick(View v) {
        if (v == NewGameButt) {
            NewGameView.setVisibility(View.GONE);
        }

    }
}
