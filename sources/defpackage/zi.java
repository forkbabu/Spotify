package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.video.q;
import com.google.android.exoplayer2.video.s;
import defpackage.aj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: zi  reason: default package */
public class zi implements m0.a, zm, m, s, v, f.a, k, q, com.google.android.exoplayer2.audio.k {
    private final CopyOnWriteArraySet<aj> a = new CopyOnWriteArraySet<>();
    private final i b;
    private final v0.c c = new v0.c();
    private final b f = new b();
    private m0 n;

    /* access modifiers changed from: private */
    /* renamed from: zi$a */
    public static final class a {
        public final t.a a;
        public final v0 b;
        public final int c;

        public a(t.a aVar, v0 v0Var, int i) {
            this.a = aVar;
            this.b = v0Var;
            this.c = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zi$b */
    public static final class b {
        private final ArrayList<a> a = new ArrayList<>();
        private final HashMap<t.a, a> b = new HashMap<>();
        private final v0.b c = new v0.b();
        private a d;
        private a e;
        private a f;
        private v0 g = v0.a;
        private boolean h;

        private a p(a aVar, v0 v0Var) {
            int b2 = v0Var.b(aVar.a.a);
            if (b2 == -1) {
                return aVar;
            }
            return new a(aVar.a, v0Var, v0Var.d(b2, this.c).b);
        }

        public a b() {
            return this.e;
        }

        public a c() {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<a> arrayList = this.a;
            return arrayList.get(arrayList.size() - 1);
        }

        public a d(t.a aVar) {
            return this.b.get(aVar);
        }

        public a e() {
            if (this.a.isEmpty() || this.g.n() || this.h) {
                return null;
            }
            return this.a.get(0);
        }

        public a f() {
            return this.f;
        }

        public boolean g() {
            return this.h;
        }

        public void h(int i, t.a aVar) {
            int b2 = this.g.b(aVar.a);
            boolean z = b2 != -1;
            v0 v0Var = z ? this.g : v0.a;
            if (z) {
                i = this.g.d(b2, this.c).b;
            }
            a aVar2 = new a(aVar, v0Var, i);
            this.a.add(aVar2);
            this.b.put(aVar, aVar2);
            this.d = this.a.get(0);
            if (this.a.size() == 1 && !this.g.n()) {
                this.e = this.d;
            }
        }

        public boolean i(t.a aVar) {
            a remove = this.b.remove(aVar);
            if (remove == null) {
                return false;
            }
            this.a.remove(remove);
            a aVar2 = this.f;
            if (aVar2 != null && aVar.equals(aVar2.a)) {
                this.f = this.a.isEmpty() ? null : this.a.get(0);
            }
            if (this.a.isEmpty()) {
                return true;
            }
            this.d = this.a.get(0);
            return true;
        }

        public void j() {
            this.e = this.d;
        }

        public void k(t.a aVar) {
            this.f = this.b.get(aVar);
        }

        public void l() {
            this.h = false;
            this.e = this.d;
        }

        public void m() {
            this.h = true;
        }

        public void n(v0 v0Var) {
            for (int i = 0; i < this.a.size(); i++) {
                a p = p(this.a.get(i), v0Var);
                this.a.set(i, p);
                this.b.put(p.a, p);
            }
            a aVar = this.f;
            if (aVar != null) {
                this.f = p(aVar, v0Var);
            }
            this.g = v0Var;
            this.e = this.d;
        }

        public a o(int i) {
            a aVar = null;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                a aVar2 = this.a.get(i2);
                int b2 = this.g.b(aVar2.a.a);
                if (b2 != -1 && this.g.d(b2, this.c).b == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = aVar2;
                }
            }
            return aVar;
        }
    }

    public zi(i iVar) {
        this.b = iVar;
    }

    private aj.a S(a aVar) {
        this.n.getClass();
        if (aVar == null) {
            int i = this.n.i();
            a o = this.f.o(i);
            if (o == null) {
                v0 l = this.n.l();
                if (!(i < l.m())) {
                    l = v0.a;
                }
                return P(l, i, null);
            }
            aVar = o;
        }
        return P(aVar.b, aVar.c, aVar.a);
    }

    private aj.a U() {
        return S(this.f.b());
    }

    private aj.a X(int i, t.a aVar) {
        v0 v0Var = v0.a;
        this.n.getClass();
        if (aVar != null) {
            a d = this.f.d(aVar);
            if (d != null) {
                return S(d);
            }
            return P(v0Var, i, aVar);
        }
        v0 l = this.n.l();
        if (i < l.m()) {
            v0Var = l;
        }
        return P(v0Var, i, null);
    }

    private aj.a Z() {
        return S(this.f.e());
    }

    private aj.a a0() {
        return S(this.f.f());
    }

    @Override // com.google.android.exoplayer2.video.q
    public void A(int i, int i2) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void B(int i, t.a aVar, v.c cVar) {
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void C(int i, long j, long j2) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().m();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void D(int i, t.a aVar, v.b bVar, v.c cVar) {
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().D();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void E(int i, t.a aVar) {
        this.f.k(aVar);
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().N();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void F(int i) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().z();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void G(f0 f0Var, hq hqVar) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().y();
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void H(ej ejVar) {
        U();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void I(k0 k0Var) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().H();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void J(int i, t.a aVar, v.b bVar, v.c cVar) {
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().B();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void K(int i, t.a aVar, v.b bVar, v.c cVar, IOException iOException, boolean z) {
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void L(int i, t.a aVar) {
        X(i, aVar);
        if (this.f.i(aVar)) {
            Iterator<aj> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void M(int i) {
        this.f.j();
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().L();
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void N(ej ejVar) {
        U();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void O(ExoPlaybackException exoPlaybackException) {
        U();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().I();
        }
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    public aj.a P(v0 v0Var, int i, t.a aVar) {
        if (v0Var.n()) {
            aVar = null;
        }
        long b2 = this.b.b();
        boolean z = true;
        boolean z2 = v0Var == this.n.l() && i == this.n.i();
        long j = 0;
        if (aVar != null && aVar.a()) {
            if (!(z2 && this.n.k() == aVar.b && this.n.p() == aVar.c)) {
                z = false;
            }
            if (z) {
                j = this.n.f();
            }
        } else if (z2) {
            j = this.n.q();
        } else if (!v0Var.n()) {
            j = v0Var.l(i, this.c, 0).a();
        }
        return new aj.a(b2, v0Var, i, aVar, j, this.n.f(), this.n.g());
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void Q(int i, long j) {
        U();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().A();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void R(boolean z, int i) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().G();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public /* synthetic */ void T(v0 v0Var, Object obj, int i) {
        l0.j(this, v0Var, obj, i);
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void V(ej ejVar) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().p();
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void W(d0 d0Var) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().l();
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void a() {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void b(int i) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().J();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public void b0(boolean z) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    @Override // com.google.android.exoplayer2.video.q
    public final void c() {
    }

    public final void c0() {
        if (!this.f.g()) {
            Z();
            this.f.m();
            Iterator<aj> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().w();
            }
        }
    }

    @Override // defpackage.zm
    public final void d(um umVar) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().v();
        }
    }

    public final void d0() {
        Iterator it = new ArrayList(this.f.a).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            L(aVar.c, aVar.a);
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void e() {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public void e0(m0 m0Var) {
        g.m(this.n == null || this.f.a.isEmpty());
        this.n = m0Var;
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void f() {
        if (this.f.g()) {
            this.f.l();
            Z();
            Iterator<aj> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void g() {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void h(int i, int i2, int i3, float f2) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().O();
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void i() {
        U();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public void j(int i) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void k(boolean z) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().s();
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void l(ej ejVar) {
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().p();
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void m(String str, long j, long j2) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().M();
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public final void n(v0 v0Var, int i) {
        this.f.n(v0Var);
        Z();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().F();
        }
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void o(Exception exc) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().C();
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void p(Surface surface) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.f.a
    public final void q(int i, long j, long j2) {
        S(this.f.c());
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().x();
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void r(String str, long j, long j2) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().M();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void s(int i, t.a aVar, v.c cVar) {
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void t(int i, t.a aVar, v.b bVar, v.c cVar) {
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().K();
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public final void u(int i, t.a aVar) {
        this.f.h(i, aVar);
        X(i, aVar);
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().t();
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public final void z(d0 d0Var) {
        a0();
        Iterator<aj> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().l();
        }
    }
}
