package com.spotify.music.features.fullscreen.story;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class FullscreenStoryTouchListener extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    private final qg0<TouchEvent> a;
    private final c4 b;
    private final float c;
    private boolean f;

    public enum TouchEvent {
        LEFT_HALF_SCREEN_CLICK,
        RIGHT_HALF_SCREEN_CLICK,
        LONG_PRESS,
        LONG_PRESS_RELEASED
    }

    public FullscreenStoryTouchListener(Context context, DisplayMetrics displayMetrics, qg0<TouchEvent> qg0) {
        this.a = qg0;
        displayMetrics.getClass();
        this.c = ((float) displayMetrics.widthPixels) * 0.3f;
        context.getClass();
        this.b = new c4(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        TouchEvent touchEvent = motionEvent.getRawX() < this.c ? TouchEvent.LEFT_HALF_SCREEN_CLICK : TouchEvent.RIGHT_HALF_SCREEN_CLICK;
        this.a.accept(touchEvent);
        this.a.accept(touchEvent);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f = true;
        this.a.accept(TouchEvent.LONG_PRESS);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.accept(motionEvent.getRawX() < this.c ? TouchEvent.LEFT_HALF_SCREEN_CLICK : TouchEvent.RIGHT_HALF_SCREEN_CLICK);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && this.f) {
            this.f = false;
            this.a.accept(TouchEvent.LONG_PRESS_RELEASED);
        }
        return this.b.a(motionEvent);
    }
}
