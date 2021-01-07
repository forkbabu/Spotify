package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class l {
    private final Context a;
    private final e b;
    private final nh c;
    private final r d;
    private final Executor e;
    private final a f;
    private final ti g;

    public l(Context context, e eVar, nh nhVar, r rVar, Executor executor, a aVar, ti tiVar) {
        this.a = context;
        this.b = eVar;
        this.c = nhVar;
        this.d = rVar;
        this.e = executor;
        this.f = aVar;
        this.g = tiVar;
    }

    static /* synthetic */ Object b(l lVar, BackendResponse backendResponse, Iterable iterable, tg tgVar, int i) {
        if (backendResponse.c() == BackendResponse.Status.TRANSIENT_ERROR) {
            lVar.c.K0(iterable);
            lVar.d.a(tgVar, i + 1);
            return null;
        }
        lVar.c.x(iterable);
        if (backendResponse.c() == BackendResponse.Status.OK) {
            lVar.c.K(tgVar, backendResponse.b() + lVar.g.a());
        }
        if (!lVar.c.I0(tgVar)) {
            return null;
        }
        lVar.d.a(tgVar, 1);
        return null;
    }

    static void d(l lVar, tg tgVar, int i, Runnable runnable) {
        try {
            a aVar = lVar.f;
            nh nhVar = lVar.c;
            nhVar.getClass();
            aVar.a(j.a(nhVar));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) lVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                lVar.f.a(k.a(lVar, tgVar, i));
            } else {
                lVar.e(tgVar, i);
            }
        } catch (SynchronizationException unused) {
            lVar.d.a(tgVar, i + 1);
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void e(tg tgVar, int i) {
        BackendResponse backendResponse;
        com.google.android.datatransport.runtime.backends.l lVar = this.b.get(tgVar.b());
        Iterable<sh> iterable = (Iterable) this.f.a(h.a(this, tgVar));
        if (iterable.iterator().hasNext()) {
            if (lVar == null) {
                bh.a("Uploader", "Unknown backend for %s, deleting event batch for it...", tgVar);
                backendResponse = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (sh shVar : iterable) {
                    arrayList.add(shVar.a());
                }
                f.a a2 = f.a();
                a2.b(arrayList);
                a2.c(tgVar.c());
                backendResponse = lVar.b(a2.a());
            }
            this.f.a(i.a(this, backendResponse, iterable, tgVar, i));
        }
    }

    public void f(tg tgVar, int i, Runnable runnable) {
        this.e.execute(g.a(this, tgVar, i, runnable));
    }
}
