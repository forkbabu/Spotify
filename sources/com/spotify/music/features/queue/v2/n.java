package com.spotify.music.features.queue.v2;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import com.spotify.music.features.queue.v2.b;
import com.spotify.music.features.queue.v2.d;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

final class n<M, E, F> implements g0<j, d, b> {
    public static final n a = new n();

    n() {
    }

    /* Return type fixed from 'com.spotify.mobius.e0' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.g0
    public e0<j, b> a(j jVar, d dVar) {
        j jVar2 = jVar;
        d dVar2 = dVar;
        if (dVar2 instanceof d.c) {
            d.c cVar = (d.c) dVar2;
            h.d(jVar2, "model");
            List W = kotlin.collections.d.W(jVar2.c());
            ArrayList arrayList = (ArrayList) W;
            arrayList.add(cVar.b(), (ContextTrack) arrayList.remove(cVar.a()));
            e0<j, b> a2 = e0.a(z42.l(new b.a(jVar2.g(), W, jVar2.e())));
            h.d(a2, "dispatch(\n        effect… model.prevTracks))\n    )");
            return a2;
        } else if (dVar2 instanceof d.b) {
            d.b bVar = (d.b) dVar2;
            h.d(jVar2, "model");
            e0<j, b> f = e0.f(j.b(jVar2, bVar.c(), "", bVar.a(), bVar.b(), null, 16));
            h.d(f, "next(\n        model.copy…revTracks\n        )\n    )");
            return f;
        } else if (dVar2 instanceof d.a) {
            d.a aVar = (d.a) dVar2;
            h.d(jVar2, "model");
            h.e(aVar, "event");
            h.e(jVar2, "model");
            e0<j, b> f2 = e0.f(j.b(jVar2, null, jVar2.g(), null, null, aVar.a(), 13));
            h.d(f2, "next(model.copy(playback…vision = model.revision))");
            return f2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
