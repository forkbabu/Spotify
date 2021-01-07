package com.spotify.rxjava2;

import android.content.ServiceConnection;
import io.reactivex.functions.f;

public final /* synthetic */ class b implements f {
    public final /* synthetic */ n a;
    public final /* synthetic */ ServiceConnection b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(n nVar, ServiceConnection serviceConnection, String str) {
        this.a = nVar;
        this.b = serviceConnection;
        this.c = str;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.c(this.b, this.c);
    }
}
