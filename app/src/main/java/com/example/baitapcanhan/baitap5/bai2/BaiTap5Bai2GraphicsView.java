package com.example.baitapcanhan.baitap5.bai2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

public class BaiTap5Bai2GraphicsView extends View {

    int x = 0, y = 0, d = 200, r =100;


    public BaiTap5Bai2GraphicsView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(x != 0 || y != 0) {
            int right = x + d;
            int bottom = y + r;

            Rect rect =  new Rect(x, y , right, bottom);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.RED);
            canvas.drawRect(rect, paint);
        }
        invalidate();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

            x = (int) event.getX();
            y= (int) event.getY();
        return super.onTouchEvent(event);
    }
}
