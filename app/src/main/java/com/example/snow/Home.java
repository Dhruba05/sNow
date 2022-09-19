package com.example.snow;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Home extends AppCompatActivity {
    TextView tvres;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvres=findViewById(R.id.tvres);
        st1=getIntent().getExtras().getString("value");
        tvres.setText(st1);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));







    }
}