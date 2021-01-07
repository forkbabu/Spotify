package com.spotify.http.clienttoken;

import java.util.List;
import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final long b;
    private final long c;
    private final String d;
    private final List<String> e;

    public a(String str, long j, long j2, String str2, List<String> list) {
        h.e(str, "clientToken");
        h.e(str2, "clientDataHash");
        h.e(list, "domains");
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = list;
    }

    public final String a() {
        return this.a;
    }

    public final List<String> b() {
        return this.e;
    }

    public final long c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && h.a(this.d, aVar.d) && h.a(this.e, aVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31) + e.a(this.c)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ClientToken(clientToken=");
        V0.append(this.a);
        V0.append(", expiresAtTime=");
        V0.append(this.b);
        V0.append(", refreshAtTime=");
        V0.append(this.c);
        V0.append(", clientDataHash=");
        V0.append(this.d);
        V0.append(", domains=");
        return je.L0(V0, this.e, ")");
    }
}
