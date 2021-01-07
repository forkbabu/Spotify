package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class g implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ g(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.m mVar = (s.m) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.b)) {
            w h2 = vVar.h();
            h2.getClass();
            if (!(h2 instanceof w.a)) {
                throw new IllegalStateException();
            }
        }
        return e0.a(z42.l(new r.j("final_transcript_received", vVar.g(), mVar.p(), vVar.b())));
    }
}
