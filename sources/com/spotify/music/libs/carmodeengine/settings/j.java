package com.spotify.music.libs.carmodeengine.settings;

import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ q a;

    public /* synthetic */ j(q qVar) {
        this.a = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.l();
    }
}
