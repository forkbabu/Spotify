package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: j45  reason: default package */
public final class j45 {
    private final String a;
    private final String b;
    private final String c;

    public j45(String str, String str2, String str3) {
        je.x(str, "uri", str2, "displayName", str3, "imageUrl");
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
        if (!(obj instanceof j45)) {
            return false;
        }
        j45 j45 = (j45) obj;
        return h.a(this.a, j45.a) && h.a(this.b, j45.b) && h.a(this.c, j45.c);
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
        StringBuilder V0 = je.V0("FollowRecsArtistModel(uri=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", imageUrl=");
        return je.I0(V0, this.c, ")");
    }
}
