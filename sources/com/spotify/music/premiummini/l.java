package com.spotify.music.premiummini;

import com.spotify.remoteconfig.ia;
import io.reactivex.s;
import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

public final class l implements k {
    private a<Boolean> a;

    public l(ia iaVar) {
        h.e(iaVar, "premiumMiniProperties");
        a<Boolean> i1 = a.i1(Boolean.FALSE);
        h.d(i1, "BehaviorSubject.createDe…EMIUM_MINI_DEFAULT_STATE)");
        this.a = i1;
    }

    @Override // com.spotify.music.premiummini.k
    public boolean a() {
        Boolean j1 = this.a.j1();
        h.c(j1);
        return j1.booleanValue();
    }

    @Override // com.spotify.music.premiummini.k
    public s<Boolean> b() {
        return this.a;
    }

    @Override // com.spotify.music.premiummini.k
    public void c(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }
}
