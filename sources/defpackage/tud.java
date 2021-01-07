package defpackage;

import android.view.animation.Interpolator;
import com.google.common.base.MoreObjects;

/* renamed from: tud  reason: default package */
public class tud {
    private final float a;
    private final float b;
    private final Interpolator c;
    private final float d;
    private final float e;

    public tud(float f, float f2, float f3, float f4, Interpolator interpolator) {
        boolean z = true;
        MoreObjects.checkArgument(f >= 0.0f && f < 1.0f);
        MoreObjects.checkArgument(f2 > 0.0f);
        float f5 = f2 + f;
        MoreObjects.checkArgument(f5 > 1.0f ? false : z);
        this.a = f;
        this.b = f5;
        this.d = f3;
        this.e = f4;
        this.c = interpolator;
    }

    public float a(float f) {
        boolean z = false;
        boolean z2 = f >= 0.0f;
        if (f <= 1.0f) {
            z = true;
        }
        MoreObjects.checkArgument(z2, Boolean.valueOf(z));
        float f2 = this.a;
        float f3 = this.b;
        float f4 = f3 - f2;
        if (f4 == 0.0f) {
            f4 = 1.0f / f3;
        }
        float interpolation = this.c.getInterpolation(nud.b((f - f2) / f4));
        return (this.e * interpolation) + ((1.0f - interpolation) * this.d);
    }
}
