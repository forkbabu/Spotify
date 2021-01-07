package defpackage;

/* renamed from: knf  reason: default package */
public final class knf extends lnf {
    public static float a(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float b(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            return f > f3 ? f3 : f;
        }
    }

    public static int c(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    public static gnf<Float> d(float f, float f2) {
        return new fnf(f, f2);
    }

    public static jnf e(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new jnf(i, i2 - 1);
        }
        jnf jnf = jnf.n;
        return jnf.h();
    }
}
