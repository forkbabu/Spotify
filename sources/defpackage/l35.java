package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: l35  reason: default package */
public final class l35 {
    private final String a;
    private final List<g35> b;

    public l35(@JsonProperty("section_title") String str, @JsonProperty("artists") List<g35> list) {
        h.e(str, "sectionTitle");
        h.e(list, "artists");
        this.a = str;
        this.b = list;
    }

    public final List<g35> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final l35 copy(@JsonProperty("section_title") String str, @JsonProperty("artists") List<g35> list) {
        h.e(str, "sectionTitle");
        h.e(list, "artists");
        return new l35(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l35)) {
            return false;
        }
        l35 l35 = (l35) obj;
        return h.a(this.a, l35.a) && h.a(this.b, l35.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<g35> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FollowRecsData(sectionTitle=");
        V0.append(this.a);
        V0.append(", artists=");
        return je.L0(V0, this.b, ")");
    }
}
