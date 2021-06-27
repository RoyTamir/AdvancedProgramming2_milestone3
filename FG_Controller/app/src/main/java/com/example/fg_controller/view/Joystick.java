package com.example.fg_controller.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fg_controller.view_model.ViewModel;

import java.lang.Math;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import org.w3c.dom.Attr;

public class Joystick extends View {

    private float X, Y;
    public java.util.function.BiConsumer<Float, Float> onChange;

    public Joystick(Context context) {
        super(context);
        init(null);
    }

    public Joystick(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public Joystick(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public Joystick(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init (@Nullable AttributeSet set) {
        X = 375;
        Y = 375;
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        //canvas.drawColor(Color.BLUE);

        android.graphics.Paint paint = new android.graphics.Paint();

        paint.setColor(Color.GRAY);
        canvas.drawCircle(375, 375, 325, paint);

        paint.setColor(Color.LTGRAY);
        canvas.drawCircle(375, 375, 275, paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(375, 375, 25, paint);
        paint.setStrokeWidth(50);
        canvas.drawLine(375, 375, X, Y, paint);

        paint.setColor(Color.RED);
        canvas.drawCircle(X, Y, 100, paint);
    }

    private double distfromCenter(float x, float y) {
        return Math.sqrt(Math.pow(x - 375, 2) + Math.pow(y - 375, 2));
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public boolean onTouchEvent(MotionEvent e) {
        int eventAction = e.getAction();

        // you may need the x/y location
        float x = e.getX();
        float y = e.getY();
        float dist = (float) distfromCenter(x, y);

        // put your code in here to handle the event
        switch (eventAction) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                if (dist < 275) {
                    X = x;
                    Y = y;
                } else {
                    X = ((x - 375) * 275 / (float) dist) + 375;
                    Y = ((y - 375) * 275 / (float) dist) + 375;
                }
                break;
            case MotionEvent.ACTION_UP:
                X = 375;
                Y = 375;
                break;
        }

        if (onChange != null)
            onChange.accept((X - 375) / 275, (375 - Y) / 275);

        // tell the View to redraw the Canvas
        postInvalidate();

        // tell the View that we handled the event
        return true;
    }
}
