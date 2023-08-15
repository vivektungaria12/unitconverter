package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void centto(View view) {
        EditText editText = findViewById(R.id.editcent);
        EditText editText1=findViewById(R.id.editmet);

        String userInput = editText.getText().toString();

        double cent=Integer.parseInt(userInput);

        double s=cent*0.01;
        editText1.setText(String.valueOf(s));
        //editText1.setText(s);

    }

    public void metto(View view) {
        EditText editText = findViewById(R.id.editcent);
        EditText editText1 = findViewById(R.id.editmet);

        String userInput = editText1.getText().toString();

       double cent=Integer.parseInt(userInput);
        //Toast.makeText(MainActivity.this, ""+cent, Toast.LENGTH_SHORT).show();
        double s= cent*100;
       editText.setText(String.valueOf(s));
    }

    public void kgtog(View view) {
        EditText editText = findViewById(R.id.editgram);
        EditText editText1=findViewById(R.id.editkilo);

        String userInput = editText1.getText().toString();

        double gram=Integer.parseInt(userInput);


        double s=gram*0.001;
        editText.setText(String.valueOf(s));
    }

    public void gtokg(View view) {
        EditText editText = findViewById(R.id.editgram);
        EditText editText1=findViewById(R.id.editkilo);

        String userInput = editText.getText().toString();

        double gram=Integer.parseInt(userInput);

        double s=gram*1000;
        editText1.setText(String.valueOf(s));
    }
}