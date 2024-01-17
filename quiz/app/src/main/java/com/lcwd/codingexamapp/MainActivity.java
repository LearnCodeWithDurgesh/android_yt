package com.lcwd.codingexamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.lcwd.codingexamapp.config.Constants;
import com.lcwd.codingexamapp.data.Question;
import com.lcwd.codingexamapp.databinding.ActivityMainBinding;
import com.lcwd.codingexamapp.helper.QuestionGenerator;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    private RadioButton[] checkButtons = new RadioButton[4];
    int currentIndex = 0;
    List<Question> questions;

    private CountDownTimer timer;


    private int timeLeft = Constants.TOTAL_EXAM_TIME;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initComponents();
        startTimer();


    }


    private void submitTest() {
        Toast.makeText(this, "Test submitted", Toast.LENGTH_SHORT).show();
//        questons-->
    }

    //    start timer method
    private void startTimer() {

        timer = new CountDownTimer(Constants.TOTAL_EXAM_TIME * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //har ek tick pe ye  chalega
                int min = timeLeft / 60;
                int sec = timeLeft % 60;
                binding.timer.setText("Timer: " + min + " min " + sec + " sec");
                timeLeft--;

//                update circular progress bar
                binding.circularProgressBar.setProgress((float) timeLeft/Constants.TOTAL_EXAM_TIME*100);


            }

            @Override
            public void onFinish() {
                //jab hamara timer finish hoga to ye chalega
//                Toast.makeText(MainActivity.this, "Timer finished", Toast.LENGTH_SHORT).show();
                submitTest();
                binding.timer.setText("Finished");
            }
        };

        timer.start();

    }

    private void initComponents() {

        checkButtons[0] = binding.option1;
        checkButtons[1] = binding.option2;
        checkButtons[2] = binding.option3;
        checkButtons[3] = binding.option4;

        for (RadioButton button : checkButtons) {
            button.setOnClickListener(this);
        }
        questions = QuestionGenerator.getQuestions();
        Question question = questions.get(currentIndex);
        setQuestionToView(question, currentIndex);

        //

        binding.nextButton.setOnClickListener(e -> {
            nextQuestion();
        });
        binding.previousButton.setOnClickListener(e -> {
            previousQuestion();
        });


    }

    private void previousQuestion() {

        if ((currentIndex - 1) < 0) {
            Toast.makeText(this, "Already at 0th position", Toast.LENGTH_SHORT).show();
        } else {
            currentIndex = currentIndex - 1;
            setQuestionToView(questions.get(currentIndex), currentIndex);
        }
    }

    private void nextQuestion() {


        if ((currentIndex + 1) > questions.size() - 1) {

            Toast.makeText(this, "Already at last question", Toast.LENGTH_SHORT).show();
        } else {
            currentIndex = currentIndex + 1;
            setQuestionToView(questions.get(currentIndex), currentIndex);
        }

    }

    @Override
    public void onClick(View v) {
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show();

        RadioButton buttonClicked = (RadioButton) v;
        for (RadioButton button : checkButtons) {
            button.setChecked(button.getId() == buttonClicked.getId());
        }

        questions.get(currentIndex).setCheckValue(buttonClicked.getId());
//        Log.e("checked answer",buttonClicked.getText().toString());


    }

    @SuppressLint("SetTextI18n")
    private void setQuestionToView(Question question, int index) {


        binding.question.setText((currentIndex + 1) + ". " + question.getQuestion());
        binding.option1.setText(question.getOption1());
        binding.option2.setText(question.getOption2());
        binding.option3.setText(question.getOption3());
        binding.option4.setText(question.getOption4());

        for (RadioButton button : checkButtons) {
            button.setChecked(questions.get(currentIndex).getCheckValue() == button.getId());
        }

    }
}