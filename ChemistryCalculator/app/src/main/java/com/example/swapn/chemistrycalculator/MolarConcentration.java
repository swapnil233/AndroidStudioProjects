package com.example.swapn.chemistrycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MolarConcentration extends AppCompatActivity {

    EditText molsEditText;
    EditText volumeEditText;
    EditText concentrationAnswerEditText;
    Button concentrationCalculateButton;
    Button cls1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molar_concentration);

        molsEditText = findViewById(R.id.molsET);
        volumeEditText = findViewById(R.id.volumeET);
        concentrationAnswerEditText = findViewById(R.id.concentrationAnswerET);
        concentrationCalculateButton = findViewById(R.id.concentrationCalculateButton);
        cls1 = findViewById(R.id.cls1);

        concentrationCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float mol = Float.parseFloat(molsEditText.getText().toString());
                float vol = Float.parseFloat(volumeEditText.getText().toString());

                float theConcentrationCalculation;
                    theConcentrationCalculation = mol / vol;

                concentrationAnswerEditText.setText(Float.toString(theConcentrationCalculation) + " mol/L");

            }
        });

        //Button that clears all textfields when pressed
        cls1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                molsEditText.setText("");
                volumeEditText.setText("");
                concentrationAnswerEditText.setText("");
            }
        });
    }
}
