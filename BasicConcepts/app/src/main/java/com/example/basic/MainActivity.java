package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private Button button, clearButton;

    private EditText nameEditText, emailEditText, aboutEditText, passwordEditText, datePickerButton;

    private RadioGroup genderGroup;
    private RadioButton femaleRadioButton, maleRadioButton, otherRadioButton;

    private CheckBox javaCheck, pythonCheck, androidCheck;

    private String countryNames[] = {

            "INDIA",
            "AUSTRALIA",
            "SOUTH AFRICA",
            "KOREA",
            "CHINA",
            "USA"
    };

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button reference aa gaya hai ...ui button signup
        this.initializeViews();
        //attaching listener to date picker button
        datePickerButton.setOnClickListener(view -> {
//            code ...
//            Toast.makeText(this, "selecting date", Toast.LENGTH_SHORT).show();
//            show the date picker

//            ye hamne year month aur date ko nikala hai
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    this,
                    (view1, selectedYear, selectedMonth, selectedDay) -> {
//                        ye call hoga kab jab ham date ko pick kar lenge
                        datePickerButton.setText(selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear);
                        Toast.makeText(this, "year: " + selectedYear + " month: " + selectedMonth + " day : " + selectedDay, Toast.LENGTH_SHORT).show();

                    },
                    year,
                    month,
                    day
            );

            datePickerDialog.show();
        });

//        adapter use spinner ko populate karne lie

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, countryNames);

        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(5);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, countryNames[position] + " selected", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


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
            String dob = datePickerButton.getText().toString();
            String country = (String) spinner.getSelectedItem();


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
            Log.w("Country", country);


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
        datePickerButton = findViewById(R.id.pick_date_button);
        spinner = findViewById(R.id.country_spinner);
    }
}