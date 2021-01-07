package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.http.u;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public final /* synthetic */ class p implements w {
    public final /* synthetic */ u a;

    public /* synthetic */ p(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new b(this.a));
    }
}
