package com.example.user301.androiddlaypro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GeoQuiz extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    // массив вопросов
    private Question [] mQuestionBank = new Question[]{
            new Question(R.string.question_africa, true),
            new Question(R.string.question_americas, false),
            new Question(R.string.question_asia, false),
            new Question(R.string.question_mideast, true)
    };
    // id
    private int mID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_quiz);

        mTrueButton = findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });

        mFalseButton = findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });

        mNextButton = findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        mQuestionTextView = findViewById(R.id.question_text_view);
        int id = mQuestionBank[mID].getmTextResID();
        mQuestionTextView.setText(id);


    }
    // для обновления вопросов
    private void updateQuestion (){
        mID = (mID+1) % mQuestionBank.length;
        int id = mQuestionBank[mID].getmTextResID();
        mQuestionTextView.setText(id);
    }
    // проверка ответа
    private void checkAnswer (boolean check){
        boolean answerCheck = mQuestionBank[mID].ismAnswerTrue();

        int massage;

        if (answerCheck == check){
            massage = R.string.correct_toast;
        }else{
            massage = R.string.incorrect_toast;
        }
        Toast.makeText(this, massage , Toast.LENGTH_SHORT).show();
    }
}
