package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: i25  reason: default package */
public final class i25 {
    private final String a;
    private final String b;

    public i25() {
        h.e("", "userIntent");
        h.e("", "sourcePageId");
        this.a = "";
        this.b = "";
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
        if (!(obj instanceof i25)) {
            return false;
        }
        i25 i25 = (i25) obj;
        return h.a(this.a, i25.a) && h.a(this.b, i25.b);
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
        StringBuilder V0 = je.V0("SessionLogMessage(userIntent=");
        V0.append(this.a);
        V0.append(", sourcePageId=");
        return je.I0(V0, this.b, ")");
    }

    public i25(String str, String str2) {
        h.e(str, "userIntent");
        h.e(str2, "sourcePageId");
        this.a = str;
        this.b = str2;
    }
}
