package com.lcwd.codingexamapp.helper;

import com.lcwd.codingexamapp.data.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionGenerator {

    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();
        Question question = new Question();
        question.setId(1);
        question.setQuestion("What  is java ?");
        question.setOption1("Programming Language");
        question.setOption2("Game for PC");
        question.setOption3("Books for Knowledge");
        question.setOption4("None of these");
        question.setAnswer("What  is java ?");

        Question question1 = new Question();
        question1.setId(1);
        question1.setQuestion("Java is used for ?");
        question1.setOption1("Create Web apps");
        question1.setOption2("Create Mobile apps");
        question1.setOption3("Create APIS");
        question1.setOption4("All of above");
        question1.setAnswer("All of above");
        list.add(question);
        list.add(question1);

        Question question2 = new Question();
        question2.setId(1);
        question2.setQuestion("What is type casting?");
        question2.setOption1("Conversion Type");
        question2.setOption2("Type Conversion");
        question2.setOption3("Type Changing");
        question2.setOption4("All of above");
        question2.setAnswer("All of above");
        list
                .add(question2);


        Question question3 = new Question();
        question3.setId(1);
        question3.setQuestion("Automatic type conversion is possible in which of the possible cases?");
        question3.setOption1("byte to int");
        question3.setOption2("int to long");
        question3.setOption3("long to int");
        question3.setOption4("short to ing");
        question3.setAnswer("nt to long");
        list
                .add(question3);

//        hard code
//        database
//        api
        Collections.shuffle(list);
        return list;
    }

}
