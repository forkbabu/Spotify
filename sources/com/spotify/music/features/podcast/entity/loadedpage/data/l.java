package com.spotify.music.features.podcast.entity.loadedpage.data;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.features.podcast.entity.g;
import defpackage.o27;
import kotlin.jvm.internal.h;

public final class l implements k {
    private final g a;

    public l(g gVar) {
        h.e(gVar, "podcastEntityFilters");
        this.a = gVar;
    }

    @Override // com.spotify.music.features.podcast.entity.loadedpage.data.k
    public o27.a a(int i) {
        o27.a.AbstractC0653a aVar;
        boolean r = this.a.r();
        boolean s = this.a.s();
        if (r) {
            aVar = o27.a.AbstractC0653a.C0654a.a;
        } else if (s) {
            aVar = o27.a.AbstractC0653a.c.a;
        } else {
            aVar = o27.a.AbstractC0653a.b.a;
        }
        SortOption m = this.a.m();
        h.d(m, "podcastEntityFilters.currentSelectedSortOption");
        o27.a.c cVar = o27.a.c.b.a;
        h.e(m, "sortOption");
        String a2 = m.a();
        if (a2 != null) {
            int hashCode = a2.hashCode();
            if (hashCode != -1478775693) {
                if (hashCode == -1034364087 && a2.equals("number") && m.f()) {
                    cVar = o27.a.c.C0656c.a;
                }
            } else if (a2.equals("consumptionOrder")) {
                cVar = o27.a.c.C0655a.a;
            }
        }
        return new o27.a(aVar, cVar, new o27.a.b(0, i));
    }
}
