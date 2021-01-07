package com.spotify.music.libs.mediabrowserservice;

import androidx.media.b;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ b.j a;

    public /* synthetic */ o(b.j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b.j jVar = this.a;
        Logger.c((Throwable) obj, "Failed to load children", new Object[0]);
        jVar.g(r1.p);
    }
}
