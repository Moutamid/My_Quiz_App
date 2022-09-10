package com.moutamid.my_quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int finalScore = 0;
    private RadioGroup mRadioGroup;
    private RadioButton
            mQuestion1State, mQuestion2State,
            mQuestion3State, mQuestion4State,
            mQuestion5State, mQuestion6State,
            mQuestion7State, mQuestion8State,
            mQuestion9State, mQuestion10State;
    private int
            mUserQue1Ans , mUserQue2Ans,
            mUserQue3Ans, mUserQue4Ans,
            mUserQue5Ans, mUserQue6Ans,
            mUserQue7Ans, mUserQue8Ans,
            mUserQue9Ans, mUserQue10Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_1_group);
        mUserQue1Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue1Ans", mUserQue1Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_2_group);
        mUserQue2Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue2Ans", mUserQue2Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_3_group);
        mUserQue3Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue3Ans", mUserQue3Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_4_group);
        mUserQue4Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue4Ans", mUserQue4Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_5_group);
        mUserQue5Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue5Ans", mUserQue5Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_6_group);
        mUserQue6Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue6Ans", mUserQue6Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_7_group);
        mUserQue7Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue7Ans", mUserQue7Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_8_group);
        mUserQue8Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue8Ans", mUserQue8Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_9_group);
        mUserQue9Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue9Ans", mUserQue9Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_10_group);
        mUserQue10Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue10Ans", mUserQue10Ans);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mUserQue1Ans = savedInstanceState.getInt("mUserQue1Ans");
        if (mUserQue1Ans != -1) {
            mQuestion1State = findViewById(mUserQue1Ans);
            mQuestion1State.setChecked(true);
        }

        mUserQue2Ans = savedInstanceState.getInt("mUserQue2Ans");
        if (mUserQue2Ans != -1) {
            mQuestion2State = findViewById(mUserQue2Ans);
            mQuestion2State.setChecked(true);
        }

        mUserQue3Ans = savedInstanceState.getInt("mUserQue3Ans");
        if (mUserQue3Ans != -1) {
            mQuestion3State = findViewById(mUserQue3Ans);
            mQuestion3State.setChecked(true);
        }

        mUserQue4Ans = savedInstanceState.getInt("mUserQue4Ans");
        if (mUserQue4Ans != -1) {
            mQuestion4State = findViewById(mUserQue4Ans);
            mQuestion4State.setChecked(true);
        }

        mUserQue5Ans = savedInstanceState.getInt("mUserQue5Ans");
        if (mUserQue5Ans != -1) {
            mQuestion5State = findViewById(mUserQue5Ans);
            mQuestion5State.setChecked(true);
        }

        mUserQue6Ans = savedInstanceState.getInt("mUserQue6Ans");
        if (mUserQue6Ans != -1) {
            mQuestion6State = findViewById(mUserQue6Ans);
            mQuestion6State.setChecked(true);
        }

        mUserQue7Ans = savedInstanceState.getInt("mUserQue7Ans");
        if (mUserQue7Ans != -1) {
            mQuestion7State = findViewById(mUserQue7Ans);
            mQuestion7State.setChecked(true);
        }

        mUserQue8Ans = savedInstanceState.getInt("mUserQue8Ans");
        if (mUserQue8Ans != -1) {
            mQuestion8State = findViewById(mUserQue8Ans);
            mQuestion8State.setChecked(true);
        }

        mUserQue9Ans = savedInstanceState.getInt("mUserQue9Ans");
        if (mUserQue9Ans != -1) {
            mQuestion9State = findViewById(mUserQue9Ans);
            mQuestion9State.setChecked(true);
        }

        mUserQue10Ans = savedInstanceState.getInt("mUserQue10Ans");
        if (mUserQue10Ans != -1) {
            mQuestion10State = findViewById(mUserQue10Ans);
            mQuestion10State.setChecked(true);
        }
    }

    public void submit(View view) {
        int temp = 0;
        finalScore = 0;

        temp = question1();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question2();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question3();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question4();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question5();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question6();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question7();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question8();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question9();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question10();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        displayFinalMessage();
    }

    private int question1() {
        RadioGroup radioGroup = findViewById(R.id.question_1_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_1_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question2() {
        RadioGroup radioGroup = findViewById(R.id.question_2_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_2_option_4);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question3() {
        RadioGroup radioGroup = findViewById(R.id.question_3_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_3_option_3);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question4() {
        RadioGroup radioGroup = findViewById(R.id.question_4_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_4_option_4);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question5() {
        RadioGroup radioGroup = findViewById(R.id.question_5_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_5_option_3);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question6() {
        RadioGroup radioGroup = findViewById(R.id.question_6_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_6_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question7() {
        RadioGroup radioGroup = findViewById(R.id.question_7_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_7_option_2);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question8() {
        RadioGroup radioGroup = findViewById(R.id.question_8_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_8_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question9() {
        RadioGroup radioGroup = findViewById(R.id.question_9_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_9_option_3);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question10() {
        RadioGroup radioGroup = findViewById(R.id.question_10_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_10_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private void displayFinalMessage() {
        Intent numbersIntent = new Intent(MainActivity.this, ResultActivity.class);
        numbersIntent.putExtra("finalScore", finalScore);
        startActivity(numbersIntent);
        finish();
    }

    private void setToastForSelectAll() {
        Toast.makeText(this, getString(R.string.attempt_all_ques), Toast.LENGTH_SHORT).show();
    }
}