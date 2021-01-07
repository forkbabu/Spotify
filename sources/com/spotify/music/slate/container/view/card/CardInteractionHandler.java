package com.spotify.music.slate.container.view.card;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;

public class CardInteractionHandler extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    private final View a;
    private final c4 b;
    private final b c;
    private float f;
    private float n;
    private float o;
    private float p;
    private final float q;
    private SwipeDirection r;
    private boolean s = true;
    private final Animator.AnimatorListener t = new a();

    public enum SwipeDirection {
        LEFT,
        RIGHT
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CardInteractionHandler.this.c.a(CardInteractionHandler.this.r);
        }
    }

    public interface b {
        void a(SwipeDirection swipeDirection);

        void b();

        void c(double d, float f, SwipeDirection swipeDirection);

        void m();

        void s();
    }

    public static class c implements b {
        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void b() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void c(double d, float f, SwipeDirection swipeDirection) {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void m() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void s() {
        }
    }

    public CardInteractionHandler(View view, b bVar) {
        this.a = view;
        this.q = ((float) view.getContext().getResources().getDisplayMetrics().widthPixels) / 3.0f;
        this.c = bVar;
        this.b = new c4(view.getContext(), this);
    }

    public void c(boolean z) {
        this.s = z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        this.r = rawX < 0.0f ? SwipeDirection.LEFT : SwipeDirection.RIGHT;
        float max = Math.max(Math.abs(f2), Math.abs(f3));
        float max2 = Math.max(Math.abs(rawX), Math.abs(rawY));
        if (max < 400.0f || max2 < 200.0f || !this.s) {
            return false;
        }
        this.a.animate().translationX(((Math.abs(f2) * rawX) / 100.0f) + this.a.getTranslationX()).translationY(((Math.abs(f3) * rawY) / 100.0f) + this.a.getTranslationY()).setDuration(300).setListener(this.t).start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.c.b();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        SwipeDirection swipeDirection = SwipeDirection.LEFT;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
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
            if (Math.sqrt((double) ((f3 * f3) + (f2 * f2))) <= ((double) this.q) || !this.s) {
                this.a.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300).start();
            } else if (this.o < 0.0f) {
                this.c.a(swipeDirection);
            } else {
                this.c.a(swipeDirection2);
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
            float f4 = this.o;
            float f5 = this.p;
            double sqrt = Math.sqrt((double) ((f5 * f5) + (f4 * f4)));
            float f6 = this.q;
            if (sqrt < ((double) f6)) {
                b bVar = this.c;
                if (this.o >= 0.0f) {
                    swipeDirection = swipeDirection2;
                }
                bVar.c(sqrt, f6, swipeDirection);
            }
            return true;
        }
    }
}
