package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     // Action to be performed on layout
    public void onClickFindAlphabets(View view) {
     //Get a reference to the TextView
        TextView display_language = (TextView) findViewById(R.id.display_language);
    //Get a reference to the Spinner
        Spinner lan = (Spinner) findViewById(R.id.language);

    //Get the selected item in the Spinner
        String languageType = String.valueOf(lan.getSelectedItem());
        //call alphabets
        String values = GetAlphabets.getValues(languageType);
        //Display the selected item

        display_language.setText(values);
    }
}
