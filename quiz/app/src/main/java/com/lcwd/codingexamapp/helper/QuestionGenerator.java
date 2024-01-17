package com.lcwd.codingexamapp.helper;

import com.lcwd.codingexamapp.data.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionGenerator {

    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();
        // Adding 10 Java-related questions to the list
        list.add(createJavaQuestion(1, "What is the main purpose of Java?", "Web Development", "Game Development", "Mobile App Development", "All of the above", "All of the above"));
        list.add(createJavaQuestion(2, "Which keyword is used for inheritance in Java?", "extends", "implements", "inherit", "interface", "extends"));
        list.add(createJavaQuestion(3, "What is a Java interface?", "A class", "A collection of methods", "A design pattern", "A blueprint for classes", "A blueprint for classes"));
        list.add(createJavaQuestion(4, "What is the default value of the local variables in Java?", "0", "null", "undefined", "Depends on the data type", "Depends on the data type"));
        list.add(createJavaQuestion(5, "What is the purpose of the 'super' keyword in Java?", "To call the superclass constructor", "To reference the current object", "To access static members", "To create an instance of a class", "To call the superclass constructor"));
        list.add(createJavaQuestion(6, "Which method is used for object serialization in Java?", "serialize()", "serializeObject()", "writeObject()", "saveObject()", "writeObject()"));
        list.add(createJavaQuestion(7, "What is the Java Virtual Machine (JVM)?", "A compiler", "A hardware component", "A runtime environment", "An operating system", "A runtime environment"));
        list.add(createJavaQuestion(8, "What is the purpose of the 'finally' block in a try-catch-finally statement?", "To handle exceptions", "To execute code whether an exception is thrown or not", "To specify the catch block", "To terminate the program", "To execute code whether an exception is thrown or not"));
        list.add(createJavaQuestion(9, "Which collection class is synchronized in Java?", "ArrayList", "HashSet", "Vector", "TreeSet", "Vector"));
        list.add(createJavaQuestion(10, "What is the difference between '== ' and 'equals()' in Java?", "They are identical", "'==' compares object references, 'equals()' compares object content", "'==' compares primitive types, 'equals()' compares objects", "'equals()' is used for assignment, '==' is used for comparison", "'==' compares object references, 'equals()' compares object content"));

//        hard code
//        database
//        api
        Collections.shuffle(list);
        return list;
    }


    private static Question createJavaQuestion(int id, String question, String option1, String option2, String option3, String option4, String answer) {
        Question javaQuestion = new Question();
        javaQuestion.setId(id);
        javaQuestion.setQuestion(question);
        javaQuestion.setOption1(option1);
        javaQuestion.setOption2(option2);
        javaQuestion.setOption3(option3);
        javaQuestion.setOption4(option4);
        javaQuestion.setAnswer(answer);
        return javaQuestion;
    }

}
