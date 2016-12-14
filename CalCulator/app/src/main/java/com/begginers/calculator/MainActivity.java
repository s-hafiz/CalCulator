package com.begginers.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etFirst;
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnTen,btnAdd,btnSubs,btnDivide,btnMul,btnCal,btnDecimel;
    double firstNumber,secondNumber,resValue;
    String total="";
    String sign = "";
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //creating button

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnTen.setOnClickListener(this);
        btnDecimel.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSubs.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnCal.setOnClickListener(this);
    }

    private void initView() {
        etFirst = (EditText)findViewById(R.id.etView);

        //Number buttons

        btnOne = (Button)findViewById(R.id.but1);
        btnTwo = (Button)findViewById(R.id.but2);
        btnThree = (Button)findViewById(R.id.but3);
        btnFour = (Button)findViewById(R.id.but4);
        btnFive = (Button)findViewById(R.id.but5);
        btnSix = (Button)findViewById(R.id.but6);
        btnSeven = (Button)findViewById(R.id.but7);
        btnEight = (Button)findViewById(R.id.but8);
        btnNine = (Button)findViewById(R.id.but9);
        btnTen = (Button)findViewById(R.id.but10);
        btnDecimel = (Button)findViewById(R.id.but11);

        //Operator buttons

        btnAdd = (Button)findViewById(R.id.butAdd);
        btnSubs = (Button)findViewById(R.id.butSubs);
        btnDivide = (Button)findViewById(R.id.butDivide);
        btnMul = (Button)findViewById(R.id.butMul);
        btnCal = (Button)findViewById(R.id.butCal);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.but1:
                str = btnOne.getText().toString();
                total +=str;
                etFirst.setText(total);
                break;
            case R.id.but2:
                String str = btnTwo.getText().toString();
                total +=str;
                etFirst.setText(total);
                break;
            case R.id.but3:
                str = btnThree.getText().toString();
                total +=str;
                etFirst.setText(total);
                break;
            case R.id.but5:
                str  = btnFive.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but6:
                str  = btnSix.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but7:
                str  = btnSeven.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but4:
                str  = btnFour.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but8:
                str  = btnEight.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but9:
                str  = btnNine.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but10:
                str  = btnTen.getText().toString();
                total += str;
                etFirst.setText(total);
                break;
            case R.id.but11:
                str  = btnDecimel.getText().toString();
                total += str;
                etFirst.setText(total);
                break;

            //Creating Operator logic

            case R.id.butAdd:
                firstNumber=Double.parseDouble(total);
                total="";
                String s = btnAdd.getText().toString();
                sign=s;
                etFirst.setText(" ");
                break;
            case R.id.butSubs:
                firstNumber=Double.parseDouble(total);
                total="";
                String s2 = btnSubs.getText().toString();
                sign=s2;
                etFirst.setText(" ");
                break;
            case R.id.butMul:
                firstNumber=Double.parseDouble(total);
                total="";
                String s3 = btnMul.getText().toString();
                sign=s3;
                etFirst.setText(" ");
                break;
            case R.id.butDivide:
                firstNumber=Double.parseDouble(total);
                total="";
                String s4 = btnDivide.getText().toString();
                sign=s4;
                etFirst.setText(" ");
                break;

            case R.id.butCal:
                secondNumber=Double.parseDouble(total);
                if (sign.equals("+")){
                    resValue=firstNumber+secondNumber;
                    etFirst.setText(resValue+"");
                    total="";
                }
                if (sign.equals("-")){
                    resValue=firstNumber-secondNumber;
                    etFirst.setText(resValue+"");
                    total="";
                }
                if (sign.equals("x")){
                    resValue=firstNumber*secondNumber;
                    etFirst.setText(resValue+"");
                    total="";
                }
                if (sign.equals("/")){
                    resValue=firstNumber/secondNumber;
                    etFirst.setText(resValue+"");
                    total="";
                }
                break;

            default:
                break;


        }

    }
}
