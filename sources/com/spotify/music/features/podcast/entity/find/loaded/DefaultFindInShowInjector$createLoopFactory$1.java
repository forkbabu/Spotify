package com.spotify.music.features.podcast.entity.find.loaded;

import com.spotify.mobius.e0;
import defpackage.u37;
import defpackage.x37;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DefaultFindInShowInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<w37, u37, e0<w37, Object>> {
    public static final DefaultFindInShowInjector$createLoopFactory$1 a = new DefaultFindInShowInjector$createLoopFactory$1();

    DefaultFindInShowInjector$createLoopFactory$1() {
        super(2, v37.class, "update", "update(Lcom/spotify/music/features/podcast/entity/find/loaded/domain/FindInShowModel;Lcom/spotify/music/features/podcast/entity/find/loaded/domain/FindInShowEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<w37, Object> invoke(w37 w37, u37 u37) {
        w37 w372 = w37;
        u37 u372 = u37;
        h.e(w372, "p1");
        h.e(u372, "p2");
        h.e(w372, "model");
        h.e(u372, "event");
        if (u372 instanceof u37.b) {
            u37.b bVar = (u37.b) u372;
            e0<w37, Object> f = e0.f(w37.a(w372, new x37.b(null), null, null, 6));
            h.d(f, "next(model.copy(state = …te.Loaded(event.result)))");
            return f;
        } else if (u372 instanceof u37.a) {
            u37.a aVar = (u37.a) u372;
            e0<w37, Object> f2 = e0.f(w37.a(w372, new x37.a(null), null, null, 6));
            h.d(f2, "next(model.copy(state = State.Error(event.error)))");
            return f2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
