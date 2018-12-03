package com.example.user301.androiddlaypro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.user301.androiddlaypro.GeoQuiz.EXTRA_ANSWER_SHOW;

public class CheapActivity extends AppCompatActivity {
    public static final String EXTRA_ANSWER = "answer_is_true";
    private boolean mAnsweer;

    private Button mAnswerButton;
    private TextView mShowAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheap);

        mAnsweer = getIntent().getBooleanExtra(EXTRA_ANSWER, false);

        mShowAnswer = findViewById(R.id.answer_text_view);

        mAnswerButton = findViewById(R.id.show_answer_button);
        mAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnsweer){
                    mShowAnswer.setText(R.string.true_button);
                }else{
                    mShowAnswer.setText(R.string.false_button);
                }
                setAnswer(true);
            }
        });
    }

    // возврат интента
    private void setAnswer (boolean answer){
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ANSWER_SHOW, answer);
        setResult(RESULT_OK);
    }

    public static Intent newIntent (Context context, boolean answer){
        Intent intent = new Intent(context, CheapActivity.class);
        intent.putExtra(EXTRA_ANSWER, answer);
        return intent;
    }
}
