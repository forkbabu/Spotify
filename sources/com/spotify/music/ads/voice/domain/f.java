package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class f implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ f(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.l lVar = (s.l) obj;
        w h = vVar.h();
        h.getClass();
        if (h instanceof w.b) {
            v i = vVar.i(vVar.e() + 1);
            String p = lVar.p();
            v.a f = i.f();
            f.b(p);
            v a2 = f.a();
            return e0.g(a2, z42.l(new r.f(EarconType.LISTEN), new r.n(vVar.g().i(), a2.e())));
        }
        throw new IllegalStateException();
    }
}
