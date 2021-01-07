package com.spotify.music.carmodehome.model;

import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final String b;
    private final String c;

    public c(String str, String str2, String str3) {
        h.e(str2, "style");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b) && h.a(this.c, cVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShelfItemImage(uri=");
        V0.append(this.a);
        V0.append(", style=");
        V0.append(this.b);
        V0.append(", placeholder=");
        return je.I0(V0, this.c, ")");
    }
}
