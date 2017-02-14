package com.example.edittextandbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final String TAG = "MainActivity";

    EditText name, age, gender;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //this method is responsible for loading your View from layout.
        setContentView(R.layout.activity_main);

        initializeViews();
    }

    /**This Method responsible for initialize your layout's view*/
    private void initializeViews() {

        name = (EditText) findViewById(R.id.nameET);
        age = (EditText) findViewById(R.id.ageET);
        gender = (EditText) findViewById(R.id.genderET);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        //Here are 3 types of Button calling

        // First Type
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Here we will take name from Edittext and show on Log and Toast
                String nameString = name.getText().toString().trim();

                Log.d(TAG, "Name=="+nameString);
                Toast.makeText(MainActivity.this, "Name=="+nameString, Toast.LENGTH_SHORT).show();
            }
        });

        // Second Type
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button2:
                // Here we will take age from Edittext and show on Log and Toast
                String ageString = age.getText().toString().trim();

                Log.d(TAG, "Age=="+ageString);
                Toast.makeText(MainActivity.this, "Name=="+ageString, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //Third type is to call method from layout.
    public void onGenderButtonClick(View view)
    {
        // Here we will take gender from Edittext and show log and Toast
        String genderString = gender.getText().toString().trim();

        Log.d(TAG, "Gender=="+genderString);
        Toast.makeText(MainActivity.this, "Gender=="+genderString, Toast.LENGTH_SHORT).show();
    }
}
