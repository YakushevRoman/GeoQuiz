package com.example.user301.androiddlaypro;

public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int mTextResID, boolean mAnswerTrue) {
        this.mTextResID = mTextResID;
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getmTextResID() {
        return mTextResID;
    }

    public void setmTextResID(int mTextResID) {
        this.mTextResID = mTextResID;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
}
