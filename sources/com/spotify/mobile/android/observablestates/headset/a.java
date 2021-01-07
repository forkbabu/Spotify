package com.spotify.mobile.android.observablestates.headset;

import android.content.BroadcastReceiver;
import android.content.Context;
import io.reactivex.functions.f;

public final /* synthetic */ class a implements f {
    public final /* synthetic */ Context a;
    public final /* synthetic */ BroadcastReceiver b;

    public /* synthetic */ a(Context context, BroadcastReceiver broadcastReceiver) {
        this.a = context;
        this.b = broadcastReceiver;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.unregisterReceiver(this.b);
    }
}
