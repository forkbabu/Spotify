package com.spotify.voice.experience.view.listening;

import android.graphics.Paint;

/* access modifiers changed from: package-private */
public class c {
    private final a a;
    private float b;
    private final Paint c;

    static class a {
        final float a;
        final float b;
        final float c;

        a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    public c(a aVar, Paint paint) {
        this.a = aVar;
        this.c = paint;
    }

    public Paint a() {
        return this.c;
    }

    public float b() {
        return this.b;
    }

    public void c(float f) {
        float f2 = 0.0f;
        float exp = 1.0f - ((float) Math.exp((double) (((f - 0.0f) * 3.3333333f) * -4.0f)));
        if (exp >= 0.0f) {
            f2 = exp > 1.0f ? 1.0f : exp;
        }
        a aVar = this.a;
        float f3 = aVar.a;
        float f4 = aVar.b;
        float f5 = aVar.c * f3 * f2;
        if (f5 >= f3) {
            f3 = f5 > f4 ? f4 : f5;
        }
        this.b = f3;
    }
}
