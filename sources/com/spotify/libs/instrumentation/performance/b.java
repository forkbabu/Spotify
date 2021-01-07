package com.spotify.libs.instrumentation.performance;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ ColdStartTracker a;
    public final /* synthetic */ long b;

    public /* synthetic */ b(ColdStartTracker coldStartTracker, long j) {
        this.a = coldStartTracker;
        this.b = j;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.l(this.b, (Integer) obj);
    }
}
