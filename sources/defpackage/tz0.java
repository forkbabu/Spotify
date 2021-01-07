package defpackage;

import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: tz0  reason: default package */
public final class tz0 {
    private final String a;
    private final String b;
    private final Map<String, String> c;

    public tz0(String str, String str2, Map<String, String> map) {
        h.e(str, "searchQuery");
        h.e(map, "queryMap");
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final Map<String, String> a() {
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
        if (!(obj instanceof tz0)) {
            return false;
        }
        tz0 tz0 = (tz0) obj;
        return h.a(this.a, tz0.a) && h.a(this.b, tz0.b) && h.a(this.c, tz0.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchRequestData(searchQuery=");
        V0.append(this.a);
        V0.append(", requestId=");
        V0.append(this.b);
        V0.append(", queryMap=");
        return je.M0(V0, this.c, ")");
    }
}
