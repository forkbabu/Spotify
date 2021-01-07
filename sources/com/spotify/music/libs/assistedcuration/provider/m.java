package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {
    public final /* synthetic */ v a;
    public final /* synthetic */ e b;

    public /* synthetic */ m(v vVar, e eVar) {
        this.a = vVar;
        this.b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        v vVar = this.a;
        vVar.c(this.b);
        return s.i0(vVar);
    }
}
