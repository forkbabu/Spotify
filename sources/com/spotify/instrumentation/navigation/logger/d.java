package com.spotify.instrumentation.navigation.logger;

import kotlin.jvm.internal.h;

public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public d(String str, String str2, String str3, String str4) {
        h.e(str, "pageInstanceId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
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
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && h.a(this.c, dVar.c) && h.a(this.d, dVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LocationId(pageInstanceId=");
        V0.append(this.a);
        V0.append(", pageId=");
        V0.append(this.b);
        V0.append(", entityUri=");
        V0.append(this.c);
        V0.append(", navigationalRoot=");
        return je.I0(V0, this.d, ")");
    }
}
