package defpackage;

import android.view.animation.Interpolator;

/* renamed from: mo8  reason: default package */
public final /* synthetic */ class mo8 implements Interpolator {
    public static final /* synthetic */ mo8 a = new mo8();

    private /* synthetic */ mo8() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = qo8.n;
        float f2 = f - 1.0f;
        return (f2 * f2 * f2) + 1.0f;
    }
}
