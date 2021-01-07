package com.google.android.video.exo;

import android.net.Uri;
import com.google.android.exoplayer2.util.o;

public final class e {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public e(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public e a(e eVar, String str) {
        String i = o.i(str, this.c);
        if (i.equals(o.i(str, eVar.c))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == eVar.a) {
                    long j3 = eVar.b;
                    return new e(i, j2, j3 == -1 ? -1 : j + j3);
                }
            }
            long j4 = eVar.b;
            if (j4 != -1) {
                long j5 = eVar.a;
                if (j5 + j4 == this.a) {
                    return new e(i, j5, j == -1 ? -1 : j4 + j);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return o.j(str, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && this.b == eVar.b && this.c.equals(eVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }
}
