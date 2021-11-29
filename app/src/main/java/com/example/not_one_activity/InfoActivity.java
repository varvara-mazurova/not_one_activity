package com.example.not_one_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView tv_12, tv_14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        tv_12 = findViewById(R.id.textView12);
        tv_14 = findViewById(R.id.textView14);
        double sum = 0;
        double sum_2022 = 0;

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String start_money_string = bundle.get("aaa").toString();
            Integer start_money = Integer.valueOf(start_money_string);
            String year_string = bundle.get("bbb").toString();
            Integer year = Integer.valueOf(year_string);
            String month_pay_string = bundle.get("ccc").toString();
            Integer month_pay = Integer.valueOf(month_pay_string);
            sum = ((start_money+month_pay*year*12) * 1.3);
            sum_2022 = ((start_money+month_pay*1*12) * 1.3);
            tv_12.setText(sum + "p");
            tv_14.setText(sum_2022 + "p");
        }
    }
}