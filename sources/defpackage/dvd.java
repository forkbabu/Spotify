package defpackage;

import android.view.View;

/* renamed from: dvd  reason: default package */
public final class dvd {
    public static final jvd<Float> a = jvd.b(Float.valueOf(0.97f));
    public static final jvd<Float> b;
    public static final jvd<Float> c = jvd.b(Float.valueOf(0.96f));
    public static final jvd<Float> d;

    static {
        Float valueOf = Float.valueOf(0.99f);
        b = jvd.b(valueOf);
        d = jvd.b(valueOf);
    }

    public static bvd a(View view) {
        return new bvd(view, c.a().floatValue());
    }

    public static bvd b(View view) {
        return new bvd(view, a.a().floatValue());
    }

    public static bvd c(View view) {
        return new bvd(view, b.a().floatValue());
    }
}
