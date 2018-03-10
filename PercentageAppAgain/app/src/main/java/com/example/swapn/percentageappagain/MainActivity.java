package com.example.swapn.percentageappagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button quadraticBtn;
    private Button cubicBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting quadraticBtn as the button from the main XML file with the ID btnQuadratic
        quadraticBtn = (Button) findViewById(R.id.btnQuadratic);

        //Setting cubicBtn as the button from the main XML file with the ID  btnCubic
        cubicBtn = (Button) findViewById(R.id.btnCubic);

        //setting an onclick listener to know when the btn is pressed
        quadraticBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //When pressed, run the openActivity2 function
            public void onClick(View v) {
                openActivity2();
            }
        });

        //setting an onclick listener to know when the btn is pressed
        cubicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //When pressed, run the openActivity3 function
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    //Making the openActivity2 function that is called above
    public void openActivity2() {
        //I have an intent, which is called openQuadraticActivity
        //Make a new Intent that goes from this file to the quadratic class file
        Intent openQuadraticActivity = new Intent(this, Quadratic.class);
        startActivity(openQuadraticActivity);
    }

    //Making the openActivity3 function that is called above
    public void openActivity3() {
        //I have an intent, which is called openCubicActivity
        //Make a new Intent that goes from this file to the cubic class file
        Intent openCubicActivity = new Intent(this, Cubic.class);
        startActivity(openCubicActivity);
    }
}
