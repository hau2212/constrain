package com.example.constrain;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    EditText MaxNumber, MinNumber;
    Button mClickhienthi, mclickhienThi2;
    TextView hienThiketqua;
    int ngauNhien;

    //bien


    String string;
    Random random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickhienthi = findViewById(R.id.clickok);
        mclickhienThi2 = findViewById(R.id.clickrest);
        hienThiketqua = findViewById(R.id.hienThi1);
        MinNumber = findViewById(R.id.Min);
        MaxNumber = findViewById(R.id.Max);

        mClickhienthi.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View v) {
                change();
                hienThiketqua.setText(String.valueOf(ngauNhien));


            }
        });


    }

    //////////////////////////////////////ham///////////////////////////
    private void change() {
        String max = MaxNumber.getText().toString();
        String min = MinNumber.getText().toString();
        int sMin = Integer.parseInt(String.valueOf(min));
        int sMax = Integer.parseInt(String.valueOf(max));
        if (min.length() == 0 || max.length() == 0) {
            Toast.makeText(MainActivity.this, "chua du thong tin ", Toast.LENGTH_SHORT).show();
        }
        if (sMin > sMax) {

            sMax = sMin + 1;


            random = new Random();
            ngauNhien = random.nextInt((sMax - sMin) + 1) + sMin;
        }
    }


}
