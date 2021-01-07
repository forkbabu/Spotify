package com.spotify.music.carmode.navigation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class PulsatingView extends View {
    private final Paint a;
    private final float b;
    private float c;
    private float f;
    private final List<b> n;
    private Animator o;
    private boolean p;

    /* access modifiers changed from: package-private */
    /* compiled from: java-style lambda group */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public a(int i, Object obj, Object obj2) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i = this.a;
            if (i == 0) {
                b bVar = (b) this.c;
                float f = ((PulsatingView) this.b).b;
                h.d(valueAnimator, "scaleAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    bVar.d(((Float) animatedValue).floatValue() * f);
                    ((PulsatingView) this.b).postInvalidate();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            } else if (i == 1) {
                b bVar2 = (b) this.c;
                h.d(valueAnimator, "alphaAnimator");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    bVar2.c(((Integer) animatedValue2).intValue());
                    ((PulsatingView) this.b).postInvalidate();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        private int a;
        private float b;

        public b() {
            this(0, 0.0f, 3);
        }

        public b(int i, float f) {
            this.a = i;
            this.b = f;
        }

        public final int a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final void c(int i) {
            this.a = i;
        }

        public final void d(float f) {
            this.b = f;
        }

        public b(int i, float f, int i2) {
            i = (i2 & 1) != 0 ? 0 : i;
            f = (i2 & 2) != 0 ? 0.0f : f;
            this.a = i;
            this.b = f;
        }
    }

    public PulsatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Animator e(b bVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.7f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(450L);
        ofFloat.addUpdateListener(new a(0, this, bVar));
        ValueAnimator ofInt = ValueAnimator.ofInt((int) 102.0f, 0);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(550L);
        ofInt.addUpdateListener(new a(1, this, bVar));
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.setDuration(550L);
        return animatorSet;
    }

    public final void f() {
        Animator animator;
        setVisibility(8);
        this.p = true;
        Animator animator2 = this.o;
        if (!(animator2 == null || !animator2.isStarted() || (animator = this.o) == null)) {
            animator.cancel();
        }
        this.o = null;
    }

    public final void g() {
        setVisibility(0);
        this.p = false;
        b bVar = new b(0, 0.0f, 3);
        b bVar2 = new b(0, 0.0f, 3);
        float f2 = this.b;
        Context context = getContext();
        h.d(context, "context");
        b bVar3 = new b(BitmapRenderer.ALPHA_VISIBLE, f2 + ((float) nud.g(1.0f, context.getResources())));
        List<b> list = this.n;
        list.clear();
        list.add(bVar2);
        list.add(bVar);
        list.add(bVar3);
        Animator e = e(bVar);
        Animator e2 = e(bVar2);
        e2.setStartDelay(250);
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(1500);
        animatorSet.playTogether(e, e2);
        animatorSet.addListener(new i(animatorSet, this, e, e2));
        animatorSet.start();
        this.o = animatorSet;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        for (T t : this.n) {
            this.a.setAlpha(t.a());
            canvas.drawCircle(this.c, this.f, t.b(), this.a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = ((float) i2) / 2.0f;
        this.c = ((float) i) / 2.0f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PulsatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(androidx.core.content.a.b(context, R.color.green_light));
        this.a = paint;
        this.b = ((float) context.getResources().getDimensionPixelSize(C0707R.dimen.voice_search_button_size)) / 2.0f;
        this.n = new ArrayList();
    }
}
