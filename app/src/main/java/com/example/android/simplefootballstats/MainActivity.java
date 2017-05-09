package com.example.android.simplefootballstats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


@SuppressWarnings("WeakerAccess")
public class MainActivity extends AppCompatActivity {
    int teamscoreA = 0;
    int teamscoreB = 0;
    int shotsonA = 0;
    int shotsonB = 0;
    int shotsoffA = 0;
    int shotsoffB = 0;
    int shotsblockedA = 0;
    int shotsblockedB = 0;
    int offsidesA = 0;
    int offsidesB = 0;
    int fkicksA = 0;
    int fkicksB = 0;
    int sCornersA = 0;
    int sCornersB = 0;
    int sFoulsA = 0;
    int sFoulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamscoreA);
        displayForTeamB(teamscoreB);
        displayshotsonA(shotsonA);
        displayshotsonB(shotsonB);
        displayshotsoffA(shotsoffA);
        displayshotsoffB(shotsoffB);
        displayblockedshotsA(shotsblockedA);
        displayblockedshotsB(shotsblockedB);
        displayoffsidesA(offsidesA);
        displayoffsidesB(offsidesB);
        displayfreekicksA(fkicksA);
        displayfreekicksB(fkicksB);
        displaycornersA(sCornersA);
        displaycornersB(sCornersB);
        displayfoulsA(sFoulsA);
        displayfoulsB(sFoulsB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int teamAscore) {
        TextView scoreView = (TextView) findViewById(R.id.teamAGoal);
        scoreView.setText(String.valueOf(teamAscore));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int teamBscore) {
        TextView scoreView = (TextView) findViewById(R.id.teamBGoal);
        scoreView.setText(String.valueOf(teamBscore));
    }

    /**
     * Goals for both teams
     */

    public void goalA(View view) {
        teamscoreA = teamscoreA + 1;
        displayForTeamA(teamscoreA);
    }

    public void goalB(View view) {
        teamscoreB = teamscoreB + 1;
        displayForTeamB(teamscoreB);
    }

    /**
     * Shots on goal
     */

    public void displayshotsonA(int shotsonA) {
        TextView scoreView = (TextView) findViewById(R.id.countGoalshotsA);
        scoreView.setText(String.valueOf(shotsonA));
    }

    public void displayshotsonB(int shotsonB) {
        TextView scoreView = (TextView) findViewById(R.id.countgGoalshotsB);
        scoreView.setText(String.valueOf(shotsonB));
    }

    public void goalshotsA(View view) {
        shotsonA = shotsonA + 1;
        displayshotsonA(shotsonA);
    }

    public void goalshotsB(View view) {
        shotsonB = shotsonB + 1;
        displayshotsonB(shotsonB);
    }

    /**
     * Shots off goal
     */

    public void displayshotsoffA(int shotsoffA) {
        TextView scoreView = (TextView) findViewById(R.id.statgoaloffA);
        scoreView.setText(String.valueOf(shotsoffA));
    }


    public void displayshotsoffB(int shotsoffB) {
        TextView scoreView = (TextView) findViewById(R.id.statgoaloffB);
        scoreView.setText(String.valueOf(shotsoffB));
    }


    public void goaloffA(View view) {
        shotsoffA = shotsoffA + 1;
        displayshotsoffA(shotsoffA);
    }

    public void goaloffB(View view) {
        shotsoffB = shotsoffB + 1;
        displayshotsoffB(shotsoffB);
    }

    /**
     * Blocked shots
     */

    public void displayblockedshotsA(int shotsblockedA) {
        TextView scoreView = (TextView) findViewById(R.id.statbShotsA);
        scoreView.setText(String.valueOf(shotsblockedA));
    }


    public void displayblockedshotsB(int shotsblockedB) {
        TextView scoreView = (TextView) findViewById(R.id.statbShotsB);
        scoreView.setText(String.valueOf(shotsblockedB));
    }


    public void bShotsA(View view) {
        shotsblockedA = shotsblockedA + 1;
        displayblockedshotsA(shotsblockedA);
    }

    public void bShotsB(View view) {
        shotsblockedB = shotsblockedB + 1;
        displayblockedshotsB(shotsblockedB);
    }

    /**
     * Offsides
     */

    public void displayoffsidesA(int offsidesA) {
        TextView scoreView = (TextView) findViewById(R.id.statoffsidesA);
        scoreView.setText(String.valueOf(offsidesA));
    }


    public void displayoffsidesB(int offsidesB) {
        TextView scoreView = (TextView) findViewById(R.id.statoffsidesB);
        scoreView.setText(String.valueOf(offsidesB));
    }


    public void BoffsidesA(View view) {
        offsidesA = offsidesA + 1;
        displayoffsidesA(offsidesA);
    }

    public void BoffsidesB(View view) {
        offsidesB = offsidesB + 1;
        displayoffsidesB(offsidesB);
    }

    /**
     * Free kicks
     */

    public void displayfreekicksA(int fkicksA) {
        TextView scoreView = (TextView) findViewById(R.id.statKicksA);
        scoreView.setText(String.valueOf(fkicksA));
    }


    public void displayfreekicksB(int fkicksB) {
        TextView scoreView = (TextView) findViewById(R.id.statKicksB);
        scoreView.setText(String.valueOf(fkicksB));
    }


    public void kicksA(View view) {
        fkicksA = fkicksA + 1;
        displayfreekicksA(fkicksA);
    }

    public void kicksB(View view) {
        fkicksB = fkicksB + 1;
        displayfreekicksB(fkicksB);
    }

    /**
     * Corners
     */

    public void displaycornersA(int sCornersA) {
        TextView scoreView = (TextView) findViewById(R.id.statCornersA);
        scoreView.setText(String.valueOf(sCornersA));
    }


    public void displaycornersB(int sCornersB) {
        TextView scoreView = (TextView) findViewById(R.id.statCornersB);
        scoreView.setText(String.valueOf(sCornersB));
    }


    public void cornersA(View view) {
        sCornersA = sCornersA + 1;
        displaycornersA(sCornersA);
    }

    public void cornersB(View view) {
        sCornersB = sCornersB + 1;
        displaycornersB(sCornersB);
    }


    /**
     * Fouls
     */

    public void displayfoulsA(int sFoulsA) {
        TextView scoreView = (TextView) findViewById(R.id.statfoulsA);
        scoreView.setText(String.valueOf(sFoulsA));
    }


    public void displayfoulsB(int sFoulsB) {
        TextView scoreView = (TextView) findViewById(R.id.statfoulsB);
        scoreView.setText(String.valueOf(sFoulsB));
    }


    public void foulsA(View view) {
        sFoulsA = sFoulsA + 1;
        displayfoulsA(sFoulsA);
    }

    public void foulsB(View view) {
        sFoulsB = sFoulsB + 1;
        displayfoulsB(sFoulsB);
    }

    /**
     * Reset for all variables
     */
    public void resetall(View view) {
        teamscoreA = 0;
        teamscoreB = 0;
        shotsonA = 0;
        shotsonB = 0;
        shotsoffA = 0;
        shotsoffB = 0;
        shotsblockedA = 0;
        shotsblockedB = 0;
        offsidesA = 0;
        offsidesB = 0;
        fkicksA = 0;
        fkicksB = 0;
        sCornersA = 0;
        sCornersB = 0;
        sFoulsA = 0;
        sFoulsB = 0;
        displayForTeamA(teamscoreA);
        displayForTeamB(teamscoreB);
        displayshotsonA(shotsonA);
        displayshotsonB(shotsonB);
        displayshotsoffA(shotsoffA);
        displayshotsoffB(shotsoffB);
        displayblockedshotsA(shotsblockedA);
        displayblockedshotsB(shotsblockedB);
        displayoffsidesA(offsidesA);
        displayoffsidesB(offsidesB);
        displayfreekicksA(fkicksA);
        displayfreekicksB(fkicksB);
        displaycornersA(sCornersA);
        displaycornersB(sCornersB);
        displayfoulsA(sFoulsA);
        displayfoulsB(sFoulsB);
    }
}
