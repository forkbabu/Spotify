package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: n35  reason: default package */
public final class n35 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final List<g35> f;
    private final String g;
    private final boolean h;
    private final List<p35> i;

    public n35(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("album_type") String str3, @JsonProperty("artist_pick_message") String str4, @JsonProperty("release_time") String str5, @JsonProperty("artists") List<g35> list, @JsonProperty("image_url") String str6, @JsonProperty("explicit") boolean z, @JsonProperty("tracks") List<p35> list2) {
        h.e(str, "uri");
        h.e(str2, "name");
        h.e(str3, "albumType");
        h.e(str5, "releaseTime");
        h.e(list, "artists");
        h.e(str6, "imageUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = str6;
        this.h = z;
        this.i = list2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final List<g35> c() {
        return this.f;
    }

    public final n35 copy(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("album_type") String str3, @JsonProperty("artist_pick_message") String str4, @JsonProperty("release_time") String str5, @JsonProperty("artists") List<g35> list, @JsonProperty("image_url") String str6, @JsonProperty("explicit") boolean z, @JsonProperty("tracks") List<p35> list2) {
        h.e(str, "uri");
        h.e(str2, "name");
        h.e(str3, "albumType");
        h.e(str5, "releaseTime");
        h.e(list, "artists");
        h.e(str6, "imageUrl");
        return new n35(str, str2, str3, str4, str5, list, str6, z, list2);
    }

    public final boolean d() {
        return this.h;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n35)) {
            return false;
        }
        n35 n35 = (n35) obj;
        return h.a(this.a, n35.a) && h.a(this.b, n35.b) && h.a(this.c, n35.c) && h.a(this.d, n35.d) && h.a(this.e, n35.e) && h.a(this.f, n35.f) && h.a(this.g, n35.g) && this.h == n35.h && h.a(this.i, n35.i);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final List<p35> h() {
        return this.i;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<g35> list = this.f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode7 + i3) * 31;
        List<p35> list2 = this.i;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return i6 + i2;
    }

    public final String i() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicReleaseData(uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", albumType=");
        V0.append(this.c);
        V0.append(", artistPickMessage=");
        V0.append(this.d);
        V0.append(", releaseTime=");
        V0.append(this.e);
        V0.append(", artists=");
        V0.append(this.f);
        V0.append(", imageUrl=");
        V0.append(this.g);
        V0.append(", explicit=");
        V0.append(this.h);
        V0.append(", tracks=");
        return je.L0(V0, this.i, ")");
    }
}
