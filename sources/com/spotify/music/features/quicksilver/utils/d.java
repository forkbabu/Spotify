package com.spotify.music.features.quicksilver.utils;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;

public class d extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    private final View a;
    private final c4 b;
    private final int c;
    private final a f;
    private float n;
    private float o;
    private float p;

    public interface a {
    }

    public d(View view, a aVar, int i) {
        this.a = view;
        this.f = aVar;
        this.b = new c4(view.getContext(), this);
        this.c = i;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        if (f3 < 400.0f || rawY < 200.0f) {
            return false;
        }
        this.a.animate().translationY(((Math.abs(f3) * rawY) / 100.0f) + this.a.getTranslationY()).setDuration(300).start();
        Handler handler = new Handler();
        a aVar = this.f;
        aVar.getClass();
        handler.postDelayed(new a(aVar), 300);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b.a(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n = motionEvent.getRawY();
            this.p = this.a.getY();
            return true;
        } else if (action == 1) {
            if (this.o > ((float) this.c)) {
                ((g08) this.f).a.k();
            } else {
                this.a.animate().setInterpolator(new OvershootInterpolator()).y(this.p).rotation(0.0f).setDuration(300).start();
            }
            this.o = 0.0f;
            this.p = 0.0f;
            return true;
        } else if (action != 2) {
            return false;
        } else {
            this.o = motionEvent.getRawY() - this.n;
            this.a.setTranslationX(0.0f);
            View view2 = this.a;
            float f2 = this.o;
            view2.setY(f2 > 0.0f ? this.p + f2 : this.p);
            this.a.setRotation(0.0f);
            return true;
        }
    }
}
