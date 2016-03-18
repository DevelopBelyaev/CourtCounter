package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private int scoreB = 0;
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addThreePoints(View view) {
        score += three;
        displayScore(score);
    }

    public void addTwoPoints(View view) {
        score += two;
        displayScore(score);
    }

    public void addOnePoints(View view) {
        score += one;
        displayScore(score);
    }

    private void displayScore(final int value) {
        TextView textView = (TextView) findViewById(R.id.score_a_team);
        if (textView != null) {
            textView.setText("" + value);
        }
    }

    private void displayScoreB(final int value) {
        TextView textView = (TextView) findViewById(R.id.score_a_team1);
        if (textView != null) {
            textView.setText("" + value);
        }
    }

    public void addOnePoints1(View view) {
        scoreB += one;
        displayScoreB(scoreB);
    }

    public void addThreePoints1(View view) {
        scoreB += three;
        displayScoreB(scoreB);
    }

    public void addTwoPoints1(View view) {
        scoreB += two;
        displayScoreB(scoreB);
    }

    public void resetScore(View view) {
        score = 0;
        scoreB = 0;
        displayScore(score);
        displayScoreB(scoreB);
    }
}
