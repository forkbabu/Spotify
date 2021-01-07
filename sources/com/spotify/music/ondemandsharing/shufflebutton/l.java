package com.spotify.music.ondemandsharing.shufflebutton;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;

class l implements View.OnAttachStateChangeListener {
    final /* synthetic */ BroadcastReceiver a;
    final /* synthetic */ Context b;
    final /* synthetic */ m c;

    l(m mVar, BroadcastReceiver broadcastReceiver, Context context) {
        this.c = mVar;
        this.a = broadcastReceiver;
        this.b = context;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Context context = view.getContext();
        context.getClass();
        e6.b(context).c(this.a, new IntentFilter("on-demand-restricted"));
        this.c.a.a(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.c.a.b();
        e6.b(this.b).e(this.a);
    }
}
