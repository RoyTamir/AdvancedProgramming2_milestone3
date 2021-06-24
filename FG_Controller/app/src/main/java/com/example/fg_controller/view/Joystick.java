package com.example.fg_controller.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import org.w3c.dom.Attr;

public class Joystick extends View {

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

    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(Color.BLUE);

        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(Color.BLACK);
        canvas.drawCircle(250, 250, 100, paint);
    }
}
