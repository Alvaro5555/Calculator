package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean dec = false;
    boolean sum = false;
    boolean rest = false;
    boolean multi = false;
    boolean div = false;
    Double[] num = new Double[20];
    Double valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button buttonCom = (Button) findViewById(R.id.button10);
        buttonCom.setOnClickListener(this);
        Button buttonSum = (Button) findViewById(R.id.button11);
        buttonSum.setOnClickListener(this);
        Button buttonRest = (Button) findViewById(R.id.button12);
        buttonRest.setOnClickListener(this);
        Button buttonDiv = (Button) findViewById(R.id.button13);
        buttonDiv.setOnClickListener(this);
        Button buttonMult = (Button) findViewById(R.id.button14);
        buttonMult.setOnClickListener(this);
        Button buttonSin = (Button) findViewById(R.id.button15);
        buttonSin.setOnClickListener(this);
        Button buttonCos = (Button) findViewById(R.id.button16);
        buttonCos.setOnClickListener(this);
        Button buttonTan = (Button) findViewById(R.id.button17);
        buttonTan.setOnClickListener(this);
        Button buttonEqual = (Button) findViewById(R.id.button19);
        buttonEqual.setOnClickListener(this);
        Button buttonAC = (Button) findViewById(R.id.button18);
        buttonAC.setOnClickListener(this);

    }

    public void onClick(View view) {
        TextView screen = (TextView) findViewById(R.id.textView);
        int select = view.getId();
        String x = screen.getText().toString();

        try {
            switch (select) {
                case R.id.button0:
                    screen.setText(x + "0");
                    break;
                case R.id.button1:
                    screen.setText(x + "1");
                    break;
                case R.id.button2:
                    screen.setText(x + "2");
                    break;
                case R.id.button3:
                    screen.setText(x + "3");
                    break;
                case R.id.button4:
                    screen.setText(x + "4");
                    break;
                case R.id.button5:
                    screen.setText(x + "5");
                    break;
                case R.id.button6:
                    screen.setText(x + "6");
                    break;
                case R.id.button7:
                    screen.setText(x + "7");
                    break;
                case R.id.button8:
                    screen.setText(x + "8");
                    break;
                case R.id.button9:
                    screen.setText(x + "9");
                    break;
                case R.id.button10: //Decimal
                    if (dec == false) {
                        screen.setText(x + ".");
                        dec = true;
                    } else return;
                    break;
                case R.id.button11:
                    sum = true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    break;
                case R.id.button12:
                    rest = true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    break;
                case R.id.button13:
                    multi = true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    break;
                case R.id.button14:
                    div = true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    break;
                case R.id.button15:
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    valor = Math.sin(Math.toRadians(num[0]));
                    screen.setText(String.valueOf(valor));
                    break;
                case R.id.button16:
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    valor = Math.cos(Math.toRadians(num[0]));
                    screen.setText(String.valueOf(valor));
                    break;
                case R.id.button17:
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    dec = false;
                    valor = Math.tan(Math.toRadians(num[0]));
                    screen.setText(String.valueOf(valor));
                    break;
                case R.id.button18:
                    screen.setText("");
                    dec = false;
                    break;
                case R.id.button19:
                    num[1] = Double.parseDouble(x);
                    if (sum == true) {
                        valor = num[0] + num[1];
                        screen.setText(String.valueOf(valor));
                    } else if (rest == true) {
                        valor = num[0] - num[1];
                        screen.setText(String.valueOf(valor));
                    } else if (multi == true) {
                        valor = num[0] * num[1];
                        screen.setText(String.valueOf(valor));
                    } else if (div == true) {
                        valor = num[0] / num[1];
                        screen.setText(String.valueOf(valor));
                    }
                    dec = false;
                    sum = false;
                    div = false;
                    multi = false;
                    rest = false;
                    break;
            }

        }catch (Exception e) {
            screen.setText("");
        }



    }


}



