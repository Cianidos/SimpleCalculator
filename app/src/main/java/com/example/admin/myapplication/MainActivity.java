package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_plus = findViewById(R.id.button);
        btn_plus.setOnClickListener(this);
        Button btn_take = findViewById(R.id.button2);
        btn_take.setOnClickListener(this);
        Button btn_multiple = findViewById(R.id.button3);
        btn_multiple.setOnClickListener(this);
        Button btn_divide = findViewById(R.id.button4);
        btn_divide.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView  tv = findViewById(R.id.textView);
        EditText ed1 = findViewById(R.id.editText);
        EditText ed2 = findViewById(R.id.editText2);
        switch (v.getId()){
            case R.id.button :
                tv.setText(String.valueOf(Integer.parseInt( ed1.getText().toString()) + Integer.parseInt( ed2.getText().toString())));
                break;
            case R.id.button2 :
                tv.setText(String.valueOf(Integer.parseInt( ed1.getText().toString()) - Integer.parseInt( ed2.getText().toString())));
                break;
            case R.id.button3 :
                tv.setText(String.valueOf(Integer.parseInt( ed1.getText().toString()) * Integer.parseInt( ed2.getText().toString())));
                break;
            case R.id.button4 :
                tv.setText(String.valueOf(Integer.parseInt( ed1.getText().toString()) / Integer.parseInt( ed2.getText().toString())));
                break;
        }
    }
}
