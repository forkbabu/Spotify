package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: rg7  reason: default package */
public final class rg7 {
    private final String a;
    private final String b;

    public rg7(String str, String str2) {
        h.e(str, "showUri");
        h.e(str2, "showName");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg7)) {
            return false;
        }
        rg7 rg7 = (rg7) obj;
        return h.a(this.a, rg7.a) && h.a(this.b, rg7.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowMetadata(showUri=");
        V0.append(this.a);
        V0.append(", showName=");
        return je.I0(V0, this.b, ")");
    }
}
