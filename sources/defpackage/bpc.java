package defpackage;

import android.animation.ValueAnimator;

/* renamed from: bpc  reason: default package */
public final /* synthetic */ class bpc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ipc a;

    public /* synthetic */ bpc(ipc ipc) {
        this.a = ipc;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidateSelf();
    }
}
