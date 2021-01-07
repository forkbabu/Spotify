package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ z a;

    public /* synthetic */ d(z zVar) {
        this.a = zVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z zVar = this.a;
        if (zVar.h()) {
            return s.i0(Boolean.TRUE);
        }
        return zVar.d();
    }
}
