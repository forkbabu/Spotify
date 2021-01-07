package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.m;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class c {
    private static final Object i = new Object();
    private static final Executor j = new d(null);
    static final Map<String, c> k = new m1();
    private final Context a;
    private final String b;
    private final d c;
    private final l d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final s<u10> g;
    private final List<b> h = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.c$c  reason: collision with other inner class name */
    public static class C0114c implements c.a {
        private static AtomicReference<C0114c> a = new AtomicReference<>();

        private C0114c() {
        }

        static void b(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    C0114c cVar = new C0114c();
                    if (a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z) {
            synchronized (c.i) {
                Iterator it = new ArrayList(c.k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e.get()) {
                        c.d(cVar, z);
                    }
                }
            }
        }
    }

    private static class d implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        d(a aVar) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        static void a(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.i) {
                for (c cVar : c.k.values()) {
                    cVar.l();
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0087: APUT  
      (r5v1 com.google.firebase.components.d[])
      (5 ??[int, float, short, byte, char])
      (r0v6 com.google.firebase.components.d<?>)
     */
    protected c(Context context, String str, d dVar) {
        String str2;
        new CopyOnWriteArrayList();
        if (context != null) {
            this.a = context;
            g.i(str);
            this.b = str;
            if (dVar != null) {
                this.c = dVar;
                List<h> a2 = f.b(context, ComponentDiscoveryService.class).a();
                com.google.firebase.components.d<?> dVar2 = null;
                try {
                    str2 = kotlin.c.n.toString();
                } catch (NoClassDefFoundError unused) {
                    str2 = null;
                }
                Executor executor = j;
                com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
                dVarArr[0] = com.google.firebase.components.d.j(context, Context.class, new Class[0]);
                dVarArr[1] = com.google.firebase.components.d.j(this, c.class, new Class[0]);
                dVarArr[2] = com.google.firebase.components.d.j(dVar, d.class, new Class[0]);
                dVarArr[3] = a20.a("fire-android", "");
                dVarArr[4] = a20.a("fire-core", "19.3.1");
                dVarArr[5] = str2 != null ? a20.a("kotlin", str2) : dVar2;
                dVarArr[6] = x10.b();
                dVarArr[7] = com.google.firebase.heartbeatinfo.b.b();
                this.d = new l(executor, a2, dVarArr);
                this.g = new s<>(b.a(this, context));
                return;
            }
            throw new NullPointerException("null reference");
        }
        throw new NullPointerException("null reference");
    }

    static void d(c cVar, boolean z) {
        for (b bVar : cVar.h) {
            bVar.a(z);
        }
    }

    private void e() {
        g.p(!this.f.get(), "FirebaseApp was deleted");
    }

    public static c h() {
        c cVar;
        synchronized (i) {
            cVar = k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l() {
        if (!(Build.VERSION.SDK_INT >= 24 ? ((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked() : true)) {
            e();
            e.a(this.a);
            return;
        }
        e();
        this.d.c(p());
    }

    public static c m(Context context) {
        synchronized (i) {
            if (k.containsKey("[DEFAULT]")) {
                return h();
            }
            d a2 = d.a(context);
            if (a2 == null) {
                return null;
            }
            return n(context, a2);
        }
    }

    public static c n(Context context, d dVar) {
        c cVar;
        C0114c.b(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (i) {
            Map<String, c> map = k;
            g.p(!map.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            g.k(context, "Application context cannot be null.");
            cVar = new c(context, "[DEFAULT]", dVar);
            map.put("[DEFAULT]", cVar);
        }
        cVar.l();
        return cVar;
    }

    static /* synthetic */ u10 q(c cVar, Context context) {
        return new u10(context, cVar.k(), (q10) cVar.d.get(q10.class));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.b;
        c cVar = (c) obj;
        cVar.e();
        return str.equals(cVar.b);
    }

    public <T> T f(Class<T> cls) {
        e();
        return (T) this.d.get(cls);
    }

    public Context g() {
        e();
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String i() {
        e();
        return this.b;
    }

    public d j() {
        e();
        return this.c;
    }

    public String k() {
        String str;
        StringBuilder sb = new StringBuilder();
        e();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        e();
        byte[] bytes2 = this.c.c().getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public boolean o() {
        e();
        return this.g.get().a();
    }

    public boolean p() {
        e();
        return "[DEFAULT]".equals(this.b);
    }

    public String toString() {
        m.a b2 = m.b(this);
        b2.a("name", this.b);
        b2.a("options", this.c);
        return b2.toString();
    }
}
