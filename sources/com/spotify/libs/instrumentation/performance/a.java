package com.spotify.libs.instrumentation.performance;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ ColdStartTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Long c;

    public /* synthetic */ a(ColdStartTracker coldStartTracker, String str, Long l) {
        this.a = coldStartTracker;
        this.b = str;
        this.c = l;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, this.c, (Long) obj);
    }
}
