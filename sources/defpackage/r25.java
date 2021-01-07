package defpackage;

import defpackage.v25;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

/* renamed from: r25  reason: default package */
public final class r25 {
    private final List<p25> a;
    private final boolean b;
    private final v25 c;
    private final Map<String, String> d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public r25() {
        this(null, false, null, null, false, false, false, 127);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends p25> */
    /* JADX WARN: Multi-variable type inference failed */
    public r25(List<? extends p25> list, boolean z, v25 v25, Map<String, String> map, boolean z2, boolean z3, boolean z4) {
        h.e(list, "items");
        h.e(v25, "loadingStatus");
        h.e(map, "currentlyPlaying");
        this.a = list;
        this.b = z;
        this.c = v25;
        this.d = map;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static r25 a(r25 r25, List list, boolean z, v25 v25, Map map, boolean z2, boolean z3, boolean z4, int i) {
        List list2 = (i & 1) != 0 ? r25.a : list;
        boolean z5 = (i & 2) != 0 ? r25.b : z;
        v25 v252 = (i & 4) != 0 ? r25.c : v25;
        Map map2 = (i & 8) != 0 ? r25.d : map;
        boolean z6 = (i & 16) != 0 ? r25.e : z2;
        boolean z7 = (i & 32) != 0 ? r25.f : z3;
        boolean z8 = (i & 64) != 0 ? r25.g : z4;
        r25.getClass();
        h.e(list2, "items");
        h.e(v252, "loadingStatus");
        h.e(map2, "currentlyPlaying");
        return new r25(list2, z5, v252, map2, z6, z7, z8);
    }

    public final boolean b() {
        return this.f;
    }

    public final Map<String, String> c() {
        return this.d;
    }

    public final boolean d() {
        return this.g;
    }

    public final List<p25> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r25)) {
            return false;
        }
        r25 r25 = (r25) obj;
        return h.a(this.a, r25.a) && this.b == r25.b && h.a(this.c, r25.c) && h.a(this.d, r25.d) && this.e == r25.e && this.f == r25.f && this.g == r25.g;
    }

    public final v25 f() {
        return this.c;
    }

    public final boolean g() {
        return this.e;
    }

    public int hashCode() {
        List<p25> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        v25 v25 = this.c;
        int hashCode2 = (i6 + (v25 != null ? v25.hashCode() : 0)) * 31;
        Map<String, String> map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        int i7 = (hashCode2 + i) * 31;
        boolean z2 = this.e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.g;
        if (!z4) {
            i2 = z4 ? 1 : 0;
        }
        return i15 + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FeedModel(items=");
        V0.append(this.a);
        V0.append(", online=");
        V0.append(this.b);
        V0.append(", loadingStatus=");
        V0.append(this.c);
        V0.append(", currentlyPlaying=");
        V0.append(this.d);
        V0.append(", playing=");
        V0.append(this.e);
        V0.append(", canPlayOnDemand=");
        V0.append(this.f);
        V0.append(", explicitContentDisabled=");
        return je.P0(V0, this.g, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r25(List list, boolean z, v25 v25, Map map, boolean z2, boolean z3, boolean z4, int i) {
        this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? v25.b.a : null, (i & 8) != 0 ? EmptyMap.a : null, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) == 0 ? z4 : false);
    }
}
