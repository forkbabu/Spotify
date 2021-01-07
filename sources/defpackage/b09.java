package defpackage;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.h;

/* renamed from: b09  reason: default package */
public final class b09 {
    private static final Interpolator a;
    private static final Interpolator b;
    private static final Interpolator c;
    public static final b09 d = null;

    static {
        Interpolator interpolator = ta0.f;
        h.d(interpolator, "EasingCurves.IN_OUT");
        a = interpolator;
        Interpolator interpolator2 = ta0.d;
        h.d(interpolator2, "EasingCurves.IN_HARD");
        b = interpolator2;
        Interpolator interpolator3 = ta0.c;
        h.d(interpolator3, "EasingCurves.OUT_HARD");
        c = interpolator3;
    }

    public static final Interpolator a() {
        return b;
    }

    public static final Interpolator b() {
        return a;
    }

    public static final Interpolator c() {
        return c;
    }
}
