package com.spotify.rxjava2;

import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class f implements i {
    public final /* synthetic */ z a;
    public final /* synthetic */ String b;
    public final /* synthetic */ StackTraceElement[] c;
    public final /* synthetic */ g d;

    public /* synthetic */ f(z zVar, String str, StackTraceElement[] stackTraceElementArr, g gVar) {
        this.a = zVar;
        this.b = str;
        this.c = stackTraceElementArr;
        this.d = gVar;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        this.a.d(this.b, this.c, this.d, hVar);
    }
}
