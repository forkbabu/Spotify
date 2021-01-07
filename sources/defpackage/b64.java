package defpackage;

import android.animation.ValueAnimator;

/* renamed from: b64  reason: default package */
public final /* synthetic */ class b64 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ d64 a;

    public /* synthetic */ b64(d64 d64) {
        this.a = d64;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c(valueAnimator);
    }
}
