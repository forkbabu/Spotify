package com.spotify.mobile.android.observablestates.headset;

import android.content.Context;
import android.content.IntentFilter;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class b implements u {
    public final /* synthetic */ Context a;

    public /* synthetic */ b(Context context) {
        this.a = context;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        Context context = this.a;
        d dVar = new d(tVar);
        context.registerReceiver(dVar, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        tVar.e(new a(context, dVar));
    }
}
