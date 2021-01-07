package defpackage;

import android.os.Parcelable;

/* renamed from: wj1  reason: default package */
public abstract class wj1 implements Parcelable {
    private final String a;

    public wj1(String str) {
        this.a = str;
    }

    public String getUri() {
        return this.a;
    }
}
