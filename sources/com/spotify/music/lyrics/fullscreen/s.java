package com.spotify.music.lyrics.fullscreen;

import androidx.fragment.app.Fragment;
import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import defpackage.bxd;
import io.reactivex.g;
import io.reactivex.y;

public final class s implements fjf<q> {
    private final wlf<bxd.a> a;
    private final wlf<Fragment> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<y> d;
    private final wlf<cqe> e;

    public s(wlf<bxd.a> wlf, wlf<Fragment> wlf2, wlf<g<PlayerState>> wlf3, wlf<y> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get().a(this.b.get().A()), this.c.get(), this.d.get(), this.e.get());
    }
}
