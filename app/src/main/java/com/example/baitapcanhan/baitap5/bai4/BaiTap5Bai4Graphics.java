package com.example.baitapcanhan.baitap5.bai4;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.baitapcanhan.R;
import com.example.baitapcanhan.baitap5.bai3.BaiTap5Bai3GraphicsView;

public class BaiTap5Bai4Graphics extends Activity {
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = MediaPlayer.create(this, R.raw.gangnam);
        setContentView(new BaiTap5Bai4GraphicsView(this, mPlayer));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mPlayer.release();
        finish();
    }
}
