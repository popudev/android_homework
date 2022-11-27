package com.example.baitapcanhan.baitap5.bai3;

import android.app.Activity;
import android.os.Bundle;

import com.example.baitapcanhan.baitap5.bai2.BaiTap5Bai2GraphicsView;

public class BaiTap5Bai3Graphics extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new BaiTap5Bai3GraphicsView(this));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
