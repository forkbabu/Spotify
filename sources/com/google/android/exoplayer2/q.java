package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* access modifiers changed from: package-private */
public final class q {
    private final Context a;
    private final a b;
    private boolean c;

    /* access modifiers changed from: private */
    public final class a extends BroadcastReceiver implements Runnable {
        private final b a;
        private final Handler b;

        public a(Handler handler, b bVar) {
            this.b = handler;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.c) {
                u0.this.j(false);
            }
        }
    }

    public interface b {
    }

    public q(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public void b(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else if (!z && this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
