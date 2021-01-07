package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class m implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ m(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.f fVar = (s.f) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.c)) {
            w h2 = vVar.h();
            h2.getClass();
            if (!(h2 instanceof w.b)) {
                return e0.h();
            }
        }
        return e0.f(vVar.i(vVar.e() + 1));
    }
}
