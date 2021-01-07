package com.spotify.rxjava2;

import android.content.Intent;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class c implements u {
    public final /* synthetic */ n a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(n nVar, Intent intent, String str) {
        this.a = nVar;
        this.b = intent;
        this.c = str;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.b(this.b, this.c, tVar);
    }
}
