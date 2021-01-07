package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class n implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ n(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.k kVar = (s.k) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.b)) {
            w h2 = vVar.h();
            h2.getClass();
            if (!(h2 instanceof w.a)) {
                throw new IllegalStateException();
            }
        }
        if (vVar.d()) {
            return e0.h();
        }
        v.a f = vVar.f();
        f.d(true);
        return e0.g(f.a(), z42.l(new r.h(vVar.b(), vVar.g(), kVar.p())));
    }
}
