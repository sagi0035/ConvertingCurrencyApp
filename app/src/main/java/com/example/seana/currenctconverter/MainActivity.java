package com.example.seana.currenctconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String a;

    public void clickFunction(View view) {
        // so we initialise the edittext so as to be able to type in a number to convert
        EditText x = (EditText) findViewById(R.id.editText);

        // we get the number turn it into a double and convert the currency
        double y = Double.parseDouble(x.getText().toString()) * 1.13;

        /*
        now here is were we turn the doublee back into a string cause only strings can be toasted
        we will also set it within 2 deciml places
        */
        String z = String.format("%.2f",y);
        Toast.makeText(this, z, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
