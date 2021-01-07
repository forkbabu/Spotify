package com.spotify.libs.otp.session;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;

public class e<T extends Parcelable> {
    public final T a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public e(T t, long j, long j2, int i, String str) {
        t.getClass();
        boolean z = true;
        MoreObjects.checkState(j > 0);
        MoreObjects.checkState(j2 >= j);
        MoreObjects.checkState(i <= 0 ? false : z);
        str.getClass();
        this.a = t;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = str;
    }
}
