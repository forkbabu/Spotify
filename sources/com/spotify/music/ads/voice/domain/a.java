package com.spotify.music.ads.voice.domain;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class a implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ a(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        s.j jVar = (s.j) obj;
        w h = vVar.h();
        h.getClass();
        if (!(h instanceof w.b)) {
            w h2 = vVar.h();
            h2.getClass();
            if (!(h2 instanceof w.a)) {
                throw new IllegalStateException();
            }
        }
        w.a aVar = new w.a();
        v.a f = vVar.f();
        f.g(aVar);
        v a2 = f.a();
        Logger.b("[VoiceAd] onSpeechRecognitionError: %s", jVar.p().a());
        return e0.g(a2, z42.l(new r.m(SpeechRecognitionCommandType.STOP, vVar.g().i(), ""), new r.f(EarconType.ERROR), new r.i("mic_stopped", vVar.g(), vVar.b()), new r.g(vVar.b(), vVar.g(), jVar.p().a())));
    }
}
