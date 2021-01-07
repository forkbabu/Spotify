package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.i3;

/* renamed from: v2  reason: default package */
public class v2 {
    private static final b3 a;
    private static final r1<String, Typeface> b = new r1<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new a3();
        } else if (i >= 28) {
            a = new z2();
        } else if (i >= 26) {
            a = new y2();
        } else if (i >= 24 && x2.k()) {
            a = new x2();
        } else if (i >= 21) {
            a = new w2();
        } else {
            a = new b3();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface typeface2;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 21) {
                b3 b3Var = a;
                l2 g = b3Var.g(typeface);
                if (g == null) {
                    typeface2 = null;
                } else {
                    typeface2 = b3Var.a(context, g, context.getResources(), i);
                }
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, i3.f[] fVarArr, int i) {
        return a.b(context, null, fVarArr, i);
    }

    public static Typeface c(Context context, k2 k2Var, Resources resources, int i, int i2, p2 p2Var, Handler handler, boolean z) {
        Typeface typeface;
        if (k2Var instanceof n2) {
            n2 n2Var = (n2) k2Var;
            typeface = i3.c(context, n2Var.b(), p2Var, handler, !z ? p2Var == null : n2Var.a() == 0, z ? n2Var.c() : -1, i2);
        } else {
            typeface = a.a(context, (l2) k2Var, resources, i2);
            if (p2Var != null) {
                if (typeface != null) {
                    p2Var.b(typeface, handler);
                } else {
                    p2Var.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.c(e(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = a.d(context, resources, i, str, i2);
        if (d != null) {
            b.c(e(resources, i, i2), d);
        }
        return d;
    }

    private static String e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return b.b(e(resources, i, i2));
    }
}
