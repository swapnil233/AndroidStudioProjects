/*
This is the page which gives you the 2 options for concentration calc
 */

package com.example.swapn.chemistrycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iHaveForMolarConcentration extends AppCompatActivity {

    //assigning the button variables
    Button haveMMV;
    Button haveMV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_have_for_molar_concentration);

        //Initializing the button variables
        haveMMV = (Button) findViewById(R.id.haveMassAndGMMandV);
        haveMV = (Button) findViewById(R.id.haveMandV);

        ////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////ONCLICK LISTENERS//////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        haveMMV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMMV();
            }
        });

        haveMV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMC();
            }
        });
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////INTENT FUNCTIONS///////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private void openMC() {
        Intent goToMolarConcentration = new Intent(iHaveForMolarConcentration.this, MolarConcentration.class);
        startActivity(goToMolarConcentration);
    }

    private void openMMV() {
        Intent goToMolarConcentration2 = new Intent(iHaveForMolarConcentration.this, MolarConcentration2.class);
        startActivity(goToMolarConcentration2);
    }
}
