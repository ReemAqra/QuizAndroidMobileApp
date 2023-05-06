package com.example.timestableapp.module;

public class Quiz {

    private String Question;
    private String Answer;

    public Quiz(String question ,String Answer) {
        this.Question = question;
        this.Answer=Answer;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
