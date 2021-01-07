package com.spotify.music.marquee;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public class n {
    private MarqueeService a;
    private final Context b;
    private final fg0 c;
    private final ServiceConnection d = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            n.this.a = MarqueeService.this;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public n(Context context, fg0 fg0) {
        this.b = context.getApplicationContext();
        this.c = fg0;
    }

    public void b() {
        fg0 fg0 = this.c;
        Context context = this.b;
        int i = MarqueeService.q;
        fg0.a(new Intent(context, MarqueeService.class), this.d, MarqueeService.class.getSimpleName());
    }

    public void c() {
        MarqueeService marqueeService = this.a;
        if (marqueeService != null) {
            marqueeService.e();
            this.a = null;
        }
        this.c.c(this.d, MarqueeService.class.getSimpleName());
    }
}
