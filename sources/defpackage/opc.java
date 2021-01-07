package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import defpackage.npc;

/* access modifiers changed from: package-private */
/* renamed from: opc  reason: default package */
public abstract class opc implements ValueAnimator.AnimatorUpdateListener {
    private final nvd a;

    opc(int i, float f) {
        int i2 = (int) (f * 255.0f);
        this.a = ovd.d(i, Color.argb(0, i2, i2, i2) + i);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((lpc) ((npc.a) this).b).i(this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
