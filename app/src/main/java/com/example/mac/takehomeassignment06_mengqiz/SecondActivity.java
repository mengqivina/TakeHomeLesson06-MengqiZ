package com.example.mac.takehomeassignment06_mengqiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private double amount;
    private double tax;
    private double tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent msIntent = getIntent();
        amount = Double.parseDouble(msIntent.getStringExtra("KEY_STRING"));
        tax = Double.parseDouble(msIntent.getStringExtra("KEY_STRING2"));
        tip = Double.parseDouble(msIntent.getStringExtra("KEY_STRING3"));
        TextView printOut = (TextView) findViewById(R.id.print_field);
        printOut.setText(toString());
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public double getTip() {
        return tip;
    }

    public String toString() {
        return "Total : " + amount + "\nSales Tax :" + tax * 100 + "\nTip: " + tip * 100 + "\nGrand Total: " + amount * (1 + tax + tip);
    }
}

