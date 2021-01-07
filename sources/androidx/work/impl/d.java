package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.foreground.c;
import androidx.work.impl.o;
import androidx.work.impl.utils.k;
import androidx.work.j;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class d implements b, androidx.work.impl.foreground.a {
    private static final String u = j.f("Processor");
    private PowerManager.WakeLock a;
    private Context b;
    private androidx.work.a c;
    private na f;
    private WorkDatabase n;
    private Map<String, o> o = new HashMap();
    private Map<String, o> p = new HashMap();
    private List<e> q;
    private Set<String> r;
    private final List<b> s;
    private final Object t;

    /* access modifiers changed from: private */
    public static class a implements Runnable {
        private b a;
        private String b;
        private ListenableFuture<Boolean> c;

        a(b bVar, String str, ListenableFuture<Boolean> listenableFuture) {
            this.a = bVar;
            this.b = str;
            this.c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.a.e(this.b, z);
        }
    }

    public d(Context context, androidx.work.a aVar, na naVar, WorkDatabase workDatabase, List<e> list) {
        this.b = context;
        this.c = aVar;
        this.f = naVar;
        this.n = workDatabase;
        this.q = list;
        this.r = new HashSet();
        this.s = new ArrayList();
        this.a = null;
        this.t = new Object();
    }

    private static boolean b(String str, o oVar) {
        if (oVar != null) {
            oVar.b();
            j.c().a(u, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        j.c().a(u, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    private void l() {
        synchronized (this.t) {
            if (!(!this.o.isEmpty())) {
                SystemForegroundService b2 = SystemForegroundService.b();
                if (b2 != null) {
                    j.c().a(u, "No more foreground work. Stopping SystemForegroundService", new Throwable[0]);
                    b2.g();
                } else {
                    j.c().a(u, "No more foreground work. SystemForegroundService is already stopped", new Throwable[0]);
                }
                PowerManager.WakeLock wakeLock = this.a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.a = null;
                }
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.t) {
            this.s.add(bVar);
        }
    }

    public boolean c(String str) {
        boolean contains;
        synchronized (this.t) {
            contains = this.r.contains(str);
        }
        return contains;
    }

    public boolean d(String str) {
        boolean z;
        synchronized (this.t) {
            if (!this.p.containsKey(str)) {
                if (!this.o.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        synchronized (this.t) {
            this.p.remove(str);
            j.c().a(u, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (b bVar : this.s) {
                bVar.e(str, z);
            }
        }
    }

    public boolean f(String str) {
        boolean containsKey;
        synchronized (this.t) {
            containsKey = this.o.containsKey(str);
        }
        return containsKey;
    }

    public void g(b bVar) {
        synchronized (this.t) {
            this.s.remove(bVar);
        }
    }

    public void h(String str, e eVar) {
        synchronized (this.t) {
            j.c().d(u, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            o remove = this.p.remove(str);
            if (remove != null) {
                if (this.a == null) {
                    PowerManager.WakeLock b2 = k.b(this.b, "ProcessorForegroundLck");
                    this.a = b2;
                    b2.acquire();
                }
                this.o.put(str, remove);
                Intent c2 = c.c(this.b, str, eVar);
                Context context = this.b;
                int i = androidx.core.content.a.b;
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(c2);
                } else {
                    context.startService(c2);
                }
            }
        }
    }

    public boolean i(String str, WorkerParameters.a aVar) {
        synchronized (this.t) {
            if (d(str)) {
                j.c().a(u, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            o.a aVar2 = new o.a(this.b, this.c, this.f, this, this.n, str);
            aVar2.g = this.q;
            if (aVar != null) {
                aVar2.h = aVar;
            }
            o oVar = new o(aVar2);
            androidx.work.impl.utils.futures.a<Boolean> aVar3 = oVar.z;
            aVar3.addListener(new a(this, str, aVar3), ((oa) this.f).c());
            this.p.put(str, oVar);
            ((oa) this.f).b().execute(oVar);
            j.c().a(u, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean j(String str) {
        boolean b2;
        synchronized (this.t) {
            boolean z = true;
            j.c().a(u, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.r.add(str);
            o remove = this.o.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.p.remove(str);
            }
            b2 = b(str, remove);
            if (z) {
                l();
            }
        }
        return b2;
    }

    public void k(String str) {
        synchronized (this.t) {
            this.o.remove(str);
            l();
        }
    }

    public boolean m(String str) {
        boolean b2;
        synchronized (this.t) {
            j.c().a(u, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            b2 = b(str, this.o.remove(str));
        }
        return b2;
    }

    public boolean n(String str) {
        boolean b2;
        synchronized (this.t) {
            j.c().a(u, String.format("Processor stopping background work %s", str), new Throwable[0]);
            b2 = b(str, this.p.remove(str));
        }
        return b2;
    }
}
