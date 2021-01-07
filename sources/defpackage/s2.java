package defpackage;

import android.graphics.Color;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: s2  reason: default package */
public final class s2 {
    private static final ThreadLocal<double[]> a = new ThreadLocal<>();
    public static final /* synthetic */ int b = 0;

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = g(f8, 0.0f, 360.0f);
        fArr[1] = g(f2, 0.0f, 1.0f);
        fArr[2] = g(f7, 0.0f, 1.0f);
    }

    public static double b(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = e(i, i2);
            }
            double c = c(i) + 0.05d;
            double c2 = c(i2) + 0.05d;
            return Math.max(c, c2) / Math.min(c, c2);
        }
        StringBuilder V0 = je.V0("background can not be translucent: #");
        V0.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(V0.toString());
    }

    public static double c(int i) {
        double d;
        double d2;
        double d3;
        ThreadLocal<double[]> threadLocal = a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d4 = (double) red;
            Double.isNaN(d4);
            Double.isNaN(d4);
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 < 0.04045d) {
                d = d5 / 12.92d;
            } else {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = (double) green;
            Double.isNaN(d6);
            Double.isNaN(d6);
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 < 0.04045d) {
                d2 = d7 / 12.92d;
            } else {
                d2 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            }
            double d8 = (double) blue;
            Double.isNaN(d8);
            Double.isNaN(d8);
            Double.isNaN(d8);
            double d9 = d8 / 255.0d;
            if (d9 < 0.04045d) {
                d3 = d9 / 12.92d;
            } else {
                d3 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * d3) + (0.3576d * d2) + (0.4124d * d)) * 100.0d;
            dArr[1] = ((0.0722d * d3) + (0.7152d * d2) + (0.2126d * d)) * 100.0d;
            double d10 = d3 * 0.9505d;
            dArr[2] = (d10 + (d2 * 0.1192d) + (d * 0.0193d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int d(int i, int i2, float f) {
        int alpha = Color.alpha(i2);
        int i3 = BitmapRenderer.ALPHA_VISIBLE;
        if (alpha == 255) {
            double d = (double) f;
            if (b(h(i, BitmapRenderer.ALPHA_VISIBLE), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (b(h(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder V0 = je.V0("background can not be translucent: #");
        V0.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(V0.toString());
    }

    public static int e(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / BitmapRenderer.ALPHA_VISIBLE);
        return Color.argb(i3, f(Color.red(i), alpha2, Color.red(i2), alpha, i3), f(Color.green(i), alpha2, Color.green(i2), alpha, i3), f(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    private static int f(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * BitmapRenderer.ALPHA_VISIBLE) * i2)) / (i5 * BitmapRenderer.ALPHA_VISIBLE);
    }

    private static float g(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int h(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
