package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: ojf  reason: default package */
public class ojf {
    private final Drawable a;
    private ValueAnimator b;

    public ojf(Drawable drawable) {
        this.a = drawable;
    }

    public ValueAnimator a() {
        return this.b;
    }

    public /* synthetic */ void b(ValueAnimator valueAnimator) {
        this.a.invalidateSelf();
    }

    public void c(boolean z) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.setDuration(400L);
        this.b.setInterpolator(ta0.b);
        this.b.addUpdateListener(new mjf(this));
        if (z) {
            this.b.start();
        } else {
            this.b.end();
        }
        this.a.invalidateSelf();
    }
}
