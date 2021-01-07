package com.spotify.mobile.android.util.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ IntentFilter b;

    public /* synthetic */ f(Context context, IntentFilter intentFilter) {
        this.a = context;
        this.b = intentFilter;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.a;
        return u0e.a(context, this.b).j0(new g(context)).E0(s.c0(new e(context))).E();
    }
}
