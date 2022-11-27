package com.example.baitapcanhan.baitap2.bai3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baitapcanhan.R;

import java.util.Date;

public class BaiTap2Bai3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baitap2_activity_bai3);
        AlertDialog.Builder al = new AlertDialog.Builder(this);
        findViewById(R.id.getDate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date time = new Date();
                al.setTitle("Thoi gian hien tai: ").setMessage(time.toString());
                al.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}