package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: c0e  reason: default package */
public final class c0e {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public c0e(String str, String str2, String str3, String str4) {
        h.f(str, "clientId");
        h.f(str2, "clientVersion");
        h.f(str3, "installationId");
        h.f(str4, "propertySetId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0e)) {
            return false;
        }
        c0e c0e = (c0e) obj;
        return h.a(this.a, c0e.a) && h.a(this.b, c0e.b) && h.a(this.c, c0e.c) && h.a(this.d, c0e.d);
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
        StringBuilder V0 = je.V0("ClientAttributes(clientId=");
        V0.append(this.a);
        V0.append(", clientVersion=");
        V0.append(this.b);
        V0.append(", installationId=");
        V0.append(this.c);
        V0.append(", propertySetId=");
        return je.I0(V0, this.d, ")");
    }
}
