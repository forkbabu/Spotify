package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;

/* renamed from: ce3  reason: default package */
class ce3 implements View.OnAttachStateChangeListener {
    final /* synthetic */ Context a;
    final /* synthetic */ BroadcastReceiver b;

    ce3(de3 de3, Context context, BroadcastReceiver broadcastReceiver) {
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
