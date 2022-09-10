package com.moutamid.my_quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private String mDisplayScore;
    private int mFinalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mFinalScore = extras.getInt("finalScore");
        }
        displayResult();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void displayResult() {
        if (mFinalScore <= 35) {
            displayFinalResult(R.string.tv1_a, R.drawable.emoji1 , R.string.tv1_b);
        } else if (mFinalScore > 35 && mFinalScore <= 50) {
            displayFinalResult(R.string.tv2_a, R.drawable.emoji2, R.string.tv2_b);
        } else if (mFinalScore > 50 && mFinalScore <= 75) {
            displayFinalResult(R.string.tv3_a, R.drawable.emoji3, R.string.tv3_b);
        } else {
            displayFinalResult(R.string.tv4_a, R.drawable.emoji4, R.string.tv4_b);
        }
    }

    private void displayFinalResult(int tv_a, int imageView, int tv_b) {
        TextView tv;
        ImageView iv;

        tv = findViewById(R.id.text_view_1);
        tv.setText(tv_a);

        tv = findViewById(R.id.text_view_2);
        mDisplayScore = mFinalScore + getString(R.string.from_hundred);
        tv.setText(mDisplayScore);

        iv = findViewById(R.id.image_view_1);
        iv.setImageResource(imageView);

        tv = findViewById(R.id.text_view_3);
        tv.setText(tv_b);
    }

    public void restart(View view) {
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void exit(View view) {
        Intent intent = new Intent(ResultActivity.this, Starting_Activity.class);
        startActivity(intent);
        finish();
    }
}