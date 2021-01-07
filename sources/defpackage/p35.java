package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: p35  reason: default package */
public final class p35 {
    private final String a;
    private final String b;
    private final boolean c;
    private final List<g35> d;

    public p35(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("explicit") boolean z, @JsonProperty("artists") List<g35> list) {
        h.e(str, "uri");
        h.e(str2, "title");
        h.e(list, "artists");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
    }

    public final List<g35> a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final p35 copy(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("explicit") boolean z, @JsonProperty("artists") List<g35> list) {
        h.e(str, "uri");
        h.e(str2, "title");
        h.e(list, "artists");
        return new p35(str, str2, z, list);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p35)) {
            return false;
        }
        p35 p35 = (p35) obj;
        return h.a(this.a, p35.a) && h.a(this.b, p35.b) && this.c == p35.c && h.a(this.d, p35.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        List<g35> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackData(uri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", explicit=");
        V0.append(this.c);
        V0.append(", artists=");
        return je.L0(V0, this.d, ")");
    }
}
