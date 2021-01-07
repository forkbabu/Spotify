package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.i;

public class c extends BroadcastReceiver {
    private static c b;
    private Context a;

    private c(Context context) {
        this.a = context.getApplicationContext();
    }

    public static c a(Context context) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            c cVar = b;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(context);
            b = cVar2;
            if (!uf.c(cVar2)) {
                try {
                    e6.b(cVar2.a).c(cVar2, new IntentFilter("com.parse.bolts.measurement_event"));
                } catch (Throwable th) {
                    uf.b(th, cVar2);
                }
            }
            return b;
        } catch (Throwable th2) {
            uf.b(th2, c.class);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!uf.c(this)) {
            try {
                if (!uf.c(this)) {
                    try {
                        e6.b(this.a).e(this);
                    } catch (Throwable th) {
                        uf.b(th, this);
                    }
                }
                super.finalize();
            } catch (Throwable th2) {
                uf.b(th2, this);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!uf.c(this)) {
            try {
                i iVar = new i(context);
                String str = "bf_" + intent.getStringExtra("event_name");
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                Bundle bundle = new Bundle();
                for (String str2 : bundleExtra.keySet()) {
                    bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str2));
                }
                iVar.d(str, bundle);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
