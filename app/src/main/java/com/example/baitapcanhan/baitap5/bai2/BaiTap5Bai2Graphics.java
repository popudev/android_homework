package com.example.baitapcanhan.baitap5.bai2;

import android.app.Activity;
import android.os.Bundle;

public class BaiTap5Bai2Graphics extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new BaiTap5Bai2GraphicsView(this));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
