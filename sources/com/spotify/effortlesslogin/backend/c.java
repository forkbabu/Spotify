package com.spotify.effortlesslogin.backend;

import com.google.common.base.Optional;
import io.reactivex.t;
import io.reactivex.u;
import okhttp3.e;

public final /* synthetic */ class c implements u {
    public final /* synthetic */ e a;
    public final /* synthetic */ Optional b;

    public /* synthetic */ c(e eVar, Optional optional) {
        this.a = eVar;
        this.b = optional;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        e eVar = this.a;
        Optional optional = this.b;
        eVar.getClass();
        ((e) optional.get()).h1(new d(eVar, tVar));
    }
}
