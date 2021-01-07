package com.spotify.libs.instrumentation.performance;

import android.content.Intent;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ ColdStartTracker a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ d(ColdStartTracker coldStartTracker, long j, Intent intent) {
        this.a = coldStartTracker;
        this.b = j;
        this.c = intent;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k(this.b, this.c, (Long) obj);
    }
}
