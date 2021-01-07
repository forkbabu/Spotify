package com.spotify.player.di;

import com.spotify.player.controls.EsperantoPlayerControls;
import com.spotify.player.controls.d;
import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.a;
import com.spotify.player.internal.c;
import com.spotify.remoteconfig.rj;

public final class j implements fjf<d> {
    private final wlf<c> a;
    private final wlf<k.b> b;
    private final wlf<a> c;
    private final wlf<rj> d;

    public j(wlf<c> wlf, wlf<k.b> wlf2, wlf<a> wlf3, wlf<rj> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static d a(ajf<c> ajf, ajf<k.b> ajf2, a aVar, rj rjVar) {
        if (rjVar.a()) {
            return new EsperantoPlayerControls(ajf2.get(), aVar);
        }
        return new com.spotify.player.controls.a(ajf.get(), aVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(ejf.a(this.a), ejf.a(this.b), this.c.get(), this.d.get());
    }
}
