package com.spotify.libs.nudges;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class NudgeContentView extends ConstraintLayout {
    private cmf<f> a;
    private GestureDetector b;

    private final class a extends GestureDetector.SimpleOnGestureListener {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            h.e(motionEvent, "e1");
            h.e(motionEvent2, "e2");
            if (motionEvent2.getY() - motionEvent.getY() <= 80.0f) {
                return false;
            }
            cmf cmf = NudgeContentView.this.a;
            if (cmf == null) {
                return true;
            }
            f fVar = (f) cmf.invoke();
            return true;
        }
    }

    public NudgeContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h.e(motionEvent, "ev");
        this.b.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnSwipeDownListener(cmf<f> cmf) {
        h.e(cmf, "listener");
        this.a = cmf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NudgeContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.b = new GestureDetector(context, new a());
    }
}
