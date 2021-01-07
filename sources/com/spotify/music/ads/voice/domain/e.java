package com.spotify.music.ads.voice.domain;

import com.spotify.mobius.e0;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;

public final /* synthetic */ class e implements ti0 {
    public final /* synthetic */ v a;

    public /* synthetic */ e(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v vVar = this.a;
        EarconType p = ((s.d) obj).p();
        if (p == EarconType.NEXT || p == EarconType.ERROR) {
            return e0.a(z42.l(new r.l()));
        }
        if (p == EarconType.PLAY) {
            return e0.a(z42.l(new r.a(vVar.g().a())));
        }
        if (p == EarconType.SAVE) {
            return e0.a(z42.l(new r.k(vVar.g()), new r.d(vVar.g())));
        }
        return e0.h();
    }
}
