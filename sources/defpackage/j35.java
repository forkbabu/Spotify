package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: j35  reason: default package */
public final class j35 {
    private final String a;
    private final String b;
    private final n35 c;
    private final l35 d;
    private final i35 e;

    public j35(@JsonProperty("id") String str, @JsonProperty("view_type") String str2, @JsonProperty("music_release") n35 n35, @JsonProperty("follow_recs") l35 l35, @JsonProperty("automated_messaging_item") i35 i35) {
        h.e(str, "id");
        h.e(str2, "viewType");
        this.a = str;
        this.b = str2;
        this.c = n35;
        this.d = l35;
        this.e = i35;
    }

    public final i35 a() {
        return this.e;
    }

    public final l35 b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final j35 copy(@JsonProperty("id") String str, @JsonProperty("view_type") String str2, @JsonProperty("music_release") n35 n35, @JsonProperty("follow_recs") l35 l35, @JsonProperty("automated_messaging_item") i35 i35) {
        h.e(str, "id");
        h.e(str2, "viewType");
        return new j35(str, str2, n35, l35, i35);
    }

    public final n35 d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j35)) {
            return false;
        }
        j35 j35 = (j35) obj;
        return h.a(this.a, j35.a) && h.a(this.b, j35.b) && h.a(this.c, j35.c) && h.a(this.d, j35.d) && h.a(this.e, j35.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        n35 n35 = this.c;
        int hashCode3 = (hashCode2 + (n35 != null ? n35.hashCode() : 0)) * 31;
        l35 l35 = this.d;
        int hashCode4 = (hashCode3 + (l35 != null ? l35.hashCode() : 0)) * 31;
        i35 i35 = this.e;
        if (i35 != null) {
            i = i35.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FeedItemData(id=");
        V0.append(this.a);
        V0.append(", viewType=");
        V0.append(this.b);
        V0.append(", musicRelease=");
        V0.append(this.c);
        V0.append(", followRecs=");
        V0.append(this.d);
        V0.append(", automatedMessagingItem=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}
