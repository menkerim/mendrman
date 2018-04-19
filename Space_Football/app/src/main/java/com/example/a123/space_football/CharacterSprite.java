package com.example.a123.space_football;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;

public class CharacterSprite {
    public Bitmap image;
    public int x,y;
    private int xVelocity = 10;
    private int yVelocity = 5;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    public CharacterSprite(Bitmap bmp) {
        image = bmp;
    }


    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public  void  update()
    {
        x += xVelocity;
        y += yVelocity;
        if ((x > screenWidth - image.getWidth()) || (x < 0)) {
            xVelocity = xVelocity * -1;
        }
        if ((y > screenHeight - image.getHeight()) || (y < 0)) {
            yVelocity = yVelocity * -1;
        }
    }
}