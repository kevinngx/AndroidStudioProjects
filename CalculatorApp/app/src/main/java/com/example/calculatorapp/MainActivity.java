package com.example.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText result;
    private EditText newNumber;
    private TextView displayOperation;

    // Variables to hold the operands and type of calculation
    private Double operand1 = null;
    private Double operand2 = null;
    private String pendingOperation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText) findViewById(R.id.result);
        newNumber = (EditText) findViewById(R.id.newNumber);
        displayOperation = (TextView) findViewById(R.id.displayOperation);

        // OnClickListener for numbers
        View.OnClickListener numberListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                newNumber.append(b.getText().toString());
            }
        };

        Button[] buttons = new Button[10];
        for (int i = 0; i < buttons.length; i++) {

            String buttonID = "button" + i;
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());

            buttons[i] = (Button) findViewById(resID);
            buttons[i].setOnClickListener(numberListener);

        }

        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);

        Button buttonDecimal = (Button) findViewById(R.id.buttonDot);
        buttonDecimal.setOnClickListener(numberListener);

        // Create OnClickListener for operation buttons --> wil
        View.OnClickListener operationListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                String operation = b.getText().toString();
                String value = newNumber.getText().toString();
                if (value.length() != 0) {
                    performOperation(value, operation);
                }
                pendingOperation = operation;
                displayOperation.setText(pendingOperation);

            }
        };

        // Set operation Listener for operation buttons
        buttonEquals.setOnClickListener(operationListener);
        buttonDivide.setOnClickListener(operationListener);
        buttonMultiply.setOnClickListener(operationListener);
        buttonMinus.setOnClickListener(operationListener);
        buttonPlus.setOnClickListener(operationListener);

        /*
        // Setup clear button
        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        View.OnClickListener clearListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                newNumber.setText("");
                displayOperation.setText("cleard!");
                operand1 = null;
                operand2 = null;
                pendingOperation = "=";
            }
        };
        buttonClear.setOnClickListener(clearListener);

        //Setup specialButton
        Button specialButton = (Button) findViewById(R.id.specialButton);
        View.OnClickListener specialListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.secretText);
                tv.setText("Tina is a basic LG\n(I told you not to press the button)");
            }
        };
        specialButton.setOnClickListener(specialListener);
        */

    }


    private void performOperation(String value, String operation) {
        if (operand1 == null) {
            operand1 = Double.valueOf(value);
        } else {
            operand2 = Double.valueOf(value);

            if (pendingOperation == "=") {
                pendingOperation = operation;
            }
            calculate(operation);
        }

        result.setText(operand1.toString());
        newNumber.setText("");

    }

    private void calculate(String operation) {
        switch(operation) {
            case "=": operand1 = operand2;
                break;
            case "+": operand1 += operand2;
                break;
            case "-": operand1 -= operand2;
                break;
            case "*": operand1 *= operand2;
                break;
            case "/": if (operand2 == 0) {
                operand1 = 0.0;
            } else {
                operand1 /= operand2;
            }
                break;
        }
    }

}
