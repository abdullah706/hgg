package com.example.servingwebcontent;

import java.util.*;

public class QuestionsTheme {

    private List<Question> questions;
    private String title;

    public QuestionsTheme(List<Question> questions, String title) {
        this.questions = questions;
        this.title = title;
    }

    public List<Question> getQuestions() {
        return this.questions;
    }

    public String getTitle() {
        return this.title;
    }
}
