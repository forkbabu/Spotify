package com.spotify.music.features.entityselector.pages.podcasts;

import com.spotify.mobius.s;
import defpackage.gz4;
import defpackage.hz4;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class PodcastsInjector$createController$1 extends FunctionReferenceImpl implements nmf<kz4, s<kz4, hz4>> {
    public static final PodcastsInjector$createController$1 a = new PodcastsInjector$createController$1();

    PodcastsInjector$createController$1() {
        super(1, jz4.class, "init", "init(Lcom/spotify/music/features/entityselector/pages/podcasts/domain/PodcastsModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<kz4, hz4> invoke(kz4 kz4) {
        kz4 kz42 = kz4;
        h.e(kz42, "p1");
        h.e(kz42, "model");
        if (kz42.c() instanceof gz4.c) {
            s<kz4, hz4> b = s.b(kz42);
            h.d(b, "First.first(model)");
            return b;
        }
        s<kz4, hz4> c = s.c(kz42, d.G(new hz4.b(kz42.b())));
        h.d(c, "First.first(model, setOf…ed(model.playlistItems)))");
        return c;
    }
}
