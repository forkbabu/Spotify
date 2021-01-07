package defpackage;

import android.view.animation.Interpolator;

/* renamed from: po8  reason: default package */
public class po8 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        double d = (double) f;
        Double.isNaN(d);
        double pow = Math.pow(2.0d, -10.0d * d);
        Double.isNaN(d);
        return (float) ((Math.sin(((d - 0.1875d) * 6.283185307179586d) / 0.75d) * pow) + 1.0d);
    }
}
