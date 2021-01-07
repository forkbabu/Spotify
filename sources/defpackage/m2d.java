package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: m2d  reason: default package */
public final class m2d {
    private final String a;
    private final String b;

    public m2d(String str, String str2) {
        h.e(str, "sourcePageId");
        h.e(str2, "sourcePageUri");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2d)) {
            return false;
        }
        m2d m2d = (m2d) obj;
        return h.a(this.a, m2d.a) && h.a(this.b, m2d.b);
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
        StringBuilder V0 = je.V0("SourcePage(sourcePageId=");
        V0.append(this.a);
        V0.append(", sourcePageUri=");
        return je.I0(V0, this.b, ")");
    }
}
