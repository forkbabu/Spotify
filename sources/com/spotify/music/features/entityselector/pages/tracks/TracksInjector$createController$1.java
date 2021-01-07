package com.spotify.music.features.entityselector.pages.tracks;

import com.spotify.mobius.s;
import defpackage.c05;
import defpackage.g05;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TracksInjector$createController$1 extends FunctionReferenceImpl implements nmf<f05, s<f05, c05>> {
    public static final TracksInjector$createController$1 a = new TracksInjector$createController$1();

    TracksInjector$createController$1() {
        super(1, e05.class, "init", "init(Lcom/spotify/music/features/entityselector/pages/tracks/domain/TracksModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<f05, c05> invoke(f05 f05) {
        f05 f052 = f05;
        h.e(f052, "p1");
        h.e(f052, "model");
        if (f052.d() instanceof g05.c) {
            s<f05, c05> b = s.b(f052);
            h.d(b, "First.first(model)");
            return b;
        }
        s<f05, c05> c = s.c(f052, d.G(new c05.b(f052.c())));
        h.d(c, "First.first(model, setOf…ks(model.playlistItems)))");
        return c;
    }
}
