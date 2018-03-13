/*
Main Idea:
1) User has GMM
2) Input the mols and the GMM
3) Multiply them together to get Mass
 */

package com.example.swapn.chemistrycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gmmToMass extends AppCompatActivity {

    EditText mls;
    EditText gmolarmass;
    EditText massAns;

    Button calculation;
    Button clearScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmm_to_mass);

        mls = findViewById(R.id.gmmToMassMols);
        gmolarmass = findViewById(R.id.gmmToMassGMM);
        massAns = findViewById(R.id.gmmToMassAnswer);

        calculation = findViewById(R.id.gmmToMassCalcBtn);
        clearScreen = findViewById(R.id.cls3);

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float moles = Float.parseFloat(mls.getText().toString());
                float gmmass = Float.parseFloat(gmolarmass.getText().toString());

                float gmmToMassAnswer = moles * gmmass;

                massAns.setText(Float.toString(gmmToMassAnswer) + " g");
            }
        });

        clearScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mls.setText("");
                gmolarmass.setText("");
                massAns.setText("");
            }
        });
    }
}
