package com.spotify.music.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.KeyEvent;
import io.reactivex.internal.operators.completable.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ MediaButtonReceiver a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ KeyEvent c;
    public final /* synthetic */ int f;
    public final /* synthetic */ BroadcastReceiver.PendingResult n;

    public /* synthetic */ a(MediaButtonReceiver mediaButtonReceiver, Context context, KeyEvent keyEvent, int i, BroadcastReceiver.PendingResult pendingResult) {
        this.a = mediaButtonReceiver;
        this.b = context;
        this.c = keyEvent;
        this.f = i;
        this.n = pendingResult;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.b(this.b, this.c, this.f, this.n);
        return b.a;
    }
}
