package com.spotify.mobile.android.video.tracking;

import android.os.Build;
import android.view.Display;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.tracking.BufferEvent;
import com.spotify.mobile.android.video.tracking.d;
import com.spotify.mobile.android.video.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class i implements e0 {
    private Optional<Long> A = Optional.absent();
    private Optional<Long> B = Optional.absent();
    private Optional<EncryptionType> C = Optional.absent();
    private boolean D = true;
    private long E;
    private boolean F;
    private int G;
    private Optional<i0> H = Optional.absent();
    private long I;
    private int J;
    private int K;
    private int L = -1;
    private Optional<VideoSurfaceView> M = Optional.absent();
    private float N = 1.0f;
    private final cqe a;
    private final List<l> b = new ArrayList();
    private final List<BufferEvent> c = new ArrayList();
    private final List<m> f = new ArrayList();
    private final List<k<j0>> n = new ArrayList();
    private final List<k<y>> o = new ArrayList();
    private final List<j> p = new ArrayList();
    private boolean q;
    private boolean r;
    private long s;
    private long t;
    private Optional<Long> u = Optional.absent();
    private Optional<Long> v = Optional.absent();
    private Optional<BufferEvent> w = Optional.absent();
    private Optional<l> x = Optional.absent();
    private Optional<k<j0>> y = Optional.absent();
    private Optional<k<y>> z = Optional.absent();

    public i(d0 d0Var, cqe cqe) {
        this.a = cqe;
    }

    private void B() {
        if (this.w.isPresent()) {
            this.c.add(this.w.get().c(this.a.b()));
            this.w = Optional.absent();
        }
    }

    private int O(k<j0> kVar) {
        Optional<j0> a2 = kVar.a();
        if (a2.isPresent()) {
            return a2.get().a();
        }
        return -1;
    }

    private void g(long j, long j2, Optional<j0> optional) {
        j0 j0Var;
        if (this.y.isPresent()) {
            j0Var = this.y.get().a().orNull();
            this.n.add(this.y.get().c(j));
        } else {
            j0Var = null;
        }
        if (optional.isPresent()) {
            j0Var = optional.get();
        }
        this.y = Optional.of(new k(Optional.fromNullable(j0Var), j2));
    }

    private void z(long j, long j2) {
        if (this.x.isPresent()) {
            this.b.add(this.x.get().i(j));
            this.x = Optional.of(new l(j2, this.N, VideoSurfaceState.d(this.q, this.r, this.L), J()));
        }
    }

    public f A(Optional<Long> optional) {
        float f2;
        int i;
        Iterator<BufferEvent> it;
        long j;
        long j2;
        long j3;
        List<l> P = P(this.A.isPresent() ? this.A.get().longValue() + 30000 : Long.MAX_VALUE);
        if (this.x.isPresent() && optional.isPresent()) {
            ((ArrayList) P).add(this.x.get().i(optional.get().longValue()));
        }
        d.b bVar = new d.b();
        ArrayList arrayList = (ArrayList) P;
        Iterator it2 = arrayList.iterator();
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            if (j6 != lVar.d() || lVar.c() <= 0.0f) {
                j4 = Math.max(j4, j5);
                j5 = lVar.f();
            } else {
                j5 = lVar.f() + j5;
            }
            j6 = lVar.d() + lVar.b();
        }
        bVar.j(Math.max(j4, j5));
        int i2 = l.f;
        Collections.sort(P, c.a);
        Iterator it3 = arrayList.iterator();
        ArrayList arrayList2 = arrayList;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (it3.hasNext()) {
            l lVar2 = (l) it3.next();
            long b2 = lVar2.b() + j10;
            long f3 = lVar2.f() + j11;
            int ordinal = lVar2.e().ordinal();
            if (ordinal == 0) {
                j12 = lVar2.b() + j12;
            } else if (ordinal == 4 || ordinal == 5 || ordinal == 6) {
                j9 = lVar2.b() + j9;
            }
            long d = lVar2.d();
            long b3 = lVar2.b();
            if (d >= j7) {
                j8 += b3;
                long j14 = d + b3;
                j = j9;
                j2 = f3;
                j7 = j14;
                j3 = b2;
            } else {
                j = j9;
                long j15 = d + b3;
                j3 = b2;
                j2 = f3;
                j7 = Math.max(j7, j15);
                j8 = Math.max(0L, j15 - j7) + j8;
            }
            if (!lVar2.a().isEmpty()) {
                j13 = lVar2.b() + j13;
            }
            arrayList2 = arrayList2;
            j10 = j3;
            it3 = it3;
            j11 = j2;
            j9 = j;
        }
        bVar.l(j10);
        bVar.m(j11);
        bVar.n(j12);
        bVar.o(j9);
        bVar.s(j8);
        bVar.p(j13);
        Iterator<BufferEvent> it4 = this.c.iterator();
        long j16 = -1;
        long j17 = 0;
        long j18 = 0;
        int i3 = 0;
        long j19 = 0;
        long j20 = 0;
        while (it4.hasNext()) {
            BufferEvent next = it4.next();
            Long or = next.a().or((Optional<Long>) 0L);
            int ordinal2 = next.b().ordinal();
            if (ordinal2 != 0) {
                it = it4;
                if (ordinal2 == 1) {
                    long longValue = or.longValue() + j19;
                    j17 = Math.max(j17, or.longValue());
                    j19 = longValue;
                } else if (ordinal2 == 2) {
                    long longValue2 = or.longValue() + j18;
                    i3++;
                    j20 = Math.max(j20, or.longValue());
                    j18 = longValue2;
                }
            } else {
                it = it4;
                j16 = or.longValue();
            }
            it4 = it;
        }
        bVar.i(j16);
        bVar.e(j19);
        bVar.f(j17);
        bVar.g(j18);
        bVar.h(j20);
        bVar.v(i3);
        long j21 = 0;
        long j22 = 0;
        int i4 = 0;
        int i5 = 0;
        for (m mVar : this.f) {
            if (mVar.b()) {
                i4++;
                j22 += mVar.a();
            } else {
                i5++;
                j21 += mVar.a();
            }
        }
        bVar.u(i4);
        bVar.r(j22);
        bVar.t(i5);
        bVar.q(j21);
        long k = bVar.k();
        int i6 = -1;
        if (Build.VERSION.SDK_INT <= 16) {
            f2 = -1.0f;
        } else {
            Iterator it5 = arrayList2.iterator();
            float f4 = 0.0f;
            while (it5.hasNext()) {
                l lVar3 = (l) it5.next();
                VideoSurfaceState e = lVar3.e();
                e.getClass();
                if ((e == VideoSurfaceState.FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION || e == VideoSurfaceState.FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION || e == VideoSurfaceState.BACKGROUND) ? false : true) {
                    int ordinal3 = lVar3.e().ordinal();
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 4) {
                                if (ordinal3 != 5) {
                                    i = -1;
                                    f4 += (((float) i) * ((float) lVar3.b())) / ((float) k);
                                }
                            }
                        }
                        i = 1;
                        f4 += (((float) i) * ((float) lVar3.b())) / ((float) k);
                    }
                    i = 0;
                    f4 += (((float) i) * ((float) lVar3.b())) / ((float) k);
                }
            }
            f2 = f4;
        }
        bVar.c(f2);
        Optional tryFind = Collections2.tryFind(this.n, b.a);
        if (tryFind.isPresent()) {
            i6 = O((k) tryFind.get());
        } else if (this.y.isPresent()) {
            i6 = O(this.y.get());
        }
        bVar.w(i6);
        bVar.d(this.I);
        bVar.b(this.G);
        return bVar.a();
    }

    /* access modifiers changed from: protected */
    public List<BufferEvent> C() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public long D() {
        return this.I;
    }

    /* access modifiers changed from: protected */
    public int E() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    public Optional<Long> F() {
        return this.A;
    }

    /* access modifiers changed from: protected */
    public Optional<Long> G() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public Optional<EncryptionType> H() {
        return this.C;
    }

    /* access modifiers changed from: protected */
    public int I() {
        return this.J;
    }

    /* access modifiers changed from: protected */
    public String J() {
        return this.H.transform(a.a).or((Optional<V>) "");
    }

    /* access modifiers changed from: protected */
    public Optional<Long> K() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public Optional<Long> L() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public List<k<y>> M() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public List<k<j0>> N() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public List<l> P(long j) {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.b) {
            if (lVar.g()) {
                if (lVar.b() < 0 || lVar.b() + lVar.d() >= j) {
                    Logger.d("Found invalid play range, length: %d, end position: %d", Long.valueOf(lVar.b()), Long.valueOf(lVar.b() + lVar.d()));
                } else {
                    arrayList.add(lVar);
                }
            }
        }
        return arrayList;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void a(long j) {
        this.s = this.a.b();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void b(j0 j0Var, long j, long j2) {
        g(j, j, Optional.of(j0Var));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void c(long j) {
        com.spotify.mobile.android.video.events.d0.s(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void d(boolean z2, long j, long j2) {
        this.q = z2;
        z(j, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void e(long j, long j2) {
        this.A = Optional.of(Long.valueOf(j));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void f(long j, long j2, long j3) {
        z(j, j2);
        g(j, j2, Optional.absent());
        this.f.add(new m(j, j2));
        this.D = false;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void h(com.spotify.mobile.android.video.events.i0 i0Var, long j) {
        com.spotify.mobile.android.video.events.d0.t(this, i0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void i(EncryptionType encryptionType, long j) {
        if (!this.v.isPresent()) {
            this.v = Optional.of(Long.valueOf(this.a.b() - this.t));
        }
        if (!this.C.isPresent()) {
            this.C = Optional.of(encryptionType);
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void j(long j, long j2, long j3, long j4) {
        this.I += j;
        this.p.add(new e(j2, j));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void k(List<i0> list, long j) {
        if (!this.u.isPresent()) {
            this.u = Optional.of(Long.valueOf(this.a.b() - this.s));
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void l(BetamaxException betamaxException, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.j(this, betamaxException, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void m(boolean z2, long j) {
        this.q = z2;
        this.E = this.a.b();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void n(d0 d0Var, long j) {
        com.spotify.mobile.android.video.events.d0.i(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void o(BetamaxException betamaxException, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.r(this, betamaxException, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        int i;
        if (this.x.isPresent()) {
            this.b.add(this.x.get().i(j));
            this.x = Optional.absent();
        }
        if (this.z.isPresent()) {
            this.o.add(this.z.get().c(j));
            this.z = Optional.absent();
        }
        if (this.y.isPresent()) {
            this.n.add(this.y.get().c(j));
            this.y = Optional.absent();
        }
        B();
        long j3 = this.I;
        List<j> list = this.p;
        long j4 = 0;
        if (j3 == 0) {
            i = 0;
        } else {
            for (j jVar : list) {
                j4 += (jVar.b() * jVar.a()) / j3;
            }
            i = (int) (j4 / 1000);
        }
        this.J = i;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        if (!this.B.isPresent()) {
            this.B = Optional.of(Long.valueOf(this.a.b() - this.E));
        }
        if (!this.x.isPresent()) {
            this.x = Optional.of(new l(j, this.N, VideoSurfaceState.d(this.q, this.r, this.L), J()));
        }
        this.F = true;
        B();
        this.D = true;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void r(long j) {
        this.t = this.a.b();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void s(float f2, long j, long j2) {
        this.N = f2;
        z(j, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void t(Optional<i0> optional, long j, long j2) {
        this.H = optional;
        z(j, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void u(Optional<VideoSurfaceView> optional, long j, long j2) {
        Display display;
        boolean z2 = false;
        int i = -1;
        if ((Build.VERSION.SDK_INT > 16) && optional.isPresent() && (display = optional.get().getDisplay()) != null) {
            int rotation = display.getRotation();
            i = (rotation == 0 || rotation == 2) ? 0 : 1;
        }
        this.L = i;
        if (optional.isPresent()) {
            z2 = optional.get().e();
        }
        this.r = z2;
        z(j, j);
        if (!this.M.equals(optional)) {
            this.G++;
        }
        this.M = optional;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void v(y yVar, long j, long j2) {
        Optional of = Optional.of(yVar);
        if (this.z.isPresent()) {
            this.z.get().a().orNull();
            this.o.add(this.z.get().c(j));
        }
        this.z = Optional.of(new k(Optional.fromNullable((y) of.get()), j));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void w(long j, long j2) {
        if (!this.F && !this.w.isPresent()) {
            this.w = Optional.of(new BufferEvent(BufferEvent.Kind.INITIAL, j, this.a.b()));
        } else if (this.F) {
            B();
            this.w = Optional.of(new BufferEvent(this.D ? BufferEvent.Kind.STALL : BufferEvent.Kind.SEEK, j, this.a.b()));
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void x(long j, long j2) {
        z(j, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void y(int i, long j) {
        this.K += i;
    }
}
