package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l<T extends IInterface> {
    private static final Map<String, Handler> l = new HashMap();
    private final Context a;
    private final a b;
    private final String c;
    private final List<b> d = new ArrayList();
    private boolean e;
    private final Intent f;
    private final h<T> g;
    private final WeakReference<g> h;
    private final IBinder.DeathRecipient i = new c(this);
    private ServiceConnection j;
    private T k;

    public l(Context context, a aVar, String str, Intent intent, h<T> hVar) {
        this.a = context;
        this.b = aVar;
        this.c = str;
        this.f = intent;
        this.g = hVar;
        this.h = new WeakReference<>(null);
    }

    static /* synthetic */ void e(l lVar, b bVar) {
        if (lVar.k == null && !lVar.e) {
            lVar.b.f("Initiate binding to the service.", new Object[0]);
            lVar.d.add(bVar);
            k kVar = new k(lVar);
            lVar.j = kVar;
            lVar.e = true;
            if (!lVar.a.bindService(lVar.f, kVar, 1)) {
                lVar.b.f("Failed to bind to the service.", new Object[0]);
                lVar.e = false;
                for (b bVar2 : lVar.d) {
                    m<?> b2 = bVar2.b();
                    if (b2 != null) {
                        b2.d(new ar());
                    }
                }
                lVar.d.clear();
            }
        } else if (lVar.e) {
            lVar.b.f("Waiting to bind to the service.", new Object[0]);
            lVar.d.add(bVar);
        } else {
            bVar.run();
        }
    }

    /* access modifiers changed from: private */
    public final void h(b bVar) {
        Handler handler;
        Map<String, Handler> map = l;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.c);
        }
        handler.post(bVar);
    }

    static /* synthetic */ void n(l lVar) {
        lVar.b.f("linkToDeath", new Object[0]);
        try {
            lVar.k.asBinder().linkToDeath(lVar.i, 0);
        } catch (RemoteException e2) {
            lVar.b.d(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void p(l lVar) {
        lVar.b.f("unlinkToDeath", new Object[0]);
        lVar.k.asBinder().unlinkToDeath(lVar.i, 0);
    }

    public final void b() {
        h(new e(this));
    }

    public final void c(b bVar) {
        h(new d(this, bVar.b(), bVar));
    }

    public final T f() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void k() {
        this.b.f("reportBinderDeath", new Object[0]);
        g gVar = this.h.get();
        if (gVar == null) {
            this.b.f("%s : Binder has died.", this.c);
            for (b bVar : this.d) {
                m<?> b2 = bVar.b();
                if (b2 != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    b2.d(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
                }
            }
            this.d.clear();
            return;
        }
        this.b.f("calling onBinderDied", new Object[0]);
        gVar.e();
    }
}
