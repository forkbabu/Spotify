package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: h44  reason: default package */
public final class h44 {
    private final String a;
    private final String b;

    public h44(String str, String str2) {
        h.e(str, "displayName");
        h.e(str2, "avatarUrl");
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
        if (!(obj instanceof h44)) {
            return false;
        }
        h44 h44 = (h44) obj;
        return h.a(this.a, h44.a) && h.a(this.b, h44.b);
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
        StringBuilder V0 = je.V0("User(displayName=");
        V0.append(this.a);
        V0.append(", avatarUrl=");
        return je.I0(V0, this.b, ")");
    }
}
