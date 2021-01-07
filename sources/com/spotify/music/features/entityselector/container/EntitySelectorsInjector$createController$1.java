package com.spotify.music.features.entityselector.container;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EntitySelectorsInjector$createController$1 extends FunctionReferenceImpl implements nmf<xy4, s<xy4, vy4>> {
    public static final EntitySelectorsInjector$createController$1 a = new EntitySelectorsInjector$createController$1();

    EntitySelectorsInjector$createController$1() {
        super(1, yy4.class, "init", "init(Lcom/spotify/music/features/entityselector/container/domain/EntitySelectorModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<xy4, vy4> invoke(xy4 xy4) {
        xy4 xy42 = xy4;
        h.e(xy42, "p1");
        h.e(xy42, "model");
        s<xy4, vy4> b = s.b(xy42);
        h.d(b, "First.first(model)");
        return b;
    }
}
