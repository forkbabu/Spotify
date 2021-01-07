package defpackage;

import android.os.Parcelable;

/* renamed from: zf0  reason: default package */
public final class zf0 {
    private static final xf0<String> a = new bg0();
    private static final xf0<Parcelable> b = new yf0();
    private static final Parcelable.Creator<String> c = new ag0();

    public static xf0<Parcelable> a() {
        return b;
    }

    public static Parcelable.Creator<String> b() {
        return c;
    }

    public static xf0<String> c() {
        return a;
    }
}
