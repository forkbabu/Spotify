package defpackage;

import android.os.Parcelable;

/* renamed from: yn0  reason: default package */
public abstract class yn0 implements Parcelable {
    public static yn0 a(ifd ifd) {
        return new xn0(ifd);
    }

    public abstract ifd b();

    public String getName() {
        return b().getName();
    }
}
