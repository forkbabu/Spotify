package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: s25  reason: default package */
public final class s25 extends p25 {
    private final String a;
    private final String b;
    private final List<j25> c;

    public s25() {
        this("", "", EmptyList.a);
    }

    public static s25 b(s25 s25, String str, String str2, List list, int i) {
        String str3 = null;
        String str4 = (i & 1) != 0 ? s25.a : null;
        if ((i & 2) != 0) {
            str3 = s25.b;
        }
        if ((i & 4) != 0) {
            list = s25.c;
        }
        s25.getClass();
        h.e(str4, "id");
        h.e(str3, "title");
        h.e(list, "artists");
        return new s25(str4, str3, list);
    }

    @Override // defpackage.p25
    public String a() {
        return this.a;
    }

    public final List<j25> c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s25)) {
            return false;
        }
        s25 s25 = (s25) obj;
        return h.a(this.a, s25.a) && h.a(this.b, s25.b) && h.a(this.c, s25.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<j25> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FollowRecommendation(id=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", artists=");
        return je.L0(V0, this.c, ")");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s25(String str, String str2, List<j25> list) {
        super(null);
        h.e(str, "id");
        h.e(str2, "title");
        h.e(list, "artists");
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
