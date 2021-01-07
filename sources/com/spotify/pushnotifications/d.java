package com.spotify.pushnotifications;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ d(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        g gVar = this.a;
        gVar.getClass();
        Logger.b("Token received", new Object[0]);
        gVar.b((String) obj);
    }
}
