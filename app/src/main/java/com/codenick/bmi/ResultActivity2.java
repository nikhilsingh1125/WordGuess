package com.codenick.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        Intent next = getIntent();
        double flag = next.getDoubleExtra("Flag",0);

        TextView txtBmi = findViewById(R.id.txtBmi);

        txtBmi.setText("Your BMI IS:  " +flag);


    }
}