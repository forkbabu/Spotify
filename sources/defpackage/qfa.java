package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: qfa  reason: default package */
public final class qfa {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final Map<String, String> e;

    public qfa(String str, String str2, int i, String str3, Map map, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        int i3 = i2 & 8;
        LinkedHashMap linkedHashMap = (i2 & 16) != 0 ? new LinkedHashMap() : null;
        h.e(str, "uri");
        h.e(str2, "name");
        h.e(linkedHashMap, "additionalMetadata");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = null;
        this.e = linkedHashMap;
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
        if (!(obj instanceof qfa)) {
            return false;
        }
        qfa qfa = (qfa) obj;
        return h.a(this.a, qfa.a) && h.a(this.b, qfa.b) && this.c == qfa.c && h.a(this.d, qfa.d) && h.a(this.e, qfa.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuItem(uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", index=");
        V0.append(this.c);
        V0.append(", rowId=");
        V0.append(this.d);
        V0.append(", additionalMetadata=");
        return je.M0(V0, this.e, ")");
    }
}
