package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.http.u;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public final /* synthetic */ class t implements w {
    public final /* synthetic */ u a;

    public /* synthetic */ t(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new i(this.a));
    }
}
