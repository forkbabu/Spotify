package com.spotify.wakeword.sensory;

import com.spotify.audiorecord.api.e;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class r implements u {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ e b;

    public /* synthetic */ r(b0 b0Var, e eVar) {
        this.a = b0Var;
        this.b = eVar;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.c(this.b, tVar);
    }
}
