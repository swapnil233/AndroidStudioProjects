package com.example.swapn.chemistrycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MolarConcentration2 extends AppCompatActivity {

    EditText massET;
    EditText volumeET;
    EditText gmmET;
    EditText theAnswer;
    Button calcBtnBTN;
    Button cls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molar_concentration2);

        massET = findViewById(R.id.mass);
        volumeET = findViewById(R.id.volume);
        gmmET = findViewById(R.id.molecularWeight);
        calcBtnBTN = findViewById(R.id.calcBtn);
        theAnswer = findViewById(R.id.theAnswer);
        cls = findViewById(R.id.cls);

        calcBtnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float m = Float.parseFloat(massET.getText().toString());
                float volume = Float.parseFloat(volumeET.getText().toString());
                float molcWt = Float.parseFloat(gmmET.getText().toString());

                float mols = m / molcWt;
                float nDivV = mols / volume;

                theAnswer.setText(Float.toString(nDivV) + " mol/L");

            }
        });

        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volumeET.setText("");
                massET.setText("");
                gmmET.setText("");
                theAnswer.setText("");
            }
        });

    }
}
