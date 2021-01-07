package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* access modifiers changed from: package-private */
public class g0 {
    private static final m0 a;
    static final Property<View, Float> b = new a(Float.class, "translationAlpha");
    static final Property<View, Rect> c = new b(Rect.class, "clipBounds");

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(g0.b(view));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, Float f) {
            g0.g(view, f.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Rect get(View view) {
            return q4.j(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, Rect rect) {
            q4.M(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new l0();
        } else if (i >= 23) {
            a = new k0();
        } else if (i >= 22) {
            a = new j0();
        } else if (i >= 21) {
            a = new i0();
        } else if (i >= 19) {
            a = new h0();
        } else {
            a = new m0();
        }
    }

    static void a(View view) {
        a.a(view);
    }

    static float b(View view) {
        return a.b(view);
    }

    static r0 c(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new q0(view);
        }
        return new p0(view.getWindowToken());
    }

    static void d(View view) {
        a.c(view);
    }

    static void e(View view, Matrix matrix) {
        a.d(view, matrix);
    }

    static void f(View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    static void g(View view, float f) {
        a.f(view, f);
    }

    static void h(View view, int i) {
        a.g(view, i);
    }

    static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
