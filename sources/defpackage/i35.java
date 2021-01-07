package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: i35  reason: default package */
public final class i35 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final h35 e;

    public i35(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("icon_url") String str3, @JsonProperty("delivery_time") String str4, @JsonProperty("context") h35 h35) {
        h.e(str, "title");
        h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str3, "iconUrl");
        h.e(str4, "deliveryTime");
        h.e(h35, "context");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h35;
    }

    public final h35 a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final i35 copy(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("icon_url") String str3, @JsonProperty("delivery_time") String str4, @JsonProperty("context") h35 h35) {
        h.e(str, "title");
        h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str3, "iconUrl");
        h.e(str4, "deliveryTime");
        h.e(h35, "context");
        return new i35(str, str2, str3, str4, h35);
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i35)) {
            return false;
        }
        i35 i35 = (i35) obj;
        return h.a(this.a, i35.a) && h.a(this.b, i35.b) && h.a(this.c, i35.c) && h.a(this.d, i35.d) && h.a(this.e, i35.e);
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
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        h35 h35 = this.e;
        if (h35 != null) {
            i = h35.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AutomatedMessagingItemData(title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", iconUrl=");
        V0.append(this.c);
        V0.append(", deliveryTime=");
        V0.append(this.d);
        V0.append(", context=");
        V0.append(this.e);
        V0.append(")");
        return V0.toString();
    }
}
