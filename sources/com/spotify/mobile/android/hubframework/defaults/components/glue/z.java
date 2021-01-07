package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;

class z implements View.OnAttachStateChangeListener {
    final /* synthetic */ Context a;
    final /* synthetic */ BroadcastReceiver b;

    z(a0 a0Var, Context context, BroadcastReceiver broadcastReceiver) {
        this.a = context;
        this.b = broadcastReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        e6.b(this.a).c(this.b, new IntentFilter("on-demand-restricted"));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        e6.b(this.a).e(this.b);
    }
}
