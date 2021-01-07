package defpackage;

import android.animation.ValueAnimator;

/* renamed from: xoc  reason: default package */
public final /* synthetic */ class xoc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ apc a;

    public /* synthetic */ xoc(apc apc) {
        this.a = apc;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.J(valueAnimator);
    }
}
