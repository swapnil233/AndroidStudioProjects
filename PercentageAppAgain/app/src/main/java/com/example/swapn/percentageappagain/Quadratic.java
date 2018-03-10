package com.example.swapn.percentageappagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

//-------MAIN IDEA-------//
//1. Get the input for a, b, and c
//2. Take these inputs, parse to float to be used
//3. For a, multiply the input by 2, and put it into the ans1 field
//4. For b, put whatever they put into the answer field

public class Quadratic extends AppCompatActivity {

   //These will be referenced later

    //The answers
    TextView Qans1;
    TextView Qans2;

    //The inputs
    EditText QaValueTF;
    EditText QbValueTF;
    EditText QcValueTF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic);

        //Referencing the codes from above
        //Setting the codes from above as their corresponding ID's from the XML file

        //Bracketed TextView because the answers are not editable, and are inside TextViews
        Qans1 = (TextView) findViewById(R.id.Qans1);
        Qans2 = (TextView) findViewById(R.id.Qans2);

        //Bracketed EditTexts because this is where input goes (editable)
        QaValueTF = (EditText) findViewById(R.id.QaValueTF);
        QbValueTF = (EditText) findViewById(R.id.QbValueTF);
        QcValueTF = (EditText) findViewById(R.id.QcValueTF);

        //Creating a button, naming it "calcBtn", and linking it to the ID from the XML file...
        Button calcBtn = (Button) findViewById(R.id.QfindDerivativeBtn);
        //This is the function/method that determines what happens when the button is clicked/pressed
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Getting the input value for the "a" value, and turning it to a float
                float theAValue;
                    theAValue = Float.parseFloat(QaValueTF.getText().toString());

                //Making a new float called theAValueOperator, which will do the math for theAValue...
                //float created @ the top.
                float theAValueOperation;
                    theAValueOperation = theAValue * 2;//Setting what the a value operator is
                Qans1.setText(Float.toString(theAValueOperation));//Setting the Qans1 TextView to display operation from last line

                //Doing the same procedure for the "b" value
                float theBValue;
                    theBValue = Float.parseFloat(QbValueTF.getText().toString());

                float theBValueOperation;
                    theBValueOperation = theBValue;
                Qans2.setText(Float.toString(theBValueOperation));
            }
        });
    }
}
