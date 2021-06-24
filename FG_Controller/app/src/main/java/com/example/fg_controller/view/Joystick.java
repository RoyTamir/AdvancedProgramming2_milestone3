package com.example.fg_controller.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import org.w3c.dom.Attr;

public class Joystick extends View {

    private float X, Y;

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
        X = 270;
        Y = 270;
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(Color.BLUE);

        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(Color.BLACK);
        canvas.drawCircle(X, Y, 100, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        int eventAction = e.getAction();

        // you may need the x/y location
        float x = e.getX();
        float y = e.getY();

        // put your code in here to handle the event
        switch (eventAction) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                X = x;
                Y = y;
                break;
            case MotionEvent.ACTION_UP:
                X = 270;
                Y = 270;
                break;
        }

        // tell the View to redraw the Canvas
        invalidate();

        // tell the View that we handled the event
        return true;
    }
}
