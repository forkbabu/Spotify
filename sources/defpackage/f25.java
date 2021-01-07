package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: f25  reason: default package */
public final class f25 {
    private final String a;
    private final long b;
    private final String c;
    private final String d;

    public f25() {
        this(null, 0, null, null, 15);
    }

    public f25(String str, long j, String str2, String str3, int i) {
        String str4 = "";
        str = (i & 1) != 0 ? str4 : str;
        j = (i & 2) != 0 ? 0 : j;
        str4 = (i & 4) == 0 ? null : str4;
        int i2 = i & 8;
        h.e(str, "userIntent");
        h.e(str4, "entityType");
        this.a = str;
        this.b = j;
        this.c = str4;
        this.d = null;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final long c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f25)) {
            return false;
        }
        f25 f25 = (f25) obj;
        return h.a(this.a, f25.a) && this.b == f25.b && h.a(this.c, f25.c) && h.a(this.d, f25.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + e.a(this.b)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ImpressionLogMessage(userIntent=");
        V0.append(this.a);
        V0.append(", indexPath=");
        V0.append(this.b);
        V0.append(", entityType=");
        V0.append(this.c);
        V0.append(", entityUri=");
        return je.I0(V0, this.d, ")");
    }

    public f25(String str, long j, String str2, String str3) {
        h.e(str, "userIntent");
        h.e(str2, "entityType");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }
}
