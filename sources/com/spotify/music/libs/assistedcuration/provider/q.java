package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ e b;

    public /* synthetic */ q(z0 z0Var, e eVar) {
        this.a = z0Var;
        this.b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z0 z0Var = this.a;
        z0Var.c(this.b);
        return s.i0(z0Var);
    }
}
