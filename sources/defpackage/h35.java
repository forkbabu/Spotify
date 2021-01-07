package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: h35  reason: default package */
public final class h35 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public h35(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("type") String str3, @JsonProperty("image_url") String str4) {
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

    public final h35 copy(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("type") String str3, @JsonProperty("image_url") String str4) {
        h.e(str, "uri");
        h.e(str2, "name");
        h.e(str3, "type");
        h.e(str4, "imageUrl");
        return new h35(str, str2, str3, str4);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h35)) {
            return false;
        }
        h35 h35 = (h35) obj;
        return h.a(this.a, h35.a) && h.a(this.b, h35.b) && h.a(this.c, h35.c) && h.a(this.d, h35.d);
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
        StringBuilder V0 = je.V0("AutomatedMessagingItemContextData(uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", type=");
        V0.append(this.c);
        V0.append(", imageUrl=");
        return je.I0(V0, this.d, ")");
    }
}
