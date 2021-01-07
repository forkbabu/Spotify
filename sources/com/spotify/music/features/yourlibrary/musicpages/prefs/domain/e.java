package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.j;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;

public final /* synthetic */ class e implements ti0 {
    public final /* synthetic */ m a;

    public /* synthetic */ e(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k.d dVar = (k.d) obj;
        m.a e = this.a.e();
        e.e(Optional.of(dVar.f()));
        m a2 = e.a();
        if (!a2.d().isPresent()) {
            return e0.g(a2, z42.l(new j.a(dVar.f())));
        }
        return e0.f(a2);
    }
}
