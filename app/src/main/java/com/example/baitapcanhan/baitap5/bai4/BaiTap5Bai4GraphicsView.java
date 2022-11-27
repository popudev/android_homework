package com.example.baitapcanhan.baitap5.bai4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

import com.example.baitapcanhan.R;

public class BaiTap5Bai4GraphicsView extends View {

    int x = 0, y = 0, d = 200, r = 100;
    Bitmap[] frames = new Bitmap[13];
    int i = 0;
    long last_tick = 0;
    long period = 80;
    Context ctext;

    public BaiTap5Bai4GraphicsView(Context context, MediaPlayer mPlayer) {
        super(context);
        ctext = context;
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_00);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_01);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_02);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_03);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_04);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_05);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_06);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_07);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_08);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_09);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_10);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_11);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.frame_12);


        mPlayer.start();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (i < 13) {
            long time = System.currentTimeMillis() - last_tick;
            if(time >= period) {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], -200, 50, new Paint());
                i++;
                postInvalidate();
            } else {
                canvas.drawBitmap(frames[i], -200, 50, new Paint());
                postInvalidate();
            }

        } else {
            i=0;
            postInvalidate();
        }
    }

}
