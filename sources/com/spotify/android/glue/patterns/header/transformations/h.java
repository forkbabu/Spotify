package com.spotify.android.glue.patterns.header.transformations;

import android.animation.TimeInterpolator;
import java.util.Collections;
import java.util.List;

public class h implements b {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    TimeInterpolator e = null;
    List<g> f = Collections.emptyList();

    public static class a {
        private final float a;
        private final float b;
        private final float c;
        private final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public h a() {
            return new h(null, this.a, this.b, this.c, this.d, null);
        }
    }

    public h(TimeInterpolator timeInterpolator, float f2, float f3, float f4, float f5, g gVar) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    @Override // com.spotify.android.glue.patterns.header.transformations.b
    public float a(float f2) {
        float f3;
        float f4 = this.a;
        float f5 = this.b;
        if (f4 < f5) {
            f3 = nud.c(f4, f5, f2);
        } else {
            f3 = nud.c(f5, f4, f2);
        }
        float o = nud.o(this.a, this.b, this.c, this.d, f3);
        if (this.e != null) {
            o = nud.o(0.0f, 1.0f, this.c, this.d, this.e.getInterpolation(nud.o(this.c, this.d, 0.0f, 1.0f, o)));
        }
        if (!this.f.isEmpty()) {
            for (g gVar : this.f) {
                gVar.a(o);
            }
        }
        return o;
    }
}
