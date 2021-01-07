package defpackage;

import android.animation.ValueAnimator;

/* renamed from: mjf  reason: default package */
public final /* synthetic */ class mjf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ojf a;

    public /* synthetic */ mjf(ojf ojf) {
        this.a = ojf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(valueAnimator);
    }
}
