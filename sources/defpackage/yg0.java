package defpackage;

import com.spotify.collection.endpoints.artist.policy.Policy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: yg0  reason: default package */
public final class yg0 {
    private final Map<String, String> a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final int e;
    private final gh0 f;
    private final ane g;
    private final Policy h;

    public yg0() {
        this(null, null, null, 0, null, null, null, 127);
    }

    public yg0(Boolean bool, Boolean bool2, Boolean bool3, int i, gh0 gh0, ane ane, Policy policy, int i2) {
        Boolean bool4 = (i2 & 1) != 0 ? null : bool;
        Boolean bool5 = (i2 & 2) != 0 ? null : bool2;
        Boolean bool6 = (i2 & 4) != 0 ? null : bool3;
        int i3 = (i2 & 8) != 0 ? 500 : i;
        int i4 = i2 & 16;
        int i5 = i2 & 32;
        Policy policy2 = (i2 & 64) != 0 ? new Policy(null, 1, null) : null;
        h.e(policy2, "jsonPolicy");
        this.b = bool4;
        this.c = bool5;
        this.d = bool6;
        this.e = i3;
        this.f = null;
        this.g = null;
        this.h = policy2;
        ArrayList arrayList = new ArrayList();
        a(arrayList, "playable", bool4);
        a(arrayList, "availableOffline", bool5);
        a(arrayList, "available", bool6);
        this.a = d.s(new Pair("updateThrottling", String.valueOf(i3)), new Pair("responseFormat", "json"), new Pair("filter", d.p(arrayList, ",", null, null, 0, null, null, 62, null)), new Pair("sort", bne.b(zg0.a())));
    }

    private final <T> void a(List<String> list, String str, T t) {
        if (t != null) {
            list.add(str + " eq " + ((Object) t));
        }
    }

    public static final yg0 b(Boolean bool, Boolean bool2, Boolean bool3) {
        return new yg0(bool, bool2, bool3, 0, null, null, null, 120);
    }

    public final Policy c() {
        return this.h;
    }

    public final Map<String, String> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg0)) {
            return false;
        }
        yg0 yg0 = (yg0) obj;
        return h.a(this.b, yg0.b) && h.a(this.c, yg0.c) && h.a(this.d, yg0.d) && this.e == yg0.e && h.a(this.f, yg0.f) && h.a(this.g, yg0.g) && h.a(this.h, yg0.h);
    }

    public int hashCode() {
        Boolean bool = this.b;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.c;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.d;
        int hashCode3 = (((hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.e) * 31;
        gh0 gh0 = this.f;
        int hashCode4 = (hashCode3 + (gh0 != null ? gh0.hashCode() : 0)) * 31;
        ane ane = this.g;
        int hashCode5 = (hashCode4 + (ane != null ? ane.hashCode() : 0)) * 31;
        Policy policy = this.h;
        if (policy != null) {
            i = policy.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CollectionArtistEndpointConfiguration(isPlayableOnly=");
        V0.append(this.b);
        V0.append(", isAvailableOfflineOnly=");
        V0.append(this.c);
        V0.append(", isAvailableOnly=");
        V0.append(this.d);
        V0.append(", updateThrottling=");
        V0.append(this.e);
        V0.append(", range=");
        V0.append(this.f);
        V0.append(", sortOrder=");
        V0.append(this.g);
        V0.append(", jsonPolicy=");
        V0.append(this.h);
        V0.append(")");
        return V0.toString();
    }
}
