package com.spotify.music.features.connect.cast;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.f;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.rxjava2.d;
import com.spotify.rxjava2.q;
import defpackage.m6;
import defpackage.n6;
import io.reactivex.internal.operators.observable.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class t {
    private k a;
    private final c b = new c(null);
    private m6 c;
    private final n6 d;
    private final q e = new q();
    private final y f;
    private boolean g;
    private String h;
    private final List<n6.f> i = new ArrayList();
    private final List<n6.f> j = new ArrayList();
    private final List<n6.f> k = new ArrayList();
    private final c l = new a();

    class a extends c {
        a() {
            super(null);
        }

        @Override // com.spotify.music.features.connect.cast.t.c, defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            t.this.l(false);
            for (n6.f fVar2 : t.this.j) {
                if (fVar2.i().equals(fVar.i())) {
                    return;
                }
            }
            t.this.j.add(fVar);
        }

        @Override // com.spotify.music.features.connect.cast.t.c, defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            t.this.l(false);
            t.this.j.remove(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Callable<Boolean> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            t.b(t.this);
            Logger.b("Stopped active scan after %d seconds", 12);
            return Boolean.TRUE;
        }
    }

    /* access modifiers changed from: private */
    public class c extends n6.a {
        c(a aVar) {
        }

        @Override // defpackage.n6.a
        public void d(n6 n6Var, n6.f fVar) {
            t.this.l(false);
        }

        @Override // defpackage.n6.a
        public void e(n6 n6Var, n6.f fVar) {
            t.this.l(false);
        }

        @Override // defpackage.n6.a
        public void f(n6 n6Var, n6.f fVar) {
            t.this.l(false);
        }

        @Override // defpackage.n6.a
        public void g(n6 n6Var, n6.f fVar) {
            ((o) t.this.a).w(CastDevice.o2(fVar.g()));
        }

        @Override // defpackage.n6.a
        public void h(n6 n6Var, n6.f fVar) {
            ((o) t.this.a).w(null);
        }
    }

    public t(n6 n6Var, String str, y yVar) {
        this.d = n6Var;
        this.h = str;
        this.f = yVar;
        r();
    }

    static void b(t tVar) {
        tVar.d.k(tVar.l);
        tVar.g = false;
    }

    private void e(n6.f fVar) {
        Logger.b("Cast device has been lost", new Object[0]);
        DiscoveredDevice h2 = h(fVar);
        if (!h2.getStatus().equals(DiscoveredDevice.DEVICE_FAILURE_UNKNOWN)) {
            ((o) this.a).v(h2);
        }
    }

    private List<n6.f> i() {
        ArrayList arrayList = new ArrayList(this.d.h());
        for (n6.f fVar : this.j) {
            if (!arrayList.contains(fVar)) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    private boolean j(n6.f fVar) {
        return !fVar.t() && fVar.v() && fVar.z(this.c);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(boolean z) {
        this.i.clear();
        this.i.addAll(i());
        Collections2.removeIf(this.i, new f(this));
        List<n6.f> list = this.i;
        if (!z) {
            int size = this.k.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                n6.f fVar = this.k.get(size);
                e eVar = new e(fVar);
                if (Collections2.any(list, eVar)) {
                    Collections2.removeIf(list, eVar);
                } else {
                    this.k.remove(size);
                    e(fVar);
                }
            }
        } else {
            int size2 = this.k.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                this.k.remove(size2);
                e(this.k.get(size2));
            }
        }
        for (n6.f fVar2 : list) {
            this.k.add(fVar2);
            DiscoveredDevice h2 = h(fVar2);
            if (!h2.getStatus().equals(DiscoveredDevice.DEVICE_FAILURE_UNKNOWN)) {
                ((o) this.a).u(h2);
            }
        }
    }

    private void r() {
        try {
            m6.a aVar = new m6.a();
            aVar.a(f.a(this.h));
            this.c = aVar.c();
        } catch (IllegalArgumentException unused) {
            Logger.d("CM - Cannot create MediaRouterManager: Invalid AppId", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public n6.f f(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = ((ArrayList) i()).iterator();
        while (it.hasNext()) {
            n6.f fVar = (n6.f) it.next();
            CastDevice o2 = CastDevice.o2(fVar.g());
            if ((o2 != null && str.equals(o2.I1())) && j(fVar)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public CastDevice g(String str) {
        Iterator it = ((ArrayList) i()).iterator();
        while (it.hasNext()) {
            n6.f fVar = (n6.f) it.next();
            CastDevice o2 = CastDevice.o2(fVar.g());
            if (o2 != null && str.equals(o2.I1()) && j(fVar)) {
                return o2;
            }
        }
        return null;
    }

    public DiscoveredDevice h(n6.f fVar) {
        return j.a(CastDevice.o2(fVar.g()));
    }

    public /* synthetic */ boolean k(n6.f fVar) {
        return fVar != null && !j(fVar);
    }

    /* access modifiers changed from: protected */
    public void m(String str) {
        n6.f f2 = f(str);
        this.b.f(this.d, f2);
        this.b.d(this.d, f2);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (!this.g) {
            if (this.c != null) {
                this.j.clear();
                this.d.a(this.c, this.l, 1);
            }
            this.g = true;
            this.e.a(new g(s.c0(new b()), s.X0(12, TimeUnit.SECONDS, this.f)).L(g.a).I0(this.f).subscribe(d.a, h.a));
        }
    }

    /* access modifiers changed from: protected */
    public boolean o(String str) {
        n6.f f2 = f(str);
        if (f2 != null) {
            if (f2.y()) {
                c cVar = this.b;
                cVar.getClass();
                ((o) t.this.a).w(CastDevice.o2(f2.g()));
            } else {
                this.d.m(f2);
            }
            return true;
        }
        n6.f i2 = this.d.i();
        this.b.f(this.d, i2);
        this.b.d(this.d, i2);
        this.d.o(1);
        return false;
    }

    public void p(String str) {
        this.h = str;
        r();
    }

    public void q(k kVar) {
        this.a = kVar;
    }

    /* access modifiers changed from: protected */
    public void s() {
        m6 m6Var = this.c;
        if (m6Var != null) {
            this.d.a(m6Var, this.b, 4);
            l(true);
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        this.d.k(this.b);
        this.d.k(this.l);
        this.g = false;
        this.e.c();
    }
}
