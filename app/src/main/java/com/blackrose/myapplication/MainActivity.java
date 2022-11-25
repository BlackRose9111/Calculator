package com.blackrose.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public enum OPERATION {SUM,SUB,MULTI,DIV,MODULO,FACTORIAL,NONE}
    public  OPERATION operation = OPERATION.NONE;
    //Ömer Faruk BARAN 201913709034
    TextView textView;
    public double number1 = 0d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.numberInput);

    }
    public void sum(View view){
        operation = OPERATION.SUM;
        number1 = Double.parseDouble(textView.getText().toString());
        textView.setText("0");

    }
    public void sub(View view){
        operation = OPERATION.SUB;
        number1 = Double.parseDouble(textView.getText().toString());
        textView.setText("0");
    }public void multi(View view){
        operation = OPERATION.MULTI;
        number1 = Double.parseDouble(textView.getText().toString());
        textView.setText("0");
    }public void div(View view){
        operation = OPERATION.DIV;
        number1 = Double.parseDouble(textView.getText().toString());
        textView.setText("0");
    }
    public void modulo(View view){
        operation = OPERATION.MODULO;
        number1 = Double.parseDouble(textView.getText().toString());
        textView.setText("0");
    }
    public void factorial(View view){


            double num = 1;
            for (double i = 1;i <= number1;i++){

                num = num*i;






            }
            textView.setText(Double.toString(num));


    }

    public void equal(View view){
        switch (operation){
            case SUM:{
                double number2 = Double.parseDouble(textView.getText().toString());
                double res = number1+number2;
                textView.setText(Double.toString(res));
                break;
            }
            case SUB:{
                double number2 = Double.parseDouble(textView.getText().toString());
                double res = number1-number2;
                textView.setText(Double.toString(res));
                break;

            }
            case MULTI:{
                double number2 = Double.parseDouble(textView.getText().toString());
                double res = number1*number2;
                textView.setText(Double.toString(res));
                break;
            }
            case DIV:{
                double number2 = Double.parseDouble(textView.getText().toString());
                if (number2 == 0){
                    textView.setText("0");
                    break;
                }
                double res = number1/number2;
                textView.setText(Double.toString(res));
                break;
            }
            case MODULO:{
                double number2 = Double.parseDouble(textView.getText().toString());
                double res = number1%number2;
                textView.setText(Double.toString(res));
                break;
            }

            default:
                break;

        }




    }

}