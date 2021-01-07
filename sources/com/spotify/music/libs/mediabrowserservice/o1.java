package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class o1 implements fjf<n1> {
    private final wlf<Context> a;
    private final wlf<cqe> b;
    private final wlf<MediaUriUtil> c;
    private final wlf<y> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<g<SessionState>> f;
    private final wlf<mk1> g;
    private final wlf<g<Boolean>> h;
    private final wlf<w> i;
    private final wlf<qja> j;
    private final wlf<nja> k;

    public o1(wlf<Context> wlf, wlf<cqe> wlf2, wlf<MediaUriUtil> wlf3, wlf<y> wlf4, wlf<g<PlayerState>> wlf5, wlf<g<SessionState>> wlf6, wlf<mk1> wlf7, wlf<g<Boolean>> wlf8, wlf<w> wlf9, wlf<qja> wlf10, wlf<nja> wlf11) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
