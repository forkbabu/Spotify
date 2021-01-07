package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.framework.media.internal.k;
import com.google.android.gms.cast.internal.n;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.cast.f;
import com.google.android.gms.internal.cast.g8;
import com.google.android.gms.internal.cast.p8;
import com.google.android.gms.internal.cast.q8;
import com.google.android.gms.internal.cast.r8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class c extends h {
    private static final com.google.android.gms.cast.internal.b n = new com.google.android.gms.cast.internal.b("CastSession");
    private final Context d;
    private final Set<e.c> e = new HashSet();
    private final c0 f;
    private final b g;
    private final k h;
    private final r8 i;
    private p8 j;
    private h k;
    private CastDevice l;
    private e.a m;

    class a implements j<e.a> {
        private String a;

        a(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.i] */
        @Override // com.google.android.gms.common.api.j
        public final /* synthetic */ void a(e.a aVar) {
            e.a aVar2 = aVar;
            c.this.m = aVar2;
            try {
                if (aVar2.h().r2()) {
                    c.n.a("%s() -> success result", this.a);
                    c.this.k = new h(new n());
                    c.this.k.H(c.this.j);
                    c.this.k.K();
                    c.this.h.i(c.this.k, c.this.o());
                    c.this.f.C(aVar2.U0(), aVar2.l(), aVar2.f(), aVar2.i());
                    return;
                }
                c.n.a("%s() -> failure result", this.a);
                c.this.f.z(aVar2.h().Q1());
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "methods", c0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends e.c {
        b(v vVar) {
        }

        @Override // com.google.android.gms.cast.e.c
        public final void a(int i) {
            Iterator it = new HashSet(c.this.e).iterator();
            while (it.hasNext()) {
                ((e.c) it.next()).a(i);
            }
        }

        @Override // com.google.android.gms.cast.e.c
        public final void b(int i) {
            c.z(c.this, i);
            c.this.h(i);
            Iterator it = new HashSet(c.this.e).iterator();
            while (it.hasNext()) {
                ((e.c) it.next()).b(i);
            }
        }

        @Override // com.google.android.gms.cast.e.c
        public final void c(com.google.android.gms.cast.d dVar) {
            Iterator it = new HashSet(c.this.e).iterator();
            while (it.hasNext()) {
                ((e.c) it.next()).c(dVar);
            }
        }

        @Override // com.google.android.gms.cast.e.c
        public final void d() {
            Iterator it = new HashSet(c.this.e).iterator();
            while (it.hasNext()) {
                ((e.c) it.next()).d();
            }
        }

        @Override // com.google.android.gms.cast.e.c
        public final void e(int i) {
            Iterator it = new HashSet(c.this.e).iterator();
            while (it.hasNext()) {
                ((e.c) it.next()).e(i);
            }
        }

        @Override // com.google.android.gms.cast.e.c
        public final void f() {
            Iterator it = new HashSet(c.this.e).iterator();
            while (it.hasNext()) {
                ((e.c) it.next()).f();
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.c$c  reason: collision with other inner class name */
    class BinderC0091c extends a0 {
        BinderC0091c(v vVar) {
        }

        public final void D3(String str, com.google.android.gms.cast.h hVar) {
            if (c.this.j != null) {
                ((q8) c.this.j).i(str, hVar).e(new a("launchApplication"));
            }
        }

        public final void E3(String str, String str2) {
            if (c.this.j != null) {
                ((q8) c.this.j).j(str, str2).e(new a("joinApplication"));
            }
        }

        public final void F3(int i) {
            c.z(c.this, i);
        }

        public final void R(String str) {
            if (c.this.j != null) {
                ((q8) c.this.j).k(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements g8 {
        d(v vVar) {
        }

        @Override // com.google.android.gms.internal.cast.g8
        public final void a(int i) {
            try {
                c.this.f.n(new ConnectionResult(i));
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "onConnectionFailed", c0.class.getSimpleName());
            }
        }

        @Override // com.google.android.gms.internal.cast.g8
        public final void g(Bundle bundle) {
            try {
                if (c.this.k != null) {
                    c.this.k.K();
                }
                c.this.f.g(null);
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "onConnected", c0.class.getSimpleName());
            }
        }

        @Override // com.google.android.gms.internal.cast.g8
        public final void i(int i) {
            try {
                c.this.f.i(i);
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "onConnectionSuspended", c0.class.getSimpleName());
            }
        }
    }

    public c(Context context, String str, String str2, b bVar, r8 r8Var, k kVar) {
        super(context, str, str2);
        this.d = context.getApplicationContext();
        this.g = bVar;
        this.h = kVar;
        this.i = r8Var;
        this.f = com.google.android.gms.internal.cast.h.c(context, bVar, m(), new BinderC0091c(null));
    }

    private final void E(Bundle bundle) {
        CastDevice o2 = CastDevice.o2(bundle);
        this.l = o2;
        if (o2 != null) {
            p8 p8Var = this.j;
            if (p8Var != null) {
                ((q8) p8Var).b();
                this.j = null;
            }
            n.a("Acquiring a connection to Google Play Services for %s", this.l);
            p8 a2 = ((f) this.i).a(this.d, this.l, this.g, new b(null), new d(null));
            this.j = a2;
            ((q8) a2).a();
        } else if (e()) {
            f(3103);
        } else {
            g(3101);
        }
    }

    static void z(c cVar, int i2) {
        cVar.h.s(i2);
        p8 p8Var = cVar.j;
        if (p8Var != null) {
            ((q8) p8Var).b();
            cVar.j = null;
        }
        cVar.l = null;
        h hVar = cVar.k;
        if (hVar != null) {
            hVar.H(null);
            cVar.k = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.h
    public void a(boolean z) {
        try {
            this.f.H0(z, 0);
        } catch (RemoteException e2) {
            n.b(e2, "Unable to call %s on %s.", "disconnectFromDevice", c0.class.getSimpleName());
        }
        h(0);
    }

    @Override // com.google.android.gms.cast.framework.h
    public long b() {
        g.g("Must be called from the main thread.");
        h hVar = this.k;
        if (hVar == null) {
            return 0;
        }
        return hVar.l() - this.k.f();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.h
    public void i(Bundle bundle) {
        this.l = CastDevice.o2(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.h
    public void j(Bundle bundle) {
        this.l = CastDevice.o2(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.h
    public void k(Bundle bundle) {
        E(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.h
    public void l(Bundle bundle) {
        E(bundle);
    }

    public void n(e.c cVar) {
        g.g("Must be called from the main thread.");
        if (cVar != null) {
            this.e.add(cVar);
        }
    }

    public CastDevice o() {
        g.g("Must be called from the main thread.");
        return this.l;
    }

    public h p() {
        g.g("Must be called from the main thread.");
        return this.k;
    }

    public boolean q() {
        g.g("Must be called from the main thread.");
        p8 p8Var = this.j;
        return p8Var != null && ((q8) p8Var).c();
    }

    public void r(e.c cVar) {
        g.g("Must be called from the main thread.");
        if (cVar != null) {
            this.e.remove(cVar);
        }
    }

    public void s(String str) {
        g.g("Must be called from the main thread.");
        p8 p8Var = this.j;
        if (p8Var != null) {
            ((q8) p8Var).d(str);
        }
    }

    public com.google.android.gms.common.api.e<Status> t(String str, String str2) {
        g.g("Must be called from the main thread.");
        p8 p8Var = this.j;
        if (p8Var != null) {
            return ((q8) p8Var).e(str, str2);
        }
        return null;
    }

    public void u(String str, e.d dVar) {
        g.g("Must be called from the main thread.");
        p8 p8Var = this.j;
        if (p8Var != null) {
            ((q8) p8Var).f(str, dVar);
        }
    }

    public void v(boolean z) {
        g.g("Must be called from the main thread.");
        p8 p8Var = this.j;
        if (p8Var != null) {
            ((q8) p8Var).g(z);
        }
    }
}
