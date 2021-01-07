package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;

/* renamed from: mg8  reason: default package */
public final /* synthetic */ class mg8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yg8 a;
    public final /* synthetic */ nvd b;
    public final /* synthetic */ ColorDrawable c;
    public final /* synthetic */ int f;

    public /* synthetic */ mg8(yg8 yg8, nvd nvd, ColorDrawable colorDrawable, int i) {
        this.a = yg8;
        this.b = nvd;
        this.c = colorDrawable;
        this.f = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.S(this.b, this.c, this.f, valueAnimator);
    }
}
