package defpackage;

/* renamed from: hx  reason: default package */
public final class hx {
    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    public static float b(float f, float f2, float f3, float f4, float f5, float f6) {
        float a = a(f, f2, f3, f4);
        float a2 = a(f, f2, f5, f4);
        float a3 = a(f, f2, f5, f6);
        float a4 = a(f, f2, f3, f6);
        if (a > a2 && a > a3 && a > a4) {
            return a;
        }
        if (a2 <= a3 || a2 <= a4) {
            return a3 > a4 ? a3 : a4;
        }
        return a2;
    }

    public static float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }
}
