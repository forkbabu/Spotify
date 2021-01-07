package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: g35  reason: default package */
public final class g35 {
    private final String a;
    private final String b;
    private final String c;

    public g35(@JsonProperty("uri") String str, @JsonProperty("display_name") String str2, @JsonProperty("image_url") String str3) {
        h.e(str, "uri");
        h.e(str2, "displayName");
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

    public final g35 copy(@JsonProperty("uri") String str, @JsonProperty("display_name") String str2, @JsonProperty("image_url") String str3) {
        h.e(str, "uri");
        h.e(str2, "displayName");
        return new g35(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g35)) {
            return false;
        }
        g35 g35 = (g35) obj;
        return h.a(this.a, g35.a) && h.a(this.b, g35.b) && h.a(this.c, g35.c);
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
        StringBuilder V0 = je.V0("ArtistData(uri=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", imageUrl=");
        return je.I0(V0, this.c, ")");
    }
}
