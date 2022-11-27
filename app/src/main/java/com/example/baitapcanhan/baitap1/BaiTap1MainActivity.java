package com.example.baitapcanhan.baitap1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baitapcanhan.R;

public class BaiTap1MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap1_activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
