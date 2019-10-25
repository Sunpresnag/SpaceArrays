package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket {
    float x, y, vx, vy;
    Bitmap image;
    Rocket(float x, float y, Bitmap image) {
        this.x = x;
        this.y = y;
        this.vx = (float)(Math.random() * 0.5 - 1);
        this.vy = (float)(Math.random() * 0.5 - 1);
        this.image = image;
    }
    void move() {
        this.x += this.vx;
        this.y += this.vy;
    }
    Paint paint = new Paint();
    void draw(Canvas canvas)
    {
        Matrix matrix = new Matrix();
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(image, matrix, paint);
    }
}
