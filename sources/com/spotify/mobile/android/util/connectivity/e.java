package com.spotify.mobile.android.util.connectivity;

import android.content.Context;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ Context a;

    public /* synthetic */ e(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(b0.a(this.a));
    }
}
