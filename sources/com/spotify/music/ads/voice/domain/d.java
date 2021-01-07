package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class d implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ d(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.c cVar = (s.c) obj;
        if (!IntentType.d("play", vVar.g().f())) {
            return e0.h();
        }
        w.a aVar = new w.a();
        v.a f = vVar.f();
        f.g(aVar);
        return e0.g(f.a(), z42.l(new r.m(SpeechRecognitionCommandType.STOP, vVar.g().i(), ""), new r.a(vVar.g().a()), new r.i("mic_stopped", vVar.g(), vVar.b())));
    }
}
