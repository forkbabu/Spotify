package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: my  reason: default package */
public final class my extends BroadcastReceiver {
    final /* synthetic */ ny a;

    /* synthetic */ my(ny nyVar) {
        this.a = nyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
