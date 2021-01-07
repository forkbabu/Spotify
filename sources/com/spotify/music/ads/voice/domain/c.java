package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class c implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ c(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.n nVar = (s.n) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.b) || nVar.p() != vVar.e()) {
            return e0.h();
        }
        w.a aVar = new w.a();
        v.a f = vVar.f();
        f.g(aVar);
        v a2 = f.a();
        u g = vVar.g();
        return e0.g(a2, z42.l(new r.m(SpeechRecognitionCommandType.STOP, g.i(), ""), new r.f(EarconType.ERROR), new r.i("mic_stopped", g, vVar.b())));
    }
}
