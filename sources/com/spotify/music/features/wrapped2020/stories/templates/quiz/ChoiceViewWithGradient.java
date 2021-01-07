package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class ChoiceViewWithGradient extends ConstraintLayout {
    private final RectF a = new RectF();
    private final Path b = new Path();
    private final WrappedGradientView c;
    private final ChoiceView f;
    private int n;
    private boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChoiceViewWithGradient(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.choice_view_with_gradient, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.gradient_background);
        h.d(G, "requireViewById(this, R.id.gradient_background)");
        this.c = (WrappedGradientView) G;
        View G2 = q4.G(this, C0707R.id.choice_view);
        h.d(G2, "requireViewById(this, R.id.choice_view)");
        this.f = (ChoiceView) G2;
    }

    private final float K(int i) {
        Context context = getContext();
        h.d(context, "context");
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        return ((float) i) * resources.getDisplayMetrics().density;
    }

    public final void C() {
        this.o = true;
    }

    public final void D() {
        this.n++;
    }

    public final void E(a aVar, int i, int i2) {
        h.e(aVar, "choice");
        setEnabled(true);
        this.c.setVisibility(8);
        this.f.C(aVar, i, i2);
    }

    public final void G() {
        this.c.setVisibility(0);
        this.c.a().start();
    }

    public final void J() {
        this.c.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.set(0.0f, 0.0f, (float) i, (float) i2);
        Path path = this.b;
        path.reset();
        path.addRoundRect(this.a, K(8), K(8), Path.Direction.CW);
        path.close();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h.e(motionEvent, "event");
        if (motionEvent.getAction() == 0 && this.n == 0 && this.o) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(wz8.g(this.f, 0.9f, 0.9f, 100, 0, 16), wz8.e(this.f, 0.64f, 100, 0, 8), wz8.g(this.c, 0.9f, 0.9f, 100, 0, 16), wz8.e(this.c, 0.64f, 100, 0, 8));
            animatorSet.start();
            this.n = 1;
        } else if (motionEvent.getAction() == 1 && this.n == 1 && this.o) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(wz8.g(this.f, 1.0f, 1.0f, 100, 0, 16), wz8.e(this.f, 1.0f, 100, 0, 8), wz8.g(this.c, 1.0f, 1.0f, 100, 0, 16), wz8.e(this.c, 1.0f, 100, 0, 8));
            animatorSet2.start();
            this.f.setClickable(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChoiceViewWithGradient(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.choice_view_with_gradient, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.gradient_background);
        h.d(G, "requireViewById(this, R.id.gradient_background)");
        this.c = (WrappedGradientView) G;
        View G2 = q4.G(this, C0707R.id.choice_view);
        h.d(G2, "requireViewById(this, R.id.choice_view)");
        this.f = (ChoiceView) G2;
    }
}
