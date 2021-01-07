package com.spotify.music.libs.carmodeengine.settings;

import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ q a;

    public /* synthetic */ g(q qVar) {
        this.a = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.i();
    }
}
