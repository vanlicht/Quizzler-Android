package com.londonappbrewery.quizzler;

public class TrueFalse {
    private int mQustionID;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse){
        mQustionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQustionID() {
        return mQustionID;
    }

    public void setQustionID(int qustionID) {
        mQustionID = qustionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
