package com.spotify.rxjava2;

import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.b;
import io.reactivex.functions.f;

public final /* synthetic */ class g implements f {
    public final /* synthetic */ z a;
    public final /* synthetic */ String b;
    public final /* synthetic */ b c;
    public final /* synthetic */ b0 d;

    public /* synthetic */ g(z zVar, String str, b bVar, b0 b0Var) {
        this.a = zVar;
        this.b = str;
        this.c = bVar;
        this.d = b0Var;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        z zVar = this.a;
        String str = this.b;
        b bVar = this.c;
        b0 b0Var = this.d;
        zVar.getClass();
        Logger.b("Removing %s#%d subscription. Current count: %d", str, Integer.valueOf(zVar.hashCode()), Integer.valueOf(zVar.a.size()));
        bVar.dispose();
        synchronized (zVar) {
            zVar.a.remove(b0Var);
            Logger.b("Removed %s#%d subscription. Current count: %d", str, Integer.valueOf(zVar.hashCode()), Integer.valueOf(zVar.a.size()));
        }
    }
}
