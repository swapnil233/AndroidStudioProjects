package com.example.swapn.chemistrycalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private Button molarConcentration;
    private Button gmmToMass;
    private Button molsToMass;
    private Button molWeightLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////////////////////////////////////////////////////////////////////////////////////////
        molarConcentration = findViewById(R.id.molarConcentrationTransitionBtn);
        gmmToMass = findViewById(R.id.gmmToMassTransitionBtn);
        molsToMass = findViewById(R.id.molsToMassTransitionBtn);
        molWeightLink = findViewById(R.id.molWeightLink);
        ////////////////////////////////////////////////////////////////////////////////////////////


        ////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////ALL ONCLICK LISTENERS FOR HOME PAGE LINKS//////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        molarConcentration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        gmmToMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        molsToMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        molWeightLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////FUNCTIONS TO SET THE INTENTS//////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public void openActivity2() {
        Intent openSecondActivity = new Intent(MainActivity.this, iHaveForMolarConcentration.class);
        startActivity(openSecondActivity);
    }

    public void openActivity3() {
        Intent openThirdActivity = new Intent (MainActivity.this, gmmToMass.class);
        startActivity(openThirdActivity);
    }

    public void openActivity4() {
        Intent openFourthActivity = new Intent (MainActivity.this, mToMass.class);
        startActivity(openFourthActivity);
    }

    //Opens the link to calculate molar mass online
    public void openLink() {
        Intent openLink = new Intent (Intent.ACTION_VIEW);
        openLink.setData(Uri.parse("https://www.webqc.org/mmcalc.php"));
        startActivity(openLink);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
}
