package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;

public final /* synthetic */ class i implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ i(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        EarconType earconType;
        v vVar = this.a;
        s.i iVar = (s.i) obj;
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
        int ordinal = iVar.p().ordinal();
        if (ordinal == 0) {
            earconType = EarconType.PLAY;
        } else if (ordinal != 1) {
            earconType = EarconType.NEXT;
        } else {
            earconType = EarconType.SAVE;
        }
        return e0.g(a2, z42.l(new r.m(SpeechRecognitionCommandType.STOP, vVar.g().i(), ""), new r.f(earconType), new r.i("mic_stopped", vVar.g(), vVar.b()), new r.i("intent_received", vVar.g(), vVar.b())));
    }
}
