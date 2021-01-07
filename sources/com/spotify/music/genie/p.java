package com.spotify.music.genie;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.w1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.player.model.PlayerState;
import defpackage.mn9;
import defpackage.vm9;
import io.reactivex.g;
import io.reactivex.y;

public class p {
    private final vm9.b a;
    private final mn9.b b;
    private final y c;
    private final y d;
    private final g<SessionState> e;
    private final s f;
    private final g<PlayerState> g;

    public p(vm9.b bVar, mn9.b bVar2, y yVar, y yVar2, g<SessionState> gVar, g<PlayerState> gVar2, s sVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = yVar;
        this.d = yVar2;
        this.e = gVar;
        this.g = gVar2;
        this.f = sVar;
    }

    public o a(v1 v1Var) {
        w1 T = v1Var.T();
        ik1 A3 = v1Var.A3();
        return new q(this.a.a(T), this.b.a(T), this.c, this.d, this.e, this.g, A3, this.f);
    }
}
