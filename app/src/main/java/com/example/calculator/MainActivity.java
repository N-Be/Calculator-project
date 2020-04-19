package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    private Button divide;
    private Button multiply;
    private Button minus;
    private Button plus;
    private Button equals;
    private Button period;

    private Button clear;
    private Button clearEntry;

    private TextView textView;

    private int last;
    private Boolean action;
    private String toDo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        action = false;
        last = 0;
        toDo = "nothing";

        textView = this.findViewById(R.id.curr);
        textView.setText("");

        zero = this.findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                if(!(textView.getText().equals("0"))){
                    textView.setText(textView.getText()+"0");
                }
            }
        });

        one = this.findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"1");
            }
        });

        two = this.findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"2");
            }
        });

        three = this.findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"3");
            }
        });

        four = this.findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"4");
            }
        });
        five = this.findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"5");
            }
        });
        six = this.findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"6");
            }
        });
        seven = this.findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"7");
            }
        });
        eight = this.findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"8");
            }
        });
        nine = this.findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action){
                    action = false;
                    textView.setText("");
                }
                textView.setText(textView.getText()+"9");
            }
        });



        divide = this.findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                last = Integer.parseInt(textView.getText().toString());
                action = true;
                toDo = "divide";
            }
        });
        multiply = this.findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                last = Integer.parseInt(textView.getText().toString());
                action = true;
                toDo = "multiply";
            }
        });

        minus = this.findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                last = Integer.parseInt(textView.getText().toString());
                action = true;
                toDo = "subtract";
            }
        });

        plus = this.findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                last = Integer.parseInt(textView.getText().toString());
                action = true;
                toDo = "add";

            }
        });

        equals = this.findViewById(R.id.equals);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toDo.equals("add") ){
                    textView.setText(Integer.toString(Integer.parseInt(textView.getText().toString())+last));
                }
                if(toDo.equals("subtract")){
                    textView.setText(Integer.toString(last-Integer.parseInt(textView.getText().toString())));
                }
                if(toDo.equals("multiply")){
                    textView.setText(Integer.toString(Integer.parseInt(textView.getText().toString())*last));
                }
                if(toDo.equals("divide")){
                    textView.setText(Integer.toString(last/Integer.parseInt(textView.getText().toString())));
                }
                action = true;

            }
        });
        period = this.findViewById(R.id.period);
        period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });


        clear = this.findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
        clearEntry = this.findViewById(R.id.clearEntry);
        clearEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                last = 0;
                action = false;
                toDo = "nothing";
            }
        });








    }



}
