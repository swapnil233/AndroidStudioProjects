package com.example.swapn.percentageappagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//-------MAIN IDEA:-------//
//1. Get the input for a, b, c and d
//2. Take these inputs, parse to float to be used
//3. For "a", multiply input by 3, and put it into the first text field
//4. For "b", multiply by 2, put it in the 2nd ans field
//5. For "c", keep the same number as input

public class Cubic extends AppCompatActivity {

    //Will be referenced later
    EditText CaValueTF;
    EditText CbValueTF;
    EditText CcValueTF;
    EditText CdValueTF;

    TextView Cans1;
    TextView Cans2;
    TextView Cans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubic);

        CaValueTF = (EditText) findViewById(R.id.CaValueTF);
        CbValueTF = (EditText) findViewById(R.id.CbValueTF);
        CcValueTF = (EditText) findViewById(R.id.CcValueTF);
        CdValueTF = (EditText) findViewById(R.id.CdValueTF);

        Cans1 = (TextView) findViewById(R.id.Cans1);
        Cans2 = (TextView) findViewById(R.id.Cans2);
        Cans3 = (TextView) findViewById(R.id.Cans3);

        Button cubicCalcBtn = (Button) findViewById(R.id.CubicCalcButton);

        cubicCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float theCubicAValue;
                    theCubicAValue = Float.parseFloat(CaValueTF.getText().toString());
                float theCubicAValueOperator;
                    theCubicAValueOperator = theCubicAValue * 3;
                Cans1.setText(Float.toString(theCubicAValueOperator));


                float theCubicBValue;
                    theCubicBValue = Float.parseFloat(CbValueTF.getText().toString());
                float theCubicBValueOperator;
                    theCubicBValueOperator = theCubicBValue * 2;
                Cans2.setText(Float.toString(theCubicBValueOperator));


                float theCubicCValue;
                    theCubicCValue = Float.parseFloat(CcValueTF.getText().toString());
                Cans3.setText(Float.toString(theCubicCValue));
            }
        });


    }
}
