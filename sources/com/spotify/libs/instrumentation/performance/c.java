package com.spotify.libs.instrumentation.performance;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ ColdStartTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String f;

    public /* synthetic */ c(ColdStartTracker coldStartTracker, String str, long j, String str2) {
        this.a = coldStartTracker;
        this.b = str;
        this.c = j;
        this.f = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i(this.b, this.c, this.f, (Long) obj);
    }
}
