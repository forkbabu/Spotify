package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class k implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ k(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.e eVar = (s.e) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.c)) {
            return e0.h();
        }
        w.b bVar = new w.b();
        v.a f = vVar.f();
        f.g(bVar);
        v a2 = f.a();
        u g = vVar.g();
        return e0.g(a2, z42.l(new r.m(SpeechRecognitionCommandType.START, g.i(), g.f()), new r.i("mic_started", g, vVar.b())));
    }
}
