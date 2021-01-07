package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: rz8  reason: default package */
final class rz8 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ sz8 a;

    rz8(sz8 sz8) {
        this.a = sz8;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vz8 vz8 = this.a.j;
        if (vz8 != null) {
            View g = vz8.g();
            sz8 sz8 = this.a;
            h.d(valueAnimator, "it");
            g.setScaleX(sz8.l(sz8, valueAnimator, vz8.f().getWidth(), vz8.g().getWidth()));
            vz8.g().setScaleY(sz8.l(this.a, valueAnimator, (int) (((float) vz8.f().getHeight()) * 1.025f), vz8.g().getHeight()));
        }
    }
}
