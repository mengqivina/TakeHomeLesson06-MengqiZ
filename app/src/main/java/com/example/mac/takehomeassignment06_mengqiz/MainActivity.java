package com.example.mac.takehomeassignment06_mengqiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText amount;
    private EditText tax;
    private EditText tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.amount_field);
        tax = (EditText) findViewById(R.id.tax_field);
        tip = (EditText) findViewById(R.id.tip_field);
    }

    public void submit(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String amountString = amount.getText().toString();
        String taxString = tax.getText().toString();
        String tipString = tip.getText().toString();
        // pass a String to the second activity
        intent.putExtra("KEY_STRING", amountString);
        intent.putExtra("KEY_STRING2", taxString);
        intent.putExtra("KEY_STRING3", tipString);
        startActivity(intent);
    }
}
