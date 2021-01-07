package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.music.features.yourlibraryx.effecthandlers.g;
import io.reactivex.functions.a;
import java.util.Set;
import kotlin.Pair;

final class h implements a {
    final /* synthetic */ g.b.c a;
    final /* synthetic */ Pair b;

    h(g.b.c cVar, Pair pair) {
        this.a = cVar;
        this.b = pair;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        g.d(this.a.a.a).a((Set) this.b.c(), (Set) this.b.d());
    }
}
