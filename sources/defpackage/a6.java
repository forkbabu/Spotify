package defpackage;

import android.view.animation.Interpolator;

/* renamed from: a6  reason: default package */
abstract class a6 implements Interpolator {
    private final float[] a;
    private final float b;

    protected a6(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.a;
        return je.a(fArr2[min + 1], fArr2[min], f3, fArr2[min]);
    }
}
