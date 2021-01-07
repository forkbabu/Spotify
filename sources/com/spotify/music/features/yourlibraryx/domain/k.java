package com.spotify.music.features.yourlibraryx.domain;

import java.util.List;
import kotlin.jvm.internal.h;

public final class k {
    private final YourLibraryXSortOption a;
    private final d b;
    private final jnf c;
    private final List<String> d;

    public k(YourLibraryXSortOption yourLibraryXSortOption, d dVar, jnf jnf, List<String> list) {
        h.e(yourLibraryXSortOption, "sortOption");
        h.e(dVar, "filters");
        h.e(jnf, "range");
        this.a = yourLibraryXSortOption;
        this.b = dVar;
        this.c = jnf;
        this.d = list;
    }

    public static k a(k kVar, YourLibraryXSortOption yourLibraryXSortOption, d dVar, jnf jnf, List list, int i) {
        jnf jnf2 = null;
        YourLibraryXSortOption yourLibraryXSortOption2 = (i & 1) != 0 ? kVar.a : null;
        d dVar2 = (i & 2) != 0 ? kVar.b : null;
        if ((i & 4) != 0) {
            jnf2 = kVar.c;
        }
        if ((i & 8) != 0) {
            list = kVar.d;
        }
        h.e(yourLibraryXSortOption2, "sortOption");
        h.e(dVar2, "filters");
        h.e(jnf2, "range");
        return new k(yourLibraryXSortOption2, dVar2, jnf2, list);
    }

    public final d b() {
        return this.b;
    }

    public final jnf c() {
        return this.c;
    }

    public final List<String> d() {
        return this.d;
    }

    public final YourLibraryXSortOption e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.a(this.a, kVar.a) && h.a(this.b, kVar.b) && h.a(this.c, kVar.c) && h.a(this.d, kVar.d);
    }

    public int hashCode() {
        YourLibraryXSortOption yourLibraryXSortOption = this.a;
        int i = 0;
        int hashCode = (yourLibraryXSortOption != null ? yourLibraryXSortOption.hashCode() : 0) * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        jnf jnf = this.c;
        int hashCode3 = (hashCode2 + (jnf != null ? jnf.hashCode() : 0)) * 31;
        List<String> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryXSubscriptionData(sortOption=");
        V0.append(this.a);
        V0.append(", filters=");
        V0.append(this.b);
        V0.append(", range=");
        V0.append(this.c);
        V0.append(", recentSearchesUris=");
        return je.L0(V0, this.d, ")");
    }
}
