package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// implements OnClickListener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//global variables
    private int scoreA;
    private int scoreB;
    private Button three_points_left;
    private Button two_points_left;
    private Button throw_points_left;
    private Button three_points_right;
    private Button two_points_right;
    private Button throw_points_right;
    private Button reset_btn;
    private TextView team_a_name;
    private TextView team_b_name;
    private TextView score_team_a;
    private TextView score_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//initialisation of variables and objects
        three_points_left = (Button) findViewById(R.id.three_points_left);
        two_points_left = (Button) findViewById(R.id.two_points_left);
        throw_points_left = (Button) findViewById(R.id.throw_points_left);
        three_points_right = (Button) findViewById(R.id.three_points_right);
        two_points_right = (Button) findViewById(R.id.two_points_right);
        throw_points_right = (Button) findViewById(R.id.throw_points_right);
        reset_btn = (Button) findViewById(R.id.reset_btn);
        team_a_name = (TextView) findViewById(R.id.team_a_name);
        team_b_name = (TextView) findViewById(R.id.team_b_name);
        score_team_a = (TextView) findViewById(R.id.score_team_a);
        score_team_b = (TextView) findViewById(R.id.score_team_b);

//
        three_points_left.setOnClickListener(this);
        two_points_left.setOnClickListener(this);
        throw_points_left.setOnClickListener(this);
        three_points_right.setOnClickListener(this);
        two_points_right.setOnClickListener(this);
        throw_points_right.setOnClickListener(this);
        reset_btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_points_left:
                Toast.makeText(this, "+3 point to team A", Toast.LENGTH_SHORT).show();
                scoreA=scoreA+3;
                displayForTeamA(scoreA);
                break;
            case R.id.two_points_left:
                Toast.makeText(this, "+2 point to team A", Toast.LENGTH_SHORT).show();
                scoreA=scoreA+2;
                displayForTeamA(scoreA);
                break;
            case R.id.throw_points_left:
                Toast.makeText(this, "+1 point to team A", Toast.LENGTH_SHORT).show();
                scoreA=scoreA+1;
                displayForTeamA(scoreA);
                break;
            case R.id.three_points_right:
                Toast.makeText(this, "+3 point to team B", Toast.LENGTH_SHORT).show();
                scoreB=scoreB+3;
                displayForTeamB(scoreB);
                break;
            case R.id.two_points_right:
                Toast.makeText(this, "+2 point to team B", Toast.LENGTH_SHORT).show();
                scoreB=scoreB+2;
                displayForTeamB(scoreB);
                break;
            case R.id.throw_points_right:
                scoreB=scoreB+1;
                Toast.makeText(this, "+1 point to team B", Toast.LENGTH_SHORT).show();
                displayForTeamB(scoreB);
                break;
            case R.id.reset_btn:
                Toast.makeText(this, "Score was reseted.", Toast.LENGTH_SHORT).show();
                scoreA=0;
                scoreB=0;
                displayForTeamA(scoreA);
                displayForTeamB(scoreB);
                break;
        }



    }
    public void displayForTeamA(int score) {
        score_team_a.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        score_team_b.setText(String.valueOf(score));
    }

}
