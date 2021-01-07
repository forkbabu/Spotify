package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: l25  reason: default package */
public final class l25 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public l25(String str, String str2, String str3, String str4) {
        h.e(str, "uri");
        h.e(str2, "name");
        h.e(str3, "type");
        h.e(str4, "imageUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l25)) {
            return false;
        }
        l25 l25 = (l25) obj;
        return h.a(this.a, l25.a) && h.a(this.b, l25.b) && h.a(this.c, l25.c) && h.a(this.d, l25.d);
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
        StringBuilder V0 = je.V0("AutomatedMessagingItemContext(uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", type=");
        V0.append(this.c);
        V0.append(", imageUrl=");
        return je.I0(V0, this.d, ")");
    }
}
