package com.example.user.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText etName1,etName2;
    Button btn1,btn2,btn3,btn4,btn5;
    TextView tvName;
    int num1,num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("=초간단계산기=");

        etName1 =(EditText) findViewById(R.id.etName1);
        num1 = Integer.parseInt(etName1.toString());
        etName2 =(EditText) findViewById(R.id.etName2);
        num2 = Integer.parseInt(etName2.toString());
        result = num1 + num2;
        result = num1 - num2;
        result = num1 * num2;
        result = num1 / num2;
        result = num1 % num2;

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        tvName =(TextView) findViewById(R.id.tvName);

    }
}
