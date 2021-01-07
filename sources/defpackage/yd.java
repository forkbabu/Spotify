package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: yd  reason: default package */
public class yd {
    private static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    private static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f;
        float a = a(((float) ((i >> 16) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f);
        float a2 = a(((float) ((i >> 8) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f);
        float a3 = a(((float) (i & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f);
        float a4 = a(((float) ((i2 >> 16) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f);
        float a5 = a(((float) ((i2 >> 8) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f);
        float a6 = a(((float) (i2 & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f);
        float a7 = je.a(((float) ((i2 >> 24) & BitmapRenderer.ALPHA_VISIBLE)) / 255.0f, f2, f, f2);
        float a8 = je.a(a4, a, f, a);
        float a9 = je.a(a5, a2, f, a2);
        float a10 = je.a(a6, a3, f, a3);
        int round = Math.round(b(a8) * 255.0f) << 16;
        return Math.round(b(a10) * 255.0f) | round | (Math.round(a7 * 255.0f) << 24) | (Math.round(b(a9) * 255.0f) << 8);
    }
}
