package com.example.c11200027_bertrandogunawan_ninebutton_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv;
    int res, temp1 = 0, temp2 = 0;
    int co =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        tv = (TextView)findViewById(R.id.mytextView);
        Random r = new Random();
        int i1 = r.nextInt(10-1)+1;
        String s = String.valueOf(i1);
        b1.setText(s);
        int i2 = r.nextInt(10-1)+1;
        String s1 = String.valueOf(i2);
        b2.setText(s1);
        int i3 = r.nextInt(10-1)+1;
        String s2 = String.valueOf(i3);
        b3.setText(s2);
        int i4 = r.nextInt(10-1)+1;
        String s3 = String.valueOf(i4);
        b4.setText(s3);
        int i5 = r.nextInt(10-1)+1;
        String s4 = String.valueOf(i5);
        b5.setText(s4);
        int i6 = r.nextInt(10-1)+1;
        String s5 = String.valueOf(i6);
        b6.setText(s5);
        int i7 = r.nextInt(10-1)+1;
        String s6 = String.valueOf(i7);
        b7.setText(s6);
        int i8 = r.nextInt(10-1)+1;
        String s7 = String.valueOf(i8);
        b8.setText(s7);
        int i9 = r.nextInt(10-1)+1;
        String s8 = String.valueOf(i9);
        b9.setText(s8);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b1.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b1.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b2.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b2.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b3.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b3.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b4.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b4.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b5.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b5.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b6.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b6.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b7.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b7.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b8.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b8.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(co == 0){
                    temp1 = Integer.valueOf(b9.getText().toString());
                    tv.setText(String.valueOf(temp1));
                    co++;
                }
                else{
                    temp2 = Integer.valueOf(b9.getText().toString());
                    res = temp1 + temp2;
                    temp1 = res;
                    temp2 = 0;
                    tv.setText(String.valueOf(res));
                }
            }
        });
    }
}
