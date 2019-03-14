package com.example.clickme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//A variable to hold the value of the clicks count
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Method to display the count in the TextView.
    private void display(int number){
        TextView quantityTextView = findViewById(R.id.textView);
        quantityTextView.setText(""+number);
    }

//    BackEnd Method for the Button "Click Me!"
    public void buttonClick(View view){
        count = count+1;
        display(count);
    }
}
