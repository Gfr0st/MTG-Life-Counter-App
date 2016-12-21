package com.example.android.mtglifecounter;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int lifePlayer1 = 20;
    int lifePlayer2 = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets the lifes of both players back to 20.
     */
    public void resetLifes(View v) {
        lifePlayer1 =20;
        lifePlayer2 =20;
        displayForPlayer1(lifePlayer1);
        displayForPlayer2(lifePlayer2);
    }

    /**
     * Displays the given score for PLayer 1.
     */
    public void displayForPlayer1(int score) {
        TextView lifeView = (TextView) findViewById(R.id.player_1_life);
        lifeView.setText(String.valueOf(lifePlayer1));
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView lifeView = (TextView) findViewById(R.id.player_2_life);
        lifeView.setText(String.valueOf(lifePlayer2));
    }

    /**
     * Adds 1 life to player 1 life total
     */
    public void add1ForPlayer1(View v) {
        lifePlayer1 = lifePlayer1 + 1;
        displayForPlayer1(lifePlayer1);
    }

    /**
     * Adds 5 life to player 1 life total
     */
    public void add5ForPlayer1(View v) {
        lifePlayer1 = lifePlayer1 + 5;
        displayForPlayer1(lifePlayer1);
    }


    /**
     * Substracts 1 life from player 1 life total
     */
    public void sub1ForPlayer1(View v) {
        lifePlayer1 = lifePlayer1 - 1;
        displayForPlayer1(lifePlayer1);
    }

    /**
     * Substracts 5 life from player 1 life total
     */
    public void sub5ForPlayer1(View v) {
        lifePlayer1 = lifePlayer1 - 5;
        displayForPlayer1(lifePlayer1);
    }

    /**
     * Adds 1 life to player 2 life total
     */
    public void add1ForPlayer2(View v) {
        lifePlayer2 = lifePlayer2 + 1;
        displayForPlayer2(lifePlayer2);
    }

    /**
     * Adds 5 life to player 1 life total
     */
    public void add5ForPlayer2(View v) {
        lifePlayer2 = lifePlayer2 + 5;
        displayForPlayer2(lifePlayer2);
    }


    /**
     * Substracts 1 life from player 1 life total
     */
    public void sub1ForPlayer2(View v) {
        lifePlayer2 = lifePlayer2 - 1;
        displayForPlayer2(lifePlayer2);
    }

    /**
     * Substracts 5 life from player 1 life total
     */
    public void sub5ForPlayer2(View v) {
        lifePlayer2 = lifePlayer2 - 5;
        displayForPlayer2(lifePlayer2);
    }
}
