package com.spotify.music.features.login.startview;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.h;

public abstract class l implements View.OnTouchListener {
    private final GestureDetector a;

    private final class a extends GestureDetector.SimpleOnGestureListener {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            h.e(motionEvent, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            h.e(motionEvent, "e1");
            h.e(motionEvent2, "e2");
            float y = motionEvent2.getY() - motionEvent.getY();
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > Math.abs(y)) {
                float f3 = (float) 100;
                if (Math.abs(x) > f3 && Math.abs(f) > f3) {
                    if (x > ((float) 0)) {
                        ((o) l.this).b.g.b();
                        return true;
                    }
                    ((o) l.this).b.g.b();
                    return true;
                }
            } else {
                float f4 = (float) 100;
                if (Math.abs(y) > f4 && Math.abs(f2) > f4) {
                    if (y > ((float) 0)) {
                        ((o) l.this).b.g.b();
                        return true;
                    }
                    ((o) l.this).b.g.b();
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            h.e(motionEvent, "e");
            ((o) l.this).b.g.c();
            super.onLongPress(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            h.e(motionEvent, "e");
            ((o) l.this).b.g.c();
            return super.onSingleTapUp(motionEvent);
        }
    }

    public l(Context context) {
        h.e(context, "context");
        this.a = new GestureDetector(context, new a());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        h.e(view, "view");
        h.e(motionEvent, "event");
        return this.a.onTouchEvent(motionEvent);
    }
}
