package com.spotify.rxjava2;

import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class h implements u {
    public final /* synthetic */ z a;
    public final /* synthetic */ String b;
    public final /* synthetic */ StackTraceElement[] c;
    public final /* synthetic */ s d;

    public /* synthetic */ h(z zVar, String str, StackTraceElement[] stackTraceElementArr, s sVar) {
        this.a = zVar;
        this.b = str;
        this.c = stackTraceElementArr;
        this.d = sVar;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.a(this.b, this.c, this.d, tVar);
    }
}
