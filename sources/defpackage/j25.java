package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: j25  reason: default package */
public final class j25 {
    private final String a;
    private final String b;
    private final String c;

    public j25() {
        this(null, null, null, 7);
    }

    public j25(String str, String str2, String str3) {
        je.x(str, "uri", str2, "displayName", str3, "image");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j25)) {
            return false;
        }
        j25 j25 = (j25) obj;
        return h.a(this.a, j25.a) && h.a(this.b, j25.b) && h.a(this.c, j25.c);
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
        StringBuilder V0 = je.V0("Artist(uri=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", image=");
        return je.I0(V0, this.c, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j25(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : null, (i & 2) != 0 ? "" : null, (i & 4) != 0 ? "" : null);
    }
}
