package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: d64  reason: default package */
public class d64 {
    private final Drawable a;
    private ValueAnimator b;

    public d64(Drawable drawable) {
        this.a = drawable;
    }

    public void a() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
    }

    public ValueAnimator b() {
        return this.b;
    }

    public /* synthetic */ void c(ValueAnimator valueAnimator) {
        this.a.invalidateSelf();
    }

    public void d(boolean z) {
        a();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        ofFloat.setDuration(400L);
        this.b.setInterpolator(ta0.b);
        this.b.addUpdateListener(new b64(this));
        if (z) {
            this.b.start();
        } else {
            this.b.end();
        }
        this.a.invalidateSelf();
    }
}
