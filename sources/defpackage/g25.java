package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: g25  reason: default package */
public final class g25 {
    private final String a;
    private final String b;
    private final String c;

    public g25(String str, String str2, String str3) {
        h.e(str, "userIntent");
        h.e(str2, "interactionOrigin");
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
        if (!(obj instanceof g25)) {
            return false;
        }
        g25 g25 = (g25) obj;
        return h.a(this.a, g25.a) && h.a(this.b, g25.b) && h.a(this.c, g25.c);
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
        StringBuilder V0 = je.V0("InteractionLogMessage(userIntent=");
        V0.append(this.a);
        V0.append(", interactionOrigin=");
        V0.append(this.b);
        V0.append(", destinationUri=");
        return je.I0(V0, this.c, ")");
    }
}
