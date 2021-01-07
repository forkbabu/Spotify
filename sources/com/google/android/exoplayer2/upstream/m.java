package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.g;
import com.spotify.cosmos.router.Request;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class m {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map<String, String> d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public m(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, null, 0);
    }

    public static String b(int i2) {
        if (i2 == 1) {
            return Request.GET;
        }
        if (i2 == 2) {
            return Request.POST;
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i2);
    }

    public final String a() {
        return b(this.b);
    }

    public boolean c(int i2) {
        return (this.i & i2) == i2;
    }

    public m d(long j) {
        long j2 = this.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return e(j, j3);
    }

    public m e(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new m(this.a, this.b, this.c, this.e + j, this.f + j, j2, this.h, this.i, this.d);
    }

    public String toString() {
        StringBuilder V0 = je.V0("DataSpec[");
        V0.append(a());
        V0.append(" ");
        V0.append(this.a);
        V0.append(", ");
        V0.append(Arrays.toString(this.c));
        V0.append(", ");
        V0.append(this.e);
        V0.append(", ");
        V0.append(this.f);
        V0.append(", ");
        V0.append(this.g);
        V0.append(", ");
        V0.append(this.h);
        V0.append(", ");
        return je.B0(V0, this.i, "]");
    }

    public m(Uri uri, long j, long j2, String str, int i2) {
        this(uri, j, j, j2, str, i2);
    }

    public m(Uri uri, long j, long j2, long j3, String str, int i2) {
        this(uri, 1, null, j, j2, j3, str, i2, Collections.emptyMap());
    }

    public m(Uri uri, int i2, byte[] bArr, long j, long j2, long j3, String str, int i3, Map<String, String> map) {
        byte[] bArr2 = bArr;
        boolean z = true;
        g.a(j >= 0);
        g.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        g.a(z);
        this.a = uri;
        this.b = i2;
        this.c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i3;
        this.d = Collections.unmodifiableMap(new HashMap(map));
    }
}
