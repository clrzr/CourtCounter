package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int poss_home = 0;
    private int yell_home = 0;
    private int redd_home = 0;
    private int subst_home = 0;
    private int connerK_home = 0;
    private int connerK_away = 0;
    private int subst_away = 0;
    private int redd_away = 0;
    private int yell_away = 0;
    private int poss_away = 0;
    private int goal_home = 0;
    private int goal_away = 0;
    private String home = "0";
    private String away = "0";
    private String homePos = "";
    private String awayPos = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The Buttons.
     */
    public void reset(View view) {
        home = "0";
        away = "0";
        goal_home = 0;
        goal_away = 0;
        poss_home = 0;
        yell_home = 0;
        redd_home = 0;
        subst_home = 0;
        connerK_home = 0;
        connerK_away = 0;
        subst_away = 0;
        redd_away = 0;
        yell_away = 0;
        poss_away = 0;
        dis_pH(homePos);
        dis_rH(redd_home);
        dis_yH(yell_home);
        dis_sH(subst_home);
        dis_cH(connerK_home);
        dis_pA(awayPos);
        dis_yA(yell_away);
        dis_rA(redd_away);
        dis_sA(subst_away);
        dis_cA(connerK_away);
        dis_goalH(home);
        dis_goalA(away);
    }

    /**
     * Home Buttons.
     */

    public void homeGoal(View view) {
        goal_home = goal_home + 1;
        home = "" + goal_home;
        dis_goalH(home);
    }

    public void homePos(View view) {
        poss_home = poss_home + 1;
        homePos = poss_home + "%";
        dis_pH(homePos);
    }

    public void homeYellow(View view) {
        yell_home = yell_home + 1;
        dis_yH(yell_home);
    }

    public void homeRed(View view) {
        redd_home = redd_home + 1;
        dis_rH(redd_home);
    }

    public void homeSub(View view) {
        subst_home = subst_home + 1;
        dis_sH(subst_home);
    }

    public void homeCK(View view) {
        connerK_home = connerK_home + 1;
        dis_cH(connerK_home);
    }

    /**
     * Away Buttons.
     */

    public void awayGoal(View view) {
        goal_away = goal_away + 1;
        away = "" + goal_away;
        dis_goalA(away);
    }

    public void awayPos(View view) {
        poss_away = poss_away + 1;
        awayPos = poss_away + "%";
        dis_pA(awayPos);
    }

    public void awayYellow(View view) {
        yell_away = yell_away + 1;
        dis_yA(yell_away);
    }

    public void awayRed(View view) {
        redd_away = redd_away + 1;
        dis_rA(redd_away);
    }

    public void awaySub(View view) {
        subst_away = subst_away + 1;
        dis_sA(subst_away);
    }

    public void awayCK(View view) {
        connerK_away = connerK_away + 1;
        dis_cA(connerK_away);
    }

    /**
     * The Displays. dis_?H
     */

    private void dis_pH(String pH) {
        TextView q = findViewById(R.id.pos_home);
        q.setText(getString(R.string.possession_home, pH));
    }

    private void dis_yH(int yH) {
        TextView w = findViewById(R.id.yel_home);
        w.setText(getString(R.string.home_yellow, yH));
    }

    private void dis_rH(int rH) {
        TextView e = findViewById(R.id.red_home);
        e.setText(getString(R.string.home_red, rH));
    }

    private void dis_sH(int sH) {
        TextView r = findViewById(R.id.subs_home);
        r.setText(getString(R.string.substitutions_home, sH));
    }

    private void dis_cH(int cH) {
        TextView t = findViewById(R.id.conner_home);
        t.setText(getString(R.string.cornerKicks_home, cH));
    }

    private void dis_goalH(String home) {
        TextView y = findViewById(R.id.scoreBoard_text);
        y.setText(getString(R.string.Scores, home, away));
    }

    /**
     * dis?A
     */

    private void dis_pA(String pA) {
        TextView a = findViewById(R.id.pos_away);
        a.setText(getString(R.string.possession_away, pA));
    }

    private void dis_yA(int yA) {
        TextView s = findViewById(R.id.yel_away);
        s.setText(getString(R.string.away_yellow, yA));
    }

    private void dis_rA(int rA) {
        TextView d = findViewById(R.id.red_away);
        d.setText(getString(R.string.away_red, rA));
    }

    private void dis_sA(int sA) {
        TextView f = findViewById(R.id.subs_away);
        f.setText(getString(R.string.Substitutions_away, sA));
    }

    private void dis_cA(int cA) {
        TextView g = findViewById(R.id.conner_away);
        g.setText(getString(R.string.cornerKicks_away, cA));
    }

    private void dis_goalA(String away) {
        TextView y = findViewById(R.id.scoreBoard_text);
        y.setText(getString(R.string.Scores, home, away));
    }

}

