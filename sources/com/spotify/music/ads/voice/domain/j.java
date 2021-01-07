package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class j implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ j(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.h hVar = (s.h) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.b)) {
            return e0.h();
        }
        v i = vVar.i(vVar.e() + 1);
        return e0.g(i, z42.l(new r.n((i.g().i() + i.g().h()) - hVar.p(), i.e())));
    }
}
