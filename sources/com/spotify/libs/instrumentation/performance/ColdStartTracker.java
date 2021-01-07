package com.spotify.libs.instrumentation.performance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.ColdStartupSequence;
import com.spotify.mobile.android.util.connectivity.r;
import com.spotify.music.libs.performance.tracking.p;
import com.spotify.music.libs.performance.tracking.q;
import com.spotify.performancesdk.timekeeper.m;
import io.reactivex.y;
import io.reactivex.z;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ColdStartTracker {
    private boolean a;
    private Optional<String> b = Optional.absent();
    private a c;
    private final String d;
    private final int e;
    private String f;
    private String g = "unknown";
    private final o h;
    private final Set<k> i;
    private final i j = new i() {
        /* class com.spotify.libs.instrumentation.performance.ColdStartTracker.AnonymousClass1 */

        @Override // com.spotify.libs.instrumentation.performance.i
        public void onPause() {
            ColdStartTracker.this.p("plh_onpause");
        }

        @Override // com.spotify.libs.instrumentation.performance.i
        public void onResume() {
            ColdStartTracker.this.p("plh_onresume");
        }

        @Override // com.spotify.libs.instrumentation.performance.i
        public void onStart() {
            ColdStartTracker.this.p("plh_onstart");
        }

        @Override // com.spotify.libs.instrumentation.performance.i
        public void onStop() {
            ColdStartTracker.this.p("plh_onstop");
        }
    };
    private final m k;
    private final q l;
    final Map<String, Long> m = new LinkedHashMap(16);
    private final Map<String, String> n = new LinkedHashMap(14);
    private final Map<String, Long> o = new LinkedHashMap(14);
    private final io.reactivex.subjects.a<Long> p = io.reactivex.subjects.a.h1();
    private final io.reactivex.disposables.a q = new io.reactivex.disposables.a();
    private boolean r;
    private boolean s;
    private boolean t;
    private final y u;
    private final Lifecycle v;
    private volatile WeakReference<Activity> w = new WeakReference<>(null);

    public interface a {
    }

    public ColdStartTracker(Lifecycle lifecycle, m mVar, q qVar, Supplier<Boolean> supplier, Context context) {
        o oVar = new o();
        y c2 = io.reactivex.schedulers.a.c();
        this.v = lifecycle;
        this.k = mVar;
        this.l = qVar;
        this.d = r.a(context).toString();
        this.e = qf.c(context);
        this.h = oVar;
        this.u = c2;
        this.s = ((Boolean) ((com.spotify.music.libs.performance.tracking.a) supplier).get()).booleanValue();
        this.i = new HashSet();
    }

    static void d(Map<String, String> map) {
        long j2 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().startsWith("dcf_")) {
                j2 += Long.parseLong(entry.getValue());
            }
        }
        if (j2 != 0) {
            map.put("tdcf_plugins", Long.toString(j2));
        }
    }

    public static long t() {
        return (System.nanoTime() / 1000) / 1000;
    }

    private void v(String str, long j2) {
        if (this.r && !this.a && !this.m.containsKey(str)) {
            this.m.put(str, Long.valueOf(j2));
        }
    }

    public synchronized void A(long j2) {
        this.r = true;
        this.f = s();
        v("app_init", j2);
        this.v.a(this.j);
        io.reactivex.disposables.a aVar = this.q;
        o oVar = this.h;
        oVar.getClass();
        aVar.b(z.y(new h(oVar)).H(this.u).subscribe(new b(this, j2)));
    }

    public synchronized void B(String str) {
        if (!this.a && this.s && !this.o.containsKey(str)) {
            this.o.put(str, Long.valueOf(this.k.a()));
        }
    }

    public synchronized void a(k kVar) {
        this.i.add(kVar);
    }

    public synchronized void b(String str, long j2, String str2) {
        Activity activity;
        if (this.r && !this.a) {
            if ("usable_state".equals(str) && (activity = this.w.get()) != null) {
                if (Build.VERSION.SDK_INT >= 19) {
                    try {
                        activity.reportFullyDrawn();
                    } catch (SecurityException unused) {
                    }
                }
                this.w.clear();
            }
            this.v.c(this.j);
            this.a = true;
            this.b = Optional.of(str);
            this.g = s();
            this.n.put("lifecycle_state", this.v.b().toString());
            d(this.n);
            this.q.b(this.p.o0(io.reactivex.android.schedulers.a.b()).subscribe(new c(this, str, j2, str2)));
        }
    }

    public synchronized void c(String str, String str2) {
        b(str, this.k.a(), null);
    }

    public synchronized void e(String str) {
        Long l2 = this.o.get(str);
        if (l2 != null) {
            long a2 = this.k.a() - l2.longValue();
            synchronized (this) {
                if (!this.a && this.o.containsKey(str)) {
                    if (a2 != 0) {
                        String l3 = Long.toString(a2);
                        if (this.s) {
                            this.n.put(str, l3);
                        }
                    }
                    this.o.remove(str);
                }
            }
        }
    }

    public Optional<String> f() {
        return this.b;
    }

    public boolean g() {
        return this.g.equals("active");
    }

    public boolean h() {
        return this.a;
    }

    public void i(String str, long j2, String str2, Long l2) {
        if (!this.m.containsKey(str)) {
            this.m.put(str, Long.valueOf(j2));
        }
        Map<String, Long> map = this.m;
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            map.put(entry.getKey(), Long.valueOf(entry.getValue().longValue() - l2.longValue()));
        }
        map.put("process_start", 0L);
        ColdStartupSequence.b r2 = ColdStartupSequence.r();
        r2.s(str);
        r2.o(this.d);
        r2.q(this.f);
        r2.r(this.g);
        r2.n(map);
        r2.m(this.n);
        r2.p(this.e);
        if (str2 != null) {
            r2.t(str2);
        }
        this.l.a((ColdStartupSequence) r2.build());
        boolean equals = this.g.equals("active");
        synchronized (this) {
            for (k kVar : this.i) {
                kVar.a(str, equals);
            }
        }
        this.q.dispose();
    }

    public void j(String str, Long l2, Long l3) {
        String l4 = Long.toString(l2.longValue() - l3.longValue());
        if (this.s) {
            this.n.put(str, l4);
        }
    }

    public /* synthetic */ void k(long j2, Intent intent, Long l2) {
        ((p) this.c).a(l2.longValue(), j2, intent);
        this.c = null;
    }

    public /* synthetic */ void l(long j2, Integer num) {
        this.p.onNext(Long.valueOf(j2 - ((long) num.intValue())));
    }

    public synchronized void m(String str) {
        n(str, this.k.a());
    }

    public synchronized void n(String str, long j2) {
        if (this.m.size() < 14) {
            v(str, j2);
        }
    }

    public synchronized void o(String str) {
        p("pbckj_" + str);
    }

    public synchronized void p(String str) {
        Long valueOf = Long.valueOf(this.k.a());
        synchronized (this) {
            if (this.s) {
                this.q.b(this.p.subscribe(new a(this, str, valueOf)));
            }
        }
    }

    public synchronized void q(m mVar) {
        if (!this.r) {
            Logger.d("ColdStartTracker not started yet! Don't call this method before having called ColdStartTracker.start()", new Object[0]);
            return;
        }
        if (mVar != null) {
            String a2 = mVar.a();
            if (this.s) {
                this.n.put("dmi_contentProviders", a2);
            }
        }
    }

    public synchronized void r(String str, long j2) {
        if (!this.a && j2 != 0) {
            String l2 = Long.toString(j2);
            if (this.s) {
                this.n.put(str, l2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String s() {
        Lifecycle.State b2 = this.v.b();
        return (b2 == Lifecycle.State.STARTED || b2 == Lifecycle.State.RESUMED) ? "active" : "background";
    }

    public void u(Intent intent) {
        if (this.c != null) {
            this.q.b(this.p.subscribe(new d(this, this.k.a(), intent)));
        }
    }

    public synchronized void w(k kVar) {
        this.i.remove(kVar);
    }

    public void x(Activity activity, boolean z) {
        if (z) {
            this.w = new WeakReference<>(activity);
        } else if (activity == this.w.get()) {
            this.w.clear();
        }
    }

    public void y(a aVar) {
        this.c = aVar;
    }

    public void z(String str) {
        if ("debug".equals(str) || "profile".equals(str) || "canary".equals(str)) {
            this.s = true;
            this.t = true;
        }
    }
}
