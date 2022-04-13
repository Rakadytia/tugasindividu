package com.example.highorlow;

import android.icu.util.BuddhistCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void setRandomNumber ()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void onGuess(View view)  {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        String message;
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        int guessedNumber = Integer.parseInt(editTextNumber.getText().toString());
        if (guessedNumber > randomNumber)
            message = "Higher !!";
        else if(guessedNumber > randomNumber)
            message = "lower !!";
        else
        {
            message = "you got me !!";
            randomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void randomNumber() {
    }

    protected void onCreated (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}
