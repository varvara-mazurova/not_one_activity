package com.example.not_one_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private EditText ed_1, ed_2, ed_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBar seekBar = findViewById(R.id.seekBar);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);
        TextView textView_15 = findViewById(R.id.textView15);
        TextView textView_16 = findViewById(R.id.textView16);
        TextView textView_17 = findViewById(R.id.textView17);
        btn.findViewById(R.id.button);
        btn.setOnClickListener(this);
        ed_1.findViewById(R.id.textView15);
        ed_2.findViewById(R.id.textView16);
        ed_3.findViewById(R.id.textView17);






        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView_15.setText(String.valueOf(progress));
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {

                textView_16.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar2) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar2) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar3, int progress, boolean fromUser) {

                textView_17.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar3) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar3) {
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, InfoActivity.class);
            intent.putExtra("aaa", ed_1.getText().toString());
            intent.putExtra("bbb", ed_2.getText().toString());
            intent.putExtra("ccc", ed_3.getText().toString());
            startActivity(intent);
        }
    }
}