package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: dt9  reason: default package */
public final class dt9 extends ft9 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final Long g;
    private final List<et9> h;

    dt9(String str, String str2, String str3, String str4, String str5, boolean z, Long l, List<et9> list) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z;
            this.g = l;
            this.h = list;
            return;
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.ft9
    @JsonProperty("description")
    public String description() {
        return this.e;
    }

    @Override // defpackage.ft9
    @JsonProperty("enum_values")
    public List<et9> enumValues() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ft9)) {
            return false;
        }
        ft9 ft9 = (ft9) obj;
        if (this.a.equals(ft9.key()) && ((str = this.b) != null ? str.equals(ft9.value()) : ft9.value() == null) && ((str2 = this.c) != null ? str2.equals(ft9.type()) : ft9.type() == null) && ((str3 = this.d) != null ? str3.equals(ft9.title()) : ft9.title() == null) && ((str4 = this.e) != null ? str4.equals(ft9.description()) : ft9.description() == null) && this.f == ft9.visibility() && ((l = this.g) != null ? l.equals(ft9.modified()) : ft9.modified() == null)) {
            List<et9> list = this.h;
            if (list == null) {
                if (ft9.enumValues() == null) {
                    return true;
                }
            } else if (list.equals(ft9.enumValues())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (((hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        Long l = this.g;
        int hashCode6 = (hashCode5 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        List<et9> list = this.h;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 ^ i;
    }

    @Override // defpackage.ft9
    @JsonProperty("key")
    public String key() {
        return this.a;
    }

    @Override // defpackage.ft9
    @JsonProperty("modified")
    public Long modified() {
        return this.g;
    }

    @Override // defpackage.ft9
    @JsonProperty("title")
    public String title() {
        return this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomethingSetting{key=");
        V0.append(this.a);
        V0.append(", value=");
        V0.append(this.b);
        V0.append(", type=");
        V0.append(this.c);
        V0.append(", title=");
        V0.append(this.d);
        V0.append(", description=");
        V0.append(this.e);
        V0.append(", visibility=");
        V0.append(this.f);
        V0.append(", modified=");
        V0.append(this.g);
        V0.append(", enumValues=");
        return je.L0(V0, this.h, "}");
    }

    @Override // defpackage.ft9
    @JsonProperty("type")
    public String type() {
        return this.c;
    }

    @Override // defpackage.ft9
    @JsonProperty("value")
    public String value() {
        return this.b;
    }

    @Override // defpackage.ft9
    @JsonProperty("visibility")
    public boolean visibility() {
        return this.f;
    }
}
