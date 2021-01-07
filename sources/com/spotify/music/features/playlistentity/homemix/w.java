package com.spotify.music.features.playlistentity.homemix;

import com.google.common.collect.ImmutableList;
import defpackage.zt6;

public final class w implements fjf<v> {
    private final wlf<fe6> a;
    private final wlf<xb6> b;
    private final wlf<dd6> c;
    private final wlf<ImmutableList<gu6>> d;
    private final wlf<zt6.b.a> e;

    public w(wlf<fe6> wlf, wlf<xb6> wlf2, wlf<dd6> wlf3, wlf<ImmutableList<gu6>> wlf4, wlf<zt6.b.a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a, this.b, this.c, this.d, this.e);
    }
}
