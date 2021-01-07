package com.spotify.music.features.ads.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;

public class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    private final View a;
    private final c4 b;
    private final AbstractC0214b c;
    private float f;
    private float n;
    private float o;
    private float p;
    private final float q;
    private final Animator.AnimatorListener r = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.c.j1();
        }
    }

    /* renamed from: com.spotify.music.features.ads.ui.b$b  reason: collision with other inner class name */
    public interface AbstractC0214b {
        void M0(int[] iArr);

        void j1();

        void m();

        void s();
    }

    public static class c implements AbstractC0214b {
    }

    public b(View view, AbstractC0214b bVar) {
        this.a = view;
        this.q = ((float) view.getContext().getResources().getDisplayMetrics().widthPixels) / 3.0f;
        this.c = bVar;
        this.b = new c4(view.getContext(), this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        float max = Math.max(Math.abs(f2), Math.abs(f3));
        float max2 = Math.max(Math.abs(rawX), Math.abs(rawY));
        if (max < 400.0f || max2 < 200.0f) {
            return false;
        }
        float abs = ((Math.abs(f2) * rawX) / 100.0f) + this.a.getTranslationX();
        this.a.animate().translationX(abs).translationY(((Math.abs(f3) * rawY) / 100.0f) + this.a.getTranslationY()).setDuration(300).setListener(this.r).start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.c.M0(new int[]{Math.round(motionEvent.getX()), Math.round(motionEvent.getY())});
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b.a(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c.s();
            this.f = motionEvent.getRawX();
            this.n = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            this.c.m();
            float f2 = this.o;
            float f3 = this.p;
            if (Math.sqrt((double) ((f3 * f3) + (f2 * f2))) > ((double) this.q)) {
                this.c.j1();
            } else {
                this.a.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300).start();
            }
            this.o = 0.0f;
            this.p = 0.0f;
            return true;
        } else if (action != 2) {
            return false;
        } else {
            this.o = motionEvent.getRawX() - this.f;
            this.p = motionEvent.getRawY() - this.n;
            this.a.setTranslationX(this.o);
            this.a.setTranslationY(this.p);
            this.a.setRotation(this.o / 30.0f);
            return true;
        }
    }
}
