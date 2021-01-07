package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import com.spotify.libs.search.history.SearchHistory;
import com.spotify.libs.search.history.h;
import com.spotify.libs.search.offline.model.OfflineEpisode;
import com.spotify.libs.search.offline.model.OfflineResults;
import com.spotify.libs.search.offline.model.OfflineTrack;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.connection.g;
import defpackage.dza;
import defpackage.yya;
import java.util.List;

public class u0 {
    private final sg0<jua, b91> a;
    private final o0 b;
    private final h c;
    private final qqa d;
    private final sg0<b91, b91> e;

    public u0(sg0<jua, b91> sg0, o0 o0Var, h hVar, qqa qqa, sg0<b91, b91> sg02) {
        this.a = sg0;
        this.b = o0Var;
        this.c = hVar;
        this.d = qqa;
        this.e = sg02;
    }

    public b91 a(bza bza, dza.d dVar) {
        String d2 = bza.d();
        cza f = dVar.f();
        try {
            return this.e.apply(this.a.apply(jua.a(f.b(), d2, Optional.absent(), f.c())));
        } catch (Exception e2) {
            Assertion.i("Failed transforming search proto result to hubs for query: " + d2, e2);
            return HubsImmutableViewModel.EMPTY;
        }
    }

    public b91 b(bza bza, dza.a aVar) {
        SearchHistory f = aVar.f();
        g b2 = bza.b();
        b2.getClass();
        boolean z = b2 instanceof g.c;
        boolean c2 = bza.a().c();
        Optional<b91> a2 = this.c.a(f.getItems(), bza.a().b());
        if (a2.isPresent()) {
            return a2.get();
        }
        return this.d.a(z, c2);
    }

    public b91 c(bza bza, dza.c cVar) {
        OfflineResults f = cVar.f();
        String d2 = bza.d();
        List<OfflineTrack> hits = f.tracks().hits();
        List<OfflineEpisode> hits2 = f.episodes().hits();
        if (!hits.isEmpty() || !hits2.isEmpty()) {
            return z81.i().a(this.b.e(hits)).a(this.b.d(hits2)).c(rqa.a(d2)).g();
        }
        return this.d.b(d2, true);
    }

    public /* synthetic */ b91 d(String str, yya.c cVar) {
        return this.d.d(str, Optional.of(cVar.e()));
    }

    public /* synthetic */ b91 e(String str, yya.b bVar) {
        return this.d.d(str, Optional.absent());
    }

    public /* synthetic */ b91 f(boolean z, boolean z2, yya.a aVar) {
        return this.d.a(z, z2);
    }
}
