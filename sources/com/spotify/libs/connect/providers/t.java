package com.spotify.libs.connect.providers;

import com.spotify.music.spotlets.offline.util.c;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class t {
    private final g<PlayerState> a;
    private final gs0 b;
    private final c c;

    public t(g<PlayerState> gVar, gs0 gs0, c cVar) {
        this.a = gVar;
        this.b = gs0;
        this.c = cVar;
    }

    public s<Boolean> a() {
        g<R> l = this.a.l(PlayerStateTransformers.e());
        l.getClass();
        return s.m(new v(l), this.c.a().j0(g.a), this.b.a().j0(b.a), d.a).D0(e.a).E();
    }

    public s<Boolean> b() {
        g<R> l = this.a.l(PlayerStateTransformers.e());
        l.getClass();
        return s.n(new v(l), this.b.a().j0(b.a), a.a).D0(c.a).E();
    }
}
