package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import java.util.concurrent.ExecutorService;

public final class FirebaseInstanceIdReceiver extends b6 {
    public static final /* synthetic */ int f = 0;
    private final ExecutorService c = h.a();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a aVar;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            if (Build.VERSION.SDK_INT <= 18) {
                intent.removeCategory(context.getPackageName());
            }
            if ("google.com/iid".equals(intent.getStringExtra("from"))) {
                aVar = new v(this.c);
            } else {
                aVar = new f(context, this.c);
            }
            aVar.a(intent).c(this.c, new q(isOrderedBroadcast(), goAsync()));
        }
    }
}
