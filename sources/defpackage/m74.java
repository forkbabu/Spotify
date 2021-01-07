package defpackage;

import android.view.animation.Interpolator;

/* renamed from: m74  reason: default package */
public class m74 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f < 0.1f) {
            return 0.0f;
        }
        float f2 = f - 0.1f;
        float f3 = 7000.0f * f2 * f2 * f2 * f2;
        if (f3 > 1.0f) {
            return 1.0f;
        }
        return f3;
    }
}
