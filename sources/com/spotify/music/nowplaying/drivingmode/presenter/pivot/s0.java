package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.k;

public class s0 implements k<PlayerState, l> {
    private final o0 a;

    public s0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // io.reactivex.k
    public tpf<l> a(g<PlayerState> gVar) {
        return gVar.F(new d0(this)).p0(gVar, new c0(this));
    }

    public /* synthetic */ tpf b(PlayerState playerState) {
        return this.a.c(playerState.contextUri()).Y0(BackpressureStrategy.BUFFER);
    }

    public l c(r0 r0Var, PlayerState playerState) {
        l.a a2 = l.a();
        this.a.getClass();
        String str = playerState.contextMetadata().get("image_url");
        if (str == null || str.isEmpty()) {
            str = "";
        } else if (!str.startsWith("spotify:image:")) {
            str = je.x0("spotify:image:", str);
        }
        a2.c(str);
        a2.b(Integer.toString(0));
        a2.h("current-item");
        a2.g(playerState.index().or((Optional<ContextIndex>) ContextIndex.create(0, 0)));
        a2.d(playerState.positionAsOfTimestamp().or((Optional<Long>) 0L).longValue());
        a2.a(this.a.d(playerState));
        a2.j(r0Var.c());
        a2.f(r0Var.b());
        a2.e(r0Var.a());
        a2.i(new cfc(playerState.contextUri()));
        return a2.build();
    }
}
