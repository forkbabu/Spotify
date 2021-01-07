package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.c;
import com.google.firebase.iid.p0;
import com.google.firebase.iid.s0;
import com.google.firebase.iid.u0;
import java.util.concurrent.ExecutorService;

public abstract class g extends Service {
    final ExecutorService a = eu.a().a(new tr("Firebase-Messaging-Intent-Handle"), 2);
    private Binder b;
    private final Object c = new Object();
    private int f;
    private int n = 0;

    class a implements u0.a {
        a() {
        }

        @Override // com.google.firebase.iid.u0.a
        public com.google.android.gms.tasks.g<Void> a(Intent intent) {
            return g.this.e(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void d(Intent intent) {
        if (intent != null) {
            s0.a(intent);
        }
        synchronized (this.c) {
            int i = this.n - 1;
            this.n = i;
            if (i == 0) {
                stopSelfResult(this.f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private com.google.android.gms.tasks.g<Void> e(Intent intent) {
        boolean z;
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (n.d(intent)) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    oy oyVar = (oy) c.h().f(oy.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (oyVar != null) {
                        String stringExtra = intent.getStringExtra("google.c.a.c_id");
                        oyVar.b("fcm", "_ln", stringExtra);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "Firebase");
                        bundle.putString(Constants.MEDIUM, "notification");
                        bundle.putString("campaign", stringExtra);
                        oyVar.a("fcm", "_cmp", bundle);
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                n.c("_no", intent);
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j.e(null);
        }
        h hVar = new h();
        this.a.execute(new d(this, intent, hVar));
        return hVar.a();
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.b == null) {
            this.b = new u0(new a());
        }
        return this.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.f = i2;
            this.n++;
        }
        Intent b2 = p0.a().b();
        if (b2 == null) {
            d(intent);
            return 2;
        }
        com.google.android.gms.tasks.g<Void> e = e(b2);
        if (e.q()) {
            d(intent);
            return 2;
        }
        e.c(e.a, new f(this, intent));
        return 3;
    }
}
