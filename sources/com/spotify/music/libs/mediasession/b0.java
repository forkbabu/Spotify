package com.spotify.music.libs.mediasession;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayerState;
import defpackage.t8a;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.b;

public class b0 {
    private final g<PlayerState> a;
    private final t8a b;

    public b0(g<PlayerState> gVar, t8a.a aVar) {
        this.a = gVar;
        this.b = aVar.a(ViewUris.b2);
    }

    public a a() {
        return this.a.h0(1).a0().t(new b(this));
    }

    public a b() {
        return this.a.h0(1).a0().t(new a(this));
    }

    public /* synthetic */ e c(PlayerState playerState) {
        a aVar = b.a;
        String e = com.spotify.paste.widgets.b.e(playerState);
        if (!e.isEmpty()) {
            this.b.e(e, playerState.contextUri());
        }
        return aVar;
    }

    public /* synthetic */ e d(PlayerState playerState) {
        a aVar = b.a;
        String e = com.spotify.paste.widgets.b.e(playerState);
        if (!e.isEmpty()) {
            this.b.b(e);
        }
        return aVar;
    }
}
