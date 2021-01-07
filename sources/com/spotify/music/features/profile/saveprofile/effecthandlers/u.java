package com.spotify.music.features.profile.saveprofile.effecthandlers;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public final /* synthetic */ class u implements w {
    public final /* synthetic */ com.spotify.http.u a;

    public /* synthetic */ u(com.spotify.http.u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new a(this.a));
    }
}
