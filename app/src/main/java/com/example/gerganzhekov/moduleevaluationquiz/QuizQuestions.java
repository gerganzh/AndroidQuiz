package com.example.gerganzhekov.moduleevaluationquiz;

/**
 * Created by Gergan Zhekov on 07/12/2017.
 */

//contains all questions and their answer

public class QuizQuestions {

    public static String[] questions = new String [] { //each sentence will appear as a new question
            "More than 95% of enterprise computers run Java",
            "Java is not case sensitive",
            "Android is based on Linux kernel",
            "Android is not open source",
            "Java is a dynamic programming language",
            "Android design framework is named 'Material Design'",
            "Java Basic Syntax involves 4 components- object, class, methods and instant variables.",
            "Android was developed by Apple Inc.",
            "Android Version 8.0 is named Oreo",
            "A float is a primitive data type",
    };


    public static boolean[] answers = new boolean[]{ //using booleans for the right answer (in order)
            true, false, true, false, false, true, true, false, true, true
    };
}
