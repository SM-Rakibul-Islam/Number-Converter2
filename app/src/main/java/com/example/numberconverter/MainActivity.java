package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CONVERTER(View v)
    {
        ConstraintLayout cl = (ConstraintLayout)findViewById(R.id.layout1);
        TextView result = (TextView)findViewById(R.id.result);
        EditText textInput = (EditText)findViewById(R.id.editText1);

        String inputValueString = String.valueOf(textInput.getText());
        int inputValueInt = Integer.parseInt(inputValueString);

        RadioButton db = (RadioButton)findViewById(R.id.radioButton1);
        RadioButton bd = (RadioButton)findViewById(R.id.radioButton2);

        if(db.isChecked())
        {
            cl.setBackgroundColor(Color.parseColor("#8BAEB2"));
            result.setText(d2b(inputValueInt) + "");
            db.setChecked(true);
        }
        else
        {
            cl.setBackgroundColor(Color.parseColor("#2C2E57"));
            result.setText(b2d(inputValueString));
            bd.setChecked(true);
        }

    }

    private String b2d(String inputValueString)
    {
        int dec = Integer.parseInt(inputValueString, 2);
        return String.valueOf(dec);
    }
    private String d2b(int inputValueInt)
    {
        String bin = Integer.toBinaryString(inputValueInt);
        return bin;
    }
}