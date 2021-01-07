package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class t implements Callable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ e b;

    public /* synthetic */ t(e0 e0Var, e eVar) {
        this.a = e0Var;
        this.b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e0 e0Var = this.a;
        e0Var.c(this.b);
        return s.i0(e0Var);
    }
}
