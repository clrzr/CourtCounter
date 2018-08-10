package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int possessionHome = 0;
    private int yellowCard_home = 0;
    private int redCard_home = 0;
    private int substitutionsHome = 0;
    private int connerK_home = 0;
    private int connerK_away = 0;
    private int substitutionsAway = 0;
    private int redCard_away = 0;
    private int yellowCard_away = 0;
    private int possessionAway = 0;
    private int goalHome = 0;
    private int goalAway = 0;
    private String goalHome_toString = "0";
    private String goalAway_toString = "0";
    private String possessionHome_toString = "";
    private String possessionAway_toString = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The Buttons.
     */
    public void reset(View view) {
        goalHome_toString = "0";
        goalAway_toString = "0";
        possessionHome_toString ="0%";
        possessionAway_toString ="0%";
        goalHome = 0;
        goalAway = 0;
        possessionHome = 0;
        yellowCard_home = 0;
        redCard_home = 0;
        substitutionsHome = 0;
        connerK_home = 0;
        connerK_away = 0;
        substitutionsAway = 0;
        redCard_away = 0;
        yellowCard_away = 0;
        possessionAway = 0;
        display_possessionHome(possessionHome_toString);
        display_redHome(redCard_home);
        display_yellowHome(yellowCard_home);
        display_substitutionsHome(substitutionsHome);
        display_connerHome(connerK_home);
        display_possessionAway(possessionAway_toString);
        display_yellowAway(yellowCard_away);
        display_redAway(redCard_away);
        display_substitutionsAway(substitutionsAway);
        display_connerAway(connerK_away);
        display_goalHome(goalHome_toString);
        display_goalAway(goalAway_toString);
    }

    /**
     * Home Buttons.
     */

    public void goalHome_increment(View view) {
        goalHome = goalHome + 1;
        goalHome_toString = "" + goalHome;
        display_goalHome(goalHome_toString);
    }

    public void possessionHome_increment(View view) {
        possessionHome = possessionHome + 1;
        possessionHome_toString = possessionHome + "%";
        display_possessionHome(possessionHome_toString);
    }

    public void yellowHome_increment(View view) {
        yellowCard_home = yellowCard_home + 1;
        display_yellowHome(yellowCard_home);
    }

    public void redHome_increment(View view) {
        redCard_home = redCard_home + 1;
        display_redHome(redCard_home);
    }

    public void substitutionsHome_increment(View view) {
        substitutionsHome = substitutionsHome + 1;
        display_substitutionsHome(substitutionsHome);
    }

    public void ckHome_increment(View view) {
        connerK_home = connerK_home + 1;
        display_connerHome(connerK_home);
    }

    /**
     * Away Buttons.
     */

    public void goalAway_increment(View view) {
        goalAway = goalAway + 1;
        goalAway_toString = "" + goalAway;
        display_goalAway(goalAway_toString);
    }

    public void possessionAway_increment(View view) {
        possessionAway = possessionAway + 1;
        possessionAway_toString = possessionAway + "%";
        display_possessionAway(possessionAway_toString);
    }

    public void yellowAway_increment(View view) {
        yellowCard_away = yellowCard_away + 1;
        display_yellowAway(yellowCard_away);
    }

    public void redAway_increment(View view) {
        redCard_away = redCard_away + 1;
        display_redAway(redCard_away);
    }

    public void substitutionsAway_increment(View view) {
        substitutionsAway = substitutionsAway + 1;
        display_substitutionsAway(substitutionsAway);
    }

    public void ckAway_increment(View view) {
        connerK_away = connerK_away + 1;
        display_connerAway(connerK_away);
    }

    /**
     * The Displays. dis_?H
     */

    private void display_possessionHome(String posHome) {
        TextView possessionHome_textView = findViewById(R.id.pos_home);
        possessionHome_textView.setText(getString(R.string.possession_home, posHome));
    }

    private void display_yellowHome(int yellowHome) {
        TextView yellowHome_textView = findViewById(R.id.yel_home);
        yellowHome_textView.setText(getString(R.string.home_yellow, yellowHome));
    }

    private void display_redHome(int redHome) {
        TextView yellowHome_textView = findViewById(R.id.red_home);
        yellowHome_textView.setText(getString(R.string.home_red, redHome));
    }

    private void display_substitutionsHome(int subsHome) {
        TextView substitutionsHome_textView = findViewById(R.id.subs_home);
        substitutionsHome_textView.setText(getString(R.string.substitutions_home, subsHome));
    }

    private void display_connerHome(int ckHome) {
        TextView connerHome_textView = findViewById(R.id.conner_home);
        connerHome_textView.setText(getString(R.string.cornerKicks_home, ckHome));
    }

    private void display_goalHome(String home) {
        TextView goalHome_textView = findViewById(R.id.scoreBoard_text);
        goalHome_textView.setText(getString(R.string.Scores, home, goalAway_toString));
    }

    /**
     * dis_?A
     */

    private void display_possessionAway(String posAway) {
        TextView possessionAway_textView = findViewById(R.id.pos_away);
        possessionAway_textView.setText(getString(R.string.possession_away, posAway));
    }

    private void display_yellowAway(int yellowAway) {
        TextView yellowAway_textView = findViewById(R.id.yel_away);
        yellowAway_textView.setText(getString(R.string.away_yellow, yellowAway));
    }

    private void display_redAway(int redAway) {
        TextView redAway_textView = findViewById(R.id.red_away);
        redAway_textView.setText(getString(R.string.away_red, redAway));
    }

    private void display_substitutionsAway(int subsAway) {
        TextView substitutionsAway_textView = findViewById(R.id.subs_away);
        substitutionsAway_textView.setText(getString(R.string.Substitutions_away, subsAway));
    }

    private void display_connerAway(int ckAway) {
        TextView connerAway_textView = findViewById(R.id.conner_away);
        connerAway_textView.setText(getString(R.string.cornerKicks_away, ckAway));
    }

    private void display_goalAway(String away) {
        TextView goalAway_textView = findViewById(R.id.scoreBoard_text);
        goalAway_textView.setText(getString(R.string.Scores, goalHome_toString, away));
    }

}
