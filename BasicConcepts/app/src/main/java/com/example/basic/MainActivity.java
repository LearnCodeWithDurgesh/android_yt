package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button, clearButton;

    private EditText nameEditText, emailEditText, aboutEditText, passwordEditText;

    private RadioGroup genderGroup;
    private RadioButton femaleRadioButton, maleRadioButton, otherRadioButton;

    private CheckBox javaCheck, pythonCheck, androidCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button reference aa gaya hai ...ui button signup
        this.initializeViews();

        //color change
        //text change
        //animate
        //button.setText("changed button text");

        // creating listener
//        View.OnClickListener viewListener=(view)->
//        {
//            //here goes your code
//            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
//        };

        //attach  listener:
        button.setOnClickListener(view ->
        {
            //here goes your code
//            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();

            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String about = aboutEditText.getText().toString();


//            validations
            if (name.trim().equals("")) {
                Toast.makeText(this, "Name is required !!", Toast.LENGTH_SHORT).show();
                nameEditText.setError("Name is required !!");
                return;
            }

            if (password.trim().equals("")) {
                Toast.makeText(this, "Password is required!!", Toast.LENGTH_SHORT).show();
                passwordEditText.setError("Password is required !!");
            }


            String gender = "";
            if (maleRadioButton.isChecked()) {
                gender = "Male";
            }

            if (femaleRadioButton.isChecked()) {
                gender = "Female";
            }

            if (otherRadioButton.isChecked()) {
                gender = "Other";
            }

            if (gender.equals("")) {
                Toast.makeText(this, "Select gender", Toast.LENGTH_SHORT).show();
                maleRadioButton.setError("Select Gender");
                return;


            }

            String courses = "";
            if (javaCheck.isChecked()) ;
            {
                courses += "Java";
            }

            if (pythonCheck.isChecked()) {
                courses += ", Python";
                pythonCheck.setChecked(false);

            }

            if (androidCheck.isChecked()) {
                courses += ", Android";
            }

            Log.w("Name", name);
            Log.w("Gender", gender);
            Log.w("Courses", courses);

            Toast.makeText(this, "Got the data", Toast.LENGTH_SHORT).show();


//            validate
//            call api to send data...
//            save data to database(room)
//            firebase save call
        });


    }

    public void initializeViews() {
        button = findViewById(R.id.submit_button);
        nameEditText = findViewById(R.id.name_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_exit_text);
        aboutEditText = findViewById(R.id.about_edit_text);
        genderGroup = findViewById(R.id.gender_radio_group);
        femaleRadioButton = findViewById(R.id.gender_female);
        maleRadioButton = findViewById(R.id.gender_male);
        otherRadioButton = findViewById(R.id.gender_other);
        javaCheck = findViewById(R.id.java_course);
        pythonCheck = findViewById(R.id.python_course);
        androidCheck = findViewById(R.id.android_course);
        clearButton = findViewById(R.id.clear_button);
    }
}