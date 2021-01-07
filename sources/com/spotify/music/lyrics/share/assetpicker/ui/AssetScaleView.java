package com.spotify.music.lyrics.share.assetpicker.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.h;

public final class AssetScaleView extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private View.OnClickListener a;
    private c4 b;
    private float c;
    private float f;
    private float n;
    private float o;
    private float p;
    private float q;
    private boolean r;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnTouchListener {
        final /* synthetic */ AssetScaleView a;

        a(AssetScaleView assetScaleView) {
            this.a = assetScaleView;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h.e(view, "<anonymous parameter 0>");
            h.e(motionEvent, "event");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.a.c = motionEvent.getX();
                this.a.f = motionEvent.getY();
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    AssetScaleView.a(this.a, motionEvent);
                } else if (actionMasked == 3) {
                    AssetScaleView.e(this.a);
                }
            } else if (this.a.r) {
                AssetScaleView.f(this.a);
            }
            AssetScaleView.b(this.a).a(motionEvent);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssetScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        i();
    }

    public static final void a(AssetScaleView assetScaleView, MotionEvent motionEvent) {
        assetScaleView.getClass();
        assetScaleView.n = motionEvent.getX();
        float y = motionEvent.getY();
        assetScaleView.o = y;
        float f2 = assetScaleView.n - assetScaleView.c;
        assetScaleView.p = f2;
        float f3 = y - assetScaleView.f;
        assetScaleView.q = f3;
        float f4 = (float) 2;
        if (f2 > f4 || f3 > f4) {
            assetScaleView.k();
        }
    }

    public static final /* synthetic */ c4 b(AssetScaleView assetScaleView) {
        c4 c4Var = assetScaleView.b;
        if (c4Var != null) {
            return c4Var;
        }
        h.k("gestureDetectorCompat");
        throw null;
    }

    public static final void e(AssetScaleView assetScaleView) {
        assetScaleView.r = false;
        assetScaleView.k();
    }

    public static final void f(AssetScaleView assetScaleView) {
        assetScaleView.k();
        assetScaleView.r = false;
        assetScaleView.getHandler().postDelayed(new a(assetScaleView), 200);
    }

    private final void j() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 0.95f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 0.95f);
        h.d(ofFloat, "scaleDownX");
        ofFloat.setDuration(100L);
        h.d(ofFloat2, "scaleDownY");
        ofFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    private final void k() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f);
        h.d(ofFloat, "scaleUpX");
        ofFloat.setDuration(100L);
        h.d(ofFloat2, "scaleUpY");
        ofFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final void i() {
        new Handler();
        c4 c4Var = new c4(getContext(), this);
        this.b = c4Var;
        if (c4Var != null) {
            c4Var.b(this);
            setOnTouchListener(new a(this));
            return;
        }
        h.k("gestureDetectorCompat");
        throw null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.r = true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        j();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        k();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        j();
        getHandler().postDelayed(new a(this), 200);
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssetScaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        i();
    }
}
