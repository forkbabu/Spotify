package com.spotify.http.contentaccesstoken;

import java.util.List;
import kotlin.jvm.internal.h;

public final class d {
    private final String a;
    private final long b;
    private final long c;
    private final List<String> d;

    public d(String str, long j, long j2, List<String> list) {
        h.e(str, "token");
        h.e(list, "domains");
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = list;
    }

    public final List<String> a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && h.a(this.d, dVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31) + e.a(this.c)) * 31;
        List<String> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContentAccessToken(token=");
        V0.append(this.a);
        V0.append(", expiresAtSec=");
        V0.append(this.b);
        V0.append(", refreshAtSec=");
        V0.append(this.c);
        V0.append(", domains=");
        return je.L0(V0, this.d, ")");
    }
}
