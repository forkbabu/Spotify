package com.spotify.music.features.profile.saveprofile.effecthandlers;

import okio.e;
import okio.i;
import okio.v;

final class d0 extends i {
    private final z b;
    private long c;

    d0(v vVar, z zVar) {
        super(vVar);
        this.b = zVar;
    }

    @Override // okio.i, okio.v
    public void l0(e eVar, long j) {
        super.l0(eVar, j);
        long j2 = this.c + j;
        this.c = j2;
        ((g) this.b).a.g(j2);
    }
}
