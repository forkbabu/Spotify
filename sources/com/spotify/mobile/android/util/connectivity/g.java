package com.spotify.mobile.android.util.connectivity;

import android.content.Context;
import android.content.Intent;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ Context a;

    public /* synthetic */ g(Context context) {
        this.a = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Intent intent = (Intent) obj;
        return Boolean.valueOf(b0.a(this.a));
    }
}
