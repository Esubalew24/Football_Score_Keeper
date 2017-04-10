package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscorekeeper.R;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int shotsTeamA = 0;
    int shotsTeamB = 0;

    int foulsTeamA = 0;
    int foulsTeamB = 0;

    int cornersTeamA = 0;
    int cornersTeamB = 0;

    int yellowTeamA = 0;
    int yellowTeamB = 0;

    int redTeamA = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(0);
        displayScoreForTeamB(0);


    }


    public void addScoreForTeamA(View v) {

        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);

    }

    public void addScoreForTeamB(View v) {

        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);

    }



    public void addShotsForTeamA(View v) {

        shotsTeamA = shotsTeamA + 1;
        displayShotsForTeamA(shotsTeamA);
    }

    public void addFoulsForTeamA(View v) {

        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }


    public void addCornersForTeamA(View v) {

        cornersTeamA = cornersTeamA + 1;
        displayCornersForTeamA(cornersTeamA);
    }


    public void addYellowForTeamA(View v) {

        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }


    public void addRedForTeamA(View v) {

        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }




    public void addShotsForTeamB(View v) {

        shotsTeamB = shotsTeamB + 1;
        displayShotsForTeamB(shotsTeamB);
    }

    public void addFoulsForTeamB(View v) {

        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }


    public void addCornersForTeamB(View v) {

        cornersTeamB = cornersTeamB + 1;
        displayCornersForTeamB(cornersTeamB);
    }


    public void addYellowForTeamB(View v) {

        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }


    public void addRedForTeamB(View v) {

        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }





    /**
     * Resets all values on each button .
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        shotsTeamA = 0;
        shotsTeamB = 0;

        foulsTeamA = 0;
        foulsTeamB = 0;

        cornersTeamA = 0;
        cornersTeamB = 0;

        yellowTeamA = 0;
        yellowTeamB = 0;

        redTeamA = 0;
        redTeamB = 0;



        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);

        displayShotsForTeamA(shotsTeamA);
        displayShotsForTeamB(shotsTeamB);

        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);

        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);

        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);

        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);


    }




    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team A.
     */
    public void displayShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given corners for Team A.
     */
    public void displayCornersForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given Yellow for Team A.
     */
    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given Red for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }





    /**
     * Displays the given shots for Team B.
     */
    public void displayShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given corners for Team B.
     */
    public void displayCornersForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given Yellow for Team B.
     */
    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given Red for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }



}
