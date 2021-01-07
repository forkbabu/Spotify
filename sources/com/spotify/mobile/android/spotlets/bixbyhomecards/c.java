package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public class c {
    private final a a = new a();
    private final Context b;
    private final com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider.a c;
    private final h d;
    private final Intent e;
    private boolean f;

    /* access modifiers changed from: package-private */
    public static class a implements ServiceConnection {
        a a;

        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.a = (a) iBinder;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.a = null;
        }
    }

    public c(Context context, com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider.a aVar, h hVar) {
        this.b = context;
        this.c = aVar;
        this.d = hVar;
        this.e = new Intent(context, BixbyHomeCardService.class);
    }

    public void a() {
        if (this.d.b()) {
            if (this.d.a()) {
                this.c.e();
            }
            this.b.getApplicationContext().bindService(this.e, this.a, 65);
            this.f = true;
        }
    }

    public void b() {
        if (this.f) {
            a aVar = this.a.a;
            if (aVar != null) {
                aVar.a().f();
            }
            this.c.f();
            this.b.getApplicationContext().unbindService(this.a);
            this.f = false;
        }
    }
}
