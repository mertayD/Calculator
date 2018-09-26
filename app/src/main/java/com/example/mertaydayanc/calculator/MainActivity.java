package com.example.mertaydayanc.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static boolean add = false;
    public static boolean sub = false;
    public static boolean mul = false;
    public static boolean div = false;
    boolean indicator = false;

    public void calculate()
    {
        String text = textView.getText().toString();
        String edit = editText.getText().toString();
        int input = Integer.parseInt(edit);
        int result = Integer.parseInt(text);
        if(!(text.equals("0") && edit.equals("")))
        {
            if(add == true)
            {
                result = result + input;
                add = false;
                textView.setText("" + result);
                editText.setText("" + result);
            }
        }

    }



    EditText editText;
    TextView textView;

    Button button9;
    Button button8;
    Button button7;
    Button button6;
    Button button5;
    Button button4;
    Button button3;
    Button button2;
    Button button1;
    Button button0;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonClr;
    Button buttonEqu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.text_edit);
        editText.setCursorVisible(false);
        editText.setText("");
        editText.setEnabled(false);
        textView = (TextView) findViewById(R.id.text_View);
        textView.setText("0");

        button9 = (Button) findViewById(R.id.buttonNine);
        button8 = (Button) findViewById(R.id.buttonEight);
        button7 = (Button) findViewById(R.id.buttonSeven);
        button6 = (Button) findViewById(R.id.buttonSix);
        button5 = (Button) findViewById(R.id.buttonFive);
        button4 = (Button) findViewById(R.id.buttonFour);
        button3 = (Button) findViewById(R.id.buttonThree);
        button2 = (Button) findViewById(R.id.buttonTwo);
        button1 = (Button) findViewById(R.id.buttonOne);
        button0 = (Button) findViewById(R.id.buttonZero);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSubtract);
        buttonMul = (Button) findViewById(R.id.buttonMultiply);
        buttonDiv = (Button) findViewById(R.id.buttonDivide);
        buttonClr = (Button) findViewById(R.id.buttonClear);
        buttonEqu = (Button) findViewById(R.id.buttonEqual);


        button1.setOnClickListener((View v) -> {
            if(indicator == true) {
                editText.setText("");
                indicator = false;
            }
            editText.setText(editText.getText() + "1");

        });

        buttonAdd.setOnClickListener((View v) -> {
            add = true;
            indicator = true;
            calculate();
        });

        buttonEqu.setOnClickListener((View v) -> {
            add = true;
            calculate();
            indicator = false;
            editText.setText(textView.getText());
        });
        buttonClr.setOnClickListener((View v) -> {
            editText.setText("");
            textView.setText("0");
        });

    }
}

