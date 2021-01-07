package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.internal.n;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.cast.internal.s;
import com.google.android.gms.cast.internal.zzal;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.cast.o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.p8;
import com.google.android.gms.internal.cast.q8;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class h implements e.d {
    private final Object a = new Object();
    private final Handler b = new o0(Looper.getMainLooper());
    private final n c;
    private final e d;
    private final d e;
    private p8 f;
    private final List<b> g = new CopyOnWriteArrayList();
    final List<a> h = new CopyOnWriteArrayList();
    private final Map<d, i> i = new ConcurrentHashMap();
    private final Map<Long, i> j = new ConcurrentHashMap();

    public static abstract class a {
        public void a() {
        }

        public void b(int[] iArr) {
        }

        public void c(int[] iArr, int i) {
        }

        public void d(m[] mVarArr) {
        }

        public void e(int[] iArr) {
        }

        public void f(int[] iArr) {
        }
    }

    @Deprecated
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void k();
    }

    public interface c extends com.google.android.gms.common.api.i {
    }

    public interface d {
        void a(long j, long j2);
    }

    class e implements p {
        private p8 a;
        private long b = 0;

        public e() {
        }

        public final void a(p8 p8Var) {
            this.a = p8Var;
        }

        @Override // com.google.android.gms.cast.internal.p
        public final long n() {
            long j = this.b + 1;
            this.b = j;
            return j;
        }

        @Override // com.google.android.gms.cast.internal.p
        public final void o(String str, String str2, long j, String str3) {
            p8 p8Var = this.a;
            if (p8Var != null) {
                ((q8) p8Var).e(str, str2).e(new r(this, j));
                return;
            }
            throw new IllegalStateException("No GoogleApiClient available");
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends BasePendingResult<c> {
        f() {
            super(null);
        }

        /* Return type fixed from 'com.google.android.gms.common.api.i' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final c f(Status status) {
            return new s(status);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class g extends BasePendingResult<c> {
        s n;
        private final boolean o;

        g(boolean z) {
            super(null);
            this.o = z;
            this.n = new u(this, h.this);
        }

        /* Return type fixed from 'com.google.android.gms.common.api.i' to match base method */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ c f(Status status) {
            return new t(status);
        }

        /* access modifiers changed from: package-private */
        public abstract void o();

        public final void p() {
            if (!this.o) {
                for (b bVar : h.this.g) {
                    bVar.k();
                }
                for (a aVar : h.this.h) {
                    aVar.getClass();
                }
            }
            try {
                synchronized (h.this.a) {
                    o();
                }
            } catch (zzal unused) {
                a(new t(new Status(2100, (String) null)));
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.h$h  reason: collision with other inner class name */
    static final class C0093h implements c {
        private final Status a;

        C0093h(Status status, JSONObject jSONObject, MediaError mediaError) {
            this.a = status;
        }

        @Override // com.google.android.gms.common.api.i
        public final Status h() {
            return this.a;
        }
    }

    class i {
        private final Set<d> a = new HashSet();
        private final long b;
        private final Runnable c;
        private boolean d;

        public i(long j) {
            this.b = j;
            this.c = new w(this, h.this);
        }

        public final boolean a() {
            return !this.a.isEmpty();
        }

        public final boolean b() {
            return this.d;
        }

        public final void c() {
            h.this.b.removeCallbacks(this.c);
            this.d = true;
            h.this.b.postDelayed(this.c, this.b);
        }

        public final void d() {
            h.this.b.removeCallbacks(this.c);
            this.d = false;
        }

        public final void f(d dVar) {
            this.a.add(dVar);
        }

        public final void h(d dVar) {
            this.a.remove(dVar);
        }

        public final long i() {
            return this.b;
        }
    }

    static {
        String str = n.B;
    }

    public h(n nVar) {
        e eVar = new e();
        this.d = eVar;
        this.c = nVar;
        nVar.v(new p0(this));
        nVar.b(eVar);
        this.e = new d(this);
    }

    private static g D(g gVar) {
        try {
            gVar.p();
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable unused) {
            gVar.a(new t(new Status(2100, (String) null)));
        }
        return gVar;
    }

    public static com.google.android.gms.common.api.e<c> E(int i2, String str) {
        f fVar = new f();
        fVar.a(new s(new Status(i2, (String) null)));
        return fVar;
    }

    static void F(h hVar) {
        for (i iVar : hVar.j.values()) {
            if (hVar.m() && !iVar.b()) {
                iVar.c();
            } else if (!hVar.m() && iVar.b()) {
                iVar.d();
            }
            if (iVar.b() && (hVar.n() || hVar.M() || hVar.q() || hVar.p())) {
                hVar.J(iVar.a);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void J(Set<d> set) {
        HashSet hashSet = new HashSet(set);
        if (r() || q() || n() || M()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(f(), l());
            }
        } else if (p()) {
            m g2 = g();
            if (g2 != null && g2.o2() != null) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).a(0, g2.o2().o2());
                }
            }
        } else {
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).a(0, 0);
            }
        }
    }

    private final boolean M() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        return i2 != null && i2.v2() == 5;
    }

    private final boolean N() {
        return this.f != null;
    }

    public com.google.android.gms.common.api.e<c> A(long[] jArr) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        r0 r0Var = new r0(this, jArr);
        D(r0Var);
        return r0Var;
    }

    public com.google.android.gms.common.api.e<c> B() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        p pVar = new p(this, null);
        D(pVar);
        return pVar;
    }

    public void C() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        int k = k();
        if (k == 4 || k == 2) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            if (!N()) {
                E(17, null);
            } else {
                D(new n(this, null));
            }
        } else {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            if (!N()) {
                E(17, null);
            } else {
                D(new o(this, null));
            }
        }
    }

    public final void H(p8 p8Var) {
        p8 p8Var2 = this.f;
        if (p8Var2 != p8Var) {
            if (p8Var2 != null) {
                this.c.e();
                this.e.a();
                try {
                    ((q8) this.f).d(j());
                } catch (IOException unused) {
                }
                this.d.a(null);
                this.b.removeCallbacksAndMessages(null);
            }
            this.f = p8Var;
            if (p8Var != null) {
                this.d.a(p8Var);
            }
        }
    }

    public final void K() {
        p8 p8Var = this.f;
        if (p8Var != null) {
            try {
                ((q8) p8Var).f(j(), this);
            } catch (IOException unused) {
            }
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            if (!N()) {
                E(17, null);
            } else {
                D(new q0(this));
            }
        }
    }

    public final com.google.android.gms.common.api.e<c> L() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        m mVar = new m(this);
        D(mVar);
        return mVar;
    }

    public final com.google.android.gms.common.api.e<c> R(int[] iArr) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        l lVar = new l(this, iArr);
        D(lVar);
        return lVar;
    }

    @Override // com.google.android.gms.cast.e.d
    public void a(CastDevice castDevice, String str, String str2) {
        this.c.F(str2);
    }

    @Deprecated
    public void b(b bVar) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        this.g.add(bVar);
    }

    public boolean c(d dVar, long j2) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (this.i.containsKey(dVar)) {
            return false;
        }
        i iVar = this.j.get(Long.valueOf(j2));
        if (iVar == null) {
            iVar = new i(j2);
            this.j.put(Long.valueOf(j2), iVar);
        }
        iVar.f(dVar);
        this.i.put(dVar, iVar);
        if (!m()) {
            return true;
        }
        iVar.c();
        return true;
    }

    public long d() {
        long h2;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            h2 = this.c.h();
        }
        return h2;
    }

    public long e() {
        long i2;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            i2 = this.c.i();
        }
        return i2;
    }

    public long f() {
        long j2;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            j2 = this.c.j();
        }
        return j2;
    }

    public m g() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        if (i2 == null) {
            return null;
        }
        return i2.q2(i2.s2());
    }

    public MediaInfo h() {
        MediaInfo k;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            k = this.c.k();
        }
        return k;
    }

    public o i() {
        o l;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            l = this.c.l();
        }
        return l;
    }

    public String j() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        return this.c.a();
    }

    public int k() {
        int v2;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            o i2 = i();
            v2 = i2 != null ? i2.v2() : 1;
        }
        return v2;
    }

    public long l() {
        long m;
        synchronized (this.a) {
            com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
            m = this.c.m();
        }
        return m;
    }

    public boolean m() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        return n() || M() || r() || q() || p();
    }

    public boolean n() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        return i2 != null && i2.v2() == 4;
    }

    public boolean o() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        MediaInfo h2 = h();
        return h2 != null && h2.p2() == 2;
    }

    public boolean p() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        return (i2 == null || i2.s2() == 0) ? false : true;
    }

    public boolean q() {
        int o2;
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        if (i2 != null) {
            if (i2.v2() == 3) {
                return true;
            }
            if (o()) {
                synchronized (this.a) {
                    com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
                    o i3 = i();
                    o2 = i3 != null ? i3.o2() : 0;
                }
                if (o2 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        return i2 != null && i2.v2() == 2;
    }

    public boolean s() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        o i2 = i();
        return i2 != null && i2.A2();
    }

    public final boolean t() {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!o()) {
            return true;
        }
        o i2 = i();
        if (i2 == null || !i2.z2(2) || i2.r2() == null) {
            return false;
        }
        return true;
    }

    public com.google.android.gms.common.api.e<c> u(JSONObject jSONObject) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        j jVar = new j(this, null);
        D(jVar);
        return jVar;
    }

    public com.google.android.gms.common.api.e<c> v(JSONObject jSONObject) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        k kVar = new k(this, null);
        D(kVar);
        return kVar;
    }

    @Deprecated
    public void w(b bVar) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        this.g.remove(bVar);
    }

    public void x(d dVar) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        i remove = this.i.remove(dVar);
        if (remove != null) {
            remove.h(dVar);
            if (!remove.a()) {
                this.j.remove(Long.valueOf(remove.i()));
                remove.d();
            }
        }
    }

    @Deprecated
    public com.google.android.gms.common.api.e<c> y(long j2) {
        n.a aVar = new n.a();
        aVar.c(j2);
        aVar.d(0);
        aVar.b(null);
        return z(aVar.a());
    }

    public com.google.android.gms.common.api.e<c> z(com.google.android.gms.cast.n nVar) {
        com.google.android.exoplayer2.util.g.g("Must be called from the main thread.");
        if (!N()) {
            return E(17, null);
        }
        q qVar = new q(this, nVar);
        D(qVar);
        return qVar;
    }
}
