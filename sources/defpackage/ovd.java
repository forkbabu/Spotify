package defpackage;

import android.graphics.Color;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: ovd  reason: default package */
public final class ovd {

    /* access modifiers changed from: package-private */
    /* renamed from: ovd$a */
    public static class a implements nvd {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.nvd
        public int a(float f) {
            return this.a;
        }
    }

    public static int a(int i, float f) {
        return s2.e(Color.argb((int) (f * 255.0f), 0, 0, 0), i);
    }

    private static float b(int i) {
        float e = e((i >> 16) & BitmapRenderer.ALPHA_VISIBLE);
        float e2 = e((i >> 8) & BitmapRenderer.ALPHA_VISIBLE) * 0.7152f;
        return (e(i & BitmapRenderer.ALPHA_VISIBLE) * 0.0722f) + e2 + (e * 0.2126f);
    }

    public static float c(int i, int i2) {
        float b = (b(i) + 0.05f) / (b(i2) + 0.05f);
        return b < 1.0f ? 1.0f / b : b;
    }

    public static nvd d(int i, int i2) {
        return new mvd(i, i2);
    }

    private static float e(int i) {
        float f = ((float) i) / 255.0f;
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        double d = (double) f;
        Double.isNaN(d);
        return (float) Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static nvd f(int i) {
        return new a(i);
    }
}
