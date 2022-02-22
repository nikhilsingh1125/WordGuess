package com.codenick.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtWeight,edtHeightFt,edtHeightIn;
    Button btnSubmit;
    TextView txtResult;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wt = edtWeight.getText().toString();
                String ft = edtHeightFt.getText().toString();
                String in = edtHeightIn.getText().toString();

                if(!wt.equals("")&& !ft.equals("")&& !in.equals("")) {
                    int bmiWeight = Integer.parseInt(wt);
                    int bmiHeightFt = Integer.parseInt(ft);
                    int bmiHeightIn = Integer.parseInt(in);
                    int totalinch = (bmiHeightFt * 12) + bmiHeightIn;
                    double totalcm = (totalinch * 2.54);
                    double totalm = (totalcm / 100);
                    double bmi = bmiWeight/ (totalm * totalm);

                    

                    Intent next = new Intent(MainActivity.this,ResultActivity2.class);
                    next.putExtra("BMI",txtResult.getText().toString());
                    next.putExtra("Flag",bmi);
                    startActivity(next);
                }
                else {
                    Toast.makeText(MainActivity.this, "Fill All The details", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
    protected void onStart() {
        super.onStart();
    }
}