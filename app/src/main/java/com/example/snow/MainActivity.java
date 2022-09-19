package com.example.snow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tvres;
    EditText et1,et2;
    CheckBox cb1; //checkbox
    Button bt1; //login button
    String st;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        et1=findViewById(R.id.et1);
        tvres=findViewById(R.id.tvres);
        bt1=findViewById(R.id.bt1);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Home.class);
                st=et1.getText().toString();
                intent.putExtra("value",st);

                startActivity(intent);

            }
        });

    }

}