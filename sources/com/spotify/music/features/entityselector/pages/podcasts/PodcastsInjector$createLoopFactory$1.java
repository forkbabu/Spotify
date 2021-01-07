package com.spotify.music.features.entityselector.pages.podcasts;

import com.spotify.mobius.e0;
import defpackage.gz4;
import defpackage.hz4;
import defpackage.iz4;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class PodcastsInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<kz4, iz4, e0<kz4, hz4>> {
    public static final PodcastsInjector$createLoopFactory$1 a = new PodcastsInjector$createLoopFactory$1();

    PodcastsInjector$createLoopFactory$1() {
        super(2, jz4.class, "update", "update(Lcom/spotify/music/features/entityselector/pages/podcasts/domain/PodcastsModel;Lcom/spotify/music/features/entityselector/pages/podcasts/domain/PodcastsEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<kz4, hz4> invoke(kz4 kz4, iz4 iz4) {
        kz4 kz42 = kz4;
        iz4 iz42 = iz4;
        h.e(kz42, "p1");
        h.e(iz42, "p2");
        h.e(kz42, "model");
        h.e(iz42, "event");
        if (iz42 instanceof iz4.b) {
            if (kz42.c() instanceof gz4.c) {
                e0<kz4, hz4> h = e0.h();
                h.d(h, "noChange()");
                return h;
            }
            e0<kz4, hz4> g = e0.g(kz4.a(kz42, gz4.d.a, null, 2), z42.l(new hz4.b(kz42.b())));
            h.d(g, "next(\n            model.…playlistItems))\n        )");
            return g;
        } else if (iz42 instanceof iz4.c) {
            e0<kz4, hz4> f = e0.f(kz4.a(kz42, ((iz4.c) iz42).a(), null, 2));
            h.d(f, "next(\n            model.…tEpisodesState)\n        )");
            return f;
        } else if (iz42 instanceof iz4.a) {
            iz4.a aVar = (iz4.a) iz42;
            gz4 c = kz42.c();
            if (c != null) {
                List<sy4> a2 = ((gz4.c) c).a();
                ArrayList arrayList = new ArrayList();
                for (T t : a2) {
                    if (!h.a(t.a(), aVar.a().a())) {
                        arrayList.add(t);
                    }
                }
                e0<kz4, hz4> g2 = e0.g(kz4.a(kz42, new gz4.c(arrayList), null, 2), z42.l(new hz4.a(aVar.a())));
                h.d(g2, "next(\n        model.copy…nt.podcastEpisode))\n    )");
                return g2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.entityselector.pages.podcasts.domain.PodcastEpisodesState.Loaded");
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
