package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.BroadcastReceiver;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ BroadcastReceiver.PendingResult b;

    public /* synthetic */ p(f0 f0Var, BroadcastReceiver.PendingResult pendingResult) {
        this.a = f0Var;
        this.b = pendingResult;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Throwable) obj);
    }
}
