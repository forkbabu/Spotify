package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.h0;

public abstract class e {
    private static final String d = "e";
    private final BroadcastReceiver a;
    private final e6 b;
    private boolean c = false;

    private class b extends BroadcastReceiver {
        b(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                String unused = e.d;
                boolean z = k.n;
                e.this.c((a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public e() {
        h0.h();
        this.a = new b(null);
        this.b = e6.b(k.d());
        d();
    }

    public boolean b() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public abstract void c(a aVar, a aVar2);

    public void d() {
        if (!this.c) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            this.b.c(this.a, intentFilter);
            this.c = true;
        }
    }

    public void e() {
        if (this.c) {
            this.b.e(this.a);
            this.c = false;
        }
    }
}
