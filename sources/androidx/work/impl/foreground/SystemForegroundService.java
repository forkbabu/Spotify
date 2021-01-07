package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.q;
import androidx.work.impl.foreground.c;
import androidx.work.j;

public class SystemForegroundService extends q implements c.a {
    private static final String o = j.f("SystemFgService");
    private static SystemForegroundService p = null;
    private Handler b;
    private boolean c;
    c f;
    NotificationManager n;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f.g();
        }
    }

    class b implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ Notification b;
        final /* synthetic */ int c;

        b(int i, Notification notification, int i2) {
            this.a = i;
            this.b = notification;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.a, this.b, this.c);
            } else {
                SystemForegroundService.this.startForeground(this.a, this.b);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ Notification b;

        c(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.n.notify(this.a, this.b);
        }
    }

    class d implements Runnable {
        final /* synthetic */ int a;

        d(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.n.cancel(this.a);
        }
    }

    public static SystemForegroundService b() {
        return p;
    }

    private void c() {
        this.b = new Handler(Looper.getMainLooper());
        this.n = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f = cVar;
        cVar.j(this);
    }

    public void a(int i) {
        this.b.post(new d(i));
    }

    public void d(int i, Notification notification) {
        this.b.post(new c(i, notification));
    }

    public void e(int i, int i2, Notification notification) {
        this.b.post(new b(i, notification, i2));
    }

    public void f() {
        this.c = true;
        j.c().a(o, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        p = null;
        stopSelf();
    }

    public void g() {
        this.b.post(new a());
    }

    @Override // androidx.lifecycle.q, android.app.Service
    public void onCreate() {
        super.onCreate();
        p = this;
        c();
    }

    @Override // androidx.lifecycle.q, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f.h();
    }

    @Override // androidx.lifecycle.q, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            j.c().d(o, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f.h();
            c();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f.i(intent);
        return 3;
    }
}
