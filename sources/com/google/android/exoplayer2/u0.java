package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.audio.k;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.text.i;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.video.q;
import com.google.android.exoplayer2.video.s;
import com.spotify.mobile.android.video.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class u0 extends s implements y {
    private boolean A;
    private boolean B;
    protected final p0[] b;
    private final a0 c;
    private final Handler d;
    private final c e;
    private final CopyOnWriteArraySet<q> f;
    private final CopyOnWriteArraySet<k> g;
    private final CopyOnWriteArraySet<i> h = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<zm> i;
    private final CopyOnWriteArraySet<s> j;
    private final CopyOnWriteArraySet<m> k;
    private final f l;
    private final zi m;
    private final q n;
    private final r o;
    private final w0 p;
    private d0 q;
    private d0 r;
    private Surface s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private float x;
    private t y;
    private List<com.google.android.exoplayer2.text.a> z;

    public static final class b {
        private final Context a;
        private final s0 b;
        private com.google.android.exoplayer2.util.i c;
        private jq d;
        private f0 e;
        private f f;
        private zi g;
        private Looper h;
        private boolean i;

        public b(Context context, s0 s0Var) {
            cq cqVar = new cq(context);
            v vVar = new v();
            o k = o.k(context);
            Looper p = f0.p();
            com.google.android.exoplayer2.util.i iVar = com.google.android.exoplayer2.util.i.a;
            zi ziVar = new zi(iVar);
            this.a = context;
            this.b = s0Var;
            this.d = cqVar;
            this.e = vVar;
            this.f = k;
            this.h = p;
            this.g = ziVar;
            this.c = iVar;
        }

        public u0 a() {
            g.m(!this.i);
            this.i = true;
            return new u0(this.a, this.b, this.d, this.e, n.a, this.f, this.g, this.c, this.h);
        }

        public b b(f fVar) {
            g.m(!this.i);
            this.f = fVar;
            return this;
        }

        public b c(f0 f0Var) {
            g.m(!this.i);
            this.e = f0Var;
            return this;
        }

        public b d(jq jqVar) {
            g.m(!this.i);
            this.d = jqVar;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public final class c implements s, m, i, zm, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, r.b, q.b, m0.a {
        c(a aVar) {
        }

        @Override // com.google.android.exoplayer2.audio.m
        public void C(int i, long j, long j2) {
            Iterator it = u0.this.k.iterator();
            while (it.hasNext()) {
                ((m) it.next()).C(i, j, j2);
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void F(int i) {
            l0.g(this, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void G(com.google.android.exoplayer2.source.f0 f0Var, hq hqVar) {
            l0.k(this, f0Var, hqVar);
        }

        @Override // com.google.android.exoplayer2.video.s
        public void H(ej ejVar) {
            Iterator it = u0.this.j.iterator();
            while (it.hasNext()) {
                ((s) it.next()).H(ejVar);
            }
            u0.this.q = null;
            u0.this.getClass();
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void I(k0 k0Var) {
            l0.c(this, k0Var);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void M(int i) {
            l0.f(this, i);
        }

        @Override // com.google.android.exoplayer2.audio.m
        public void N(ej ejVar) {
            Iterator it = u0.this.k.iterator();
            while (it.hasNext()) {
                ((m) it.next()).N(ejVar);
            }
            u0.this.r = null;
            u0.this.getClass();
            u0.this.w = 0;
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void O(ExoPlaybackException exoPlaybackException) {
            l0.e(this, exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.video.s
        public void Q(int i, long j) {
            Iterator it = u0.this.j.iterator();
            while (it.hasNext()) {
                ((s) it.next()).Q(i, j);
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void R(boolean z, int i) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    u0.this.p.a(z);
                    return;
                } else if (i != 4) {
                    return;
                }
            }
            u0.this.p.a(false);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void T(v0 v0Var, Object obj, int i) {
            l0.j(this, v0Var, obj, i);
        }

        @Override // com.google.android.exoplayer2.video.s
        public void V(ej ejVar) {
            u0.this.getClass();
            Iterator it = u0.this.j.iterator();
            while (it.hasNext()) {
                ((s) it.next()).V(ejVar);
            }
        }

        @Override // com.google.android.exoplayer2.audio.m
        public void W(d0 d0Var) {
            u0.this.r = d0Var;
            Iterator it = u0.this.k.iterator();
            while (it.hasNext()) {
                ((m) it.next()).W(d0Var);
            }
        }

        @Override // com.google.android.exoplayer2.text.i
        public void a(List<com.google.android.exoplayer2.text.a> list) {
            u0.this.z = list;
            Iterator it = u0.this.h.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(list);
            }
        }

        @Override // com.google.android.exoplayer2.audio.m
        public void b(int i) {
            if (u0.this.w != i) {
                u0.this.w = i;
                Iterator it = u0.this.g.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!u0.this.k.contains(kVar)) {
                        kVar.b(i);
                    }
                }
                Iterator it2 = u0.this.k.iterator();
                while (it2.hasNext()) {
                    ((m) it2.next()).b(i);
                }
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void b0(boolean z) {
            l0.a(this, z);
        }

        public void c(int i) {
            u0 u0Var = u0.this;
            u0Var.Z(u0Var.M(), i);
        }

        @Override // defpackage.zm
        public void d(um umVar) {
            Iterator it = u0.this.i.iterator();
            while (it.hasNext()) {
                ((zm) it.next()).d(umVar);
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void f() {
            l0.h(this);
        }

        @Override // com.google.android.exoplayer2.video.s
        public void h(int i, int i2, int i3, float f) {
            Iterator it = u0.this.f.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.video.q qVar = (com.google.android.exoplayer2.video.q) it.next();
                if (!u0.this.j.contains(qVar)) {
                    qVar.h(i, i2, i3, f);
                }
            }
            Iterator it2 = u0.this.j.iterator();
            while (it2.hasNext()) {
                ((s) it2.next()).h(i, i2, i3, f);
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void j(int i) {
            l0.d(this, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void k(boolean z) {
            u0.this.getClass();
        }

        @Override // com.google.android.exoplayer2.audio.m
        public void l(ej ejVar) {
            u0.this.getClass();
            Iterator it = u0.this.k.iterator();
            while (it.hasNext()) {
                ((m) it.next()).l(ejVar);
            }
        }

        @Override // com.google.android.exoplayer2.video.s
        public void m(String str, long j, long j2) {
            Iterator it = u0.this.j.iterator();
            while (it.hasNext()) {
                ((s) it.next()).m(str, j, j2);
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void n(v0 v0Var, int i) {
            l0.i(this, v0Var, i);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            u0.w(u0.this, new Surface(surfaceTexture), true);
            u0.x(u0.this, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            u0.w(u0.this, null, true);
            u0.x(u0.this, 0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            u0.x(u0.this, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.video.s
        public void p(Surface surface) {
            if (u0.this.s == surface) {
                Iterator it = u0.this.f.iterator();
                while (it.hasNext()) {
                    ((com.google.android.exoplayer2.video.q) it.next()).c();
                }
            }
            Iterator it2 = u0.this.j.iterator();
            while (it2.hasNext()) {
                ((s) it2.next()).p(surface);
            }
        }

        @Override // com.google.android.exoplayer2.audio.m
        public void r(String str, long j, long j2) {
            Iterator it = u0.this.k.iterator();
            while (it.hasNext()) {
                ((m) it.next()).r(str, j, j2);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            u0.x(u0.this, i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            u0.w(u0.this, surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            u0.w(u0.this, null, false);
            u0.x(u0.this, 0, 0);
        }

        @Override // com.google.android.exoplayer2.video.s
        public void z(d0 d0Var) {
            u0.this.q = d0Var;
            Iterator it = u0.this.j.iterator();
            while (it.hasNext()) {
                ((s) it.next()).z(d0Var);
            }
        }
    }

    @Deprecated
    protected u0(Context context, s0 s0Var, jq jqVar, f0 f0Var, n<com.google.android.exoplayer2.drm.s> nVar, f fVar, zi ziVar, com.google.android.exoplayer2.util.i iVar, Looper looper) {
        this.l = fVar;
        this.m = ziVar;
        c cVar = new c(null);
        this.e = cVar;
        CopyOnWriteArraySet<com.google.android.exoplayer2.video.q> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f = copyOnWriteArraySet;
        CopyOnWriteArraySet<k> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.g = copyOnWriteArraySet2;
        CopyOnWriteArraySet<zm> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.i = copyOnWriteArraySet3;
        CopyOnWriteArraySet<s> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.j = copyOnWriteArraySet4;
        CopyOnWriteArraySet<m> copyOnWriteArraySet5 = new CopyOnWriteArraySet<>();
        this.k = copyOnWriteArraySet5;
        Handler handler = new Handler(looper);
        this.d = handler;
        p0[] a2 = s0Var.a(handler, cVar, cVar, cVar, cVar, nVar);
        this.b = a2;
        this.x = 1.0f;
        this.w = 0;
        this.z = Collections.emptyList();
        a0 a0Var = new a0(a2, jqVar, f0Var, fVar, iVar, looper);
        this.c = a0Var;
        ziVar.e0(a0Var);
        a0();
        a0Var.o(ziVar);
        a0();
        a0Var.o(cVar);
        copyOnWriteArraySet4.add(ziVar);
        copyOnWriteArraySet.add(ziVar);
        copyOnWriteArraySet5.add(ziVar);
        copyOnWriteArraySet2.add(ziVar);
        copyOnWriteArraySet3.add(ziVar);
        fVar.f(handler, ziVar);
        if (nVar instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) nVar).h(handler, ziVar);
        }
        this.n = new q(context, handler, cVar);
        this.o = new r(context, handler, cVar);
        this.p = new w0(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Z(boolean z2, int i2) {
        int i3 = 0;
        boolean z3 = z2 && i2 != -1;
        if (z3 && i2 != 1) {
            i3 = 1;
        }
        this.c.L(z3, i3);
    }

    private void a0() {
        if (Looper.myLooper() != this.c.t()) {
            if (!this.A) {
                new IllegalStateException();
            }
            this.A = true;
        }
    }

    static void w(u0 u0Var, Surface surface, boolean z2) {
        u0Var.getClass();
        ArrayList arrayList = new ArrayList();
        p0[] p0VarArr = u0Var.b;
        for (p0 p0Var : p0VarArr) {
            if (p0Var.c() == 2) {
                n0 b2 = u0Var.c.b(p0Var);
                b2.q(1);
                b2.o(surface);
                b2.m();
                arrayList.add(b2);
            }
        }
        Surface surface2 = u0Var.s;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n0) it.next()).a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (u0Var.t) {
                u0Var.s.release();
            }
        }
        u0Var.s = surface;
        u0Var.t = z2;
    }

    static void x(u0 u0Var, int i2, int i3) {
        if (i2 != u0Var.u || i3 != u0Var.v) {
            u0Var.u = i2;
            u0Var.v = i3;
            Iterator<com.google.android.exoplayer2.video.q> it = u0Var.f.iterator();
            while (it.hasNext()) {
                it.next().A(i2, i3);
            }
        }
    }

    static void y(u0 u0Var) {
        float c2 = u0Var.x * u0Var.o.c();
        p0[] p0VarArr = u0Var.b;
        for (p0 p0Var : p0VarArr) {
            if (p0Var.c() == 1) {
                n0 b2 = u0Var.c.b(p0Var);
                b2.q(2);
                b2.o(Float.valueOf(c2));
                b2.m();
            }
        }
    }

    public void J(i iVar) {
        if (!this.z.isEmpty()) {
            ((VideoSurfaceView) iVar).a(this.z);
        }
        this.h.add(iVar);
    }

    public d0 K() {
        return this.r;
    }

    public int L() {
        a0();
        return this.c.u();
    }

    public boolean M() {
        a0();
        return this.c.v();
    }

    public k0 N() {
        a0();
        return this.c.x();
    }

    public int O() {
        a0();
        return this.c.y();
    }

    public int P() {
        a0();
        return this.c.A();
    }

    public int Q(int i2) {
        a0();
        return this.c.B(i2);
    }

    public int R() {
        a0();
        return this.c.C();
    }

    public d0 S() {
        return this.q;
    }

    public void T(t tVar, boolean z2, boolean z3) {
        a0();
        t tVar2 = this.y;
        if (tVar2 != null) {
            tVar2.c(this.m);
            this.m.d0();
        }
        this.y = tVar;
        tVar.b(this.d, this.m);
        Z(M(), this.o.d(M()));
        this.c.K(tVar, z2, z3);
    }

    public void U(i iVar) {
        this.h.remove(iVar);
    }

    public void V() {
        a0();
        if (this.y != null) {
            a0();
            if (this.c.w() != null || O() == 1) {
                T(this.y, false, false);
            }
        }
    }

    public void W(k0 k0Var) {
        a0();
        this.c.M(k0Var);
    }

    public void X(int i2) {
        a0();
        this.c.N(i2);
    }

    @Deprecated
    public void Y(s sVar) {
        this.j.retainAll(Collections.singleton(this.m));
        this.j.add(sVar);
    }

    @Override // com.google.android.exoplayer2.y
    public void a(t tVar) {
        T(tVar, true, true);
    }

    @Override // com.google.android.exoplayer2.y
    public n0 b(n0.b bVar) {
        a0();
        return this.c.b(bVar);
    }

    @Override // com.google.android.exoplayer2.m0
    public void d() {
        a0();
        this.n.b(false);
        this.o.f();
        this.p.a(false);
        this.c.d();
        Surface surface = this.s;
        if (surface != null) {
            if (this.t) {
                surface.release();
            }
            this.s = null;
        }
        t tVar = this.y;
        if (tVar != null) {
            tVar.c(this.m);
            this.y = null;
        }
        if (!this.B) {
            this.l.c(this.m);
            this.z = Collections.emptyList();
            return;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.m0
    public long e() {
        a0();
        return this.c.e();
    }

    @Override // com.google.android.exoplayer2.m0
    public long f() {
        a0();
        return this.c.f();
    }

    @Override // com.google.android.exoplayer2.m0
    public long g() {
        a0();
        return this.c.g();
    }

    @Override // com.google.android.exoplayer2.m0
    public void h(m0.a aVar) {
        a0();
        this.c.h(aVar);
    }

    @Override // com.google.android.exoplayer2.m0
    public int i() {
        a0();
        return this.c.i();
    }

    @Override // com.google.android.exoplayer2.m0
    public void j(boolean z2) {
        a0();
        Z(z2, this.o.e(z2, O()));
    }

    @Override // com.google.android.exoplayer2.m0
    public int k() {
        a0();
        return this.c.k();
    }

    @Override // com.google.android.exoplayer2.m0
    public v0 l() {
        a0();
        return this.c.l();
    }

    @Override // com.google.android.exoplayer2.m0
    public void m(int i2, long j2) {
        a0();
        this.m.c0();
        this.c.m(i2, j2);
    }

    @Override // com.google.android.exoplayer2.m0
    public void n(boolean z2) {
        a0();
        this.c.n(z2);
        t tVar = this.y;
        if (tVar != null) {
            tVar.c(this.m);
            this.m.d0();
            if (z2) {
                this.y = null;
            }
        }
        this.o.f();
        this.z = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.m0
    public void o(m0.a aVar) {
        a0();
        this.c.o(aVar);
    }

    @Override // com.google.android.exoplayer2.m0
    public int p() {
        a0();
        return this.c.p();
    }

    @Override // com.google.android.exoplayer2.m0
    public long q() {
        a0();
        return this.c.q();
    }
}
