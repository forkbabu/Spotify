package defpackage;

import com.google.common.base.Optional;
import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.c;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exo.f;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.v;
import com.spotify.music.libs.fullscreen.story.domain.o;
import io.reactivex.s;
import java.util.List;

/* renamed from: sc5  reason: default package */
public class sc5 implements f0, e0 {
    private final c<o> a = PublishRelay.g1();
    private com.spotify.mobile.android.video.f0 b;
    private long c;

    public static void A(sc5 sc5, long j) {
        sc5.a.accept(new o.d(j, sc5.c));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void a(long j) {
        d0.l(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void b(j0 j0Var, long j, long j2) {
        d0.x(this, j0Var, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void c(long j) {
        this.a.accept(o.f.a);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void d(boolean z, long j, long j2) {
        d0.b(this, z, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void e(long j, long j2) {
        com.spotify.mobile.android.video.f0 f0Var = this.b;
        if (f0Var != null) {
            this.c = j;
            double d = (double) j;
            double d2 = (double) 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int ceil = (int) Math.ceil(d / d2);
            long[] jArr = new long[ceil];
            int i = 0;
            while (true) {
                int i2 = ceil - 1;
                if (i < i2) {
                    jArr[i] = ((long) i) * 50;
                    i++;
                } else {
                    jArr[i2] = j;
                    ((f) f0Var).a(jArr, new oc5(this));
                    this.b = null;
                    return;
                }
            }
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void f(long j, long j2, long j3) {
        d0.u(this, j, j2, j3);
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<e0> g(com.spotify.mobile.android.video.d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
        this.b = f0Var;
        return Optional.of(this);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void h(i0 i0Var, long j) {
        d0.t(this, i0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void i(EncryptionType encryptionType, long j) {
        d0.g(this, encryptionType, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void j(long j, long j2, long j3, long j4) {
        d0.d(this, j, j2, j3, j4);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void k(List list, long j) {
        d0.k(this, list, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void l(BetamaxException betamaxException, long j, long j2) {
        this.a.accept(new o.c(betamaxException));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void m(boolean z, long j) {
        d0.n(this, z, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void n(com.spotify.mobile.android.video.d0 d0Var, long j) {
        d0.i(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void o(BetamaxException betamaxException, long j, long j2) {
        this.a.accept(new o.e(betamaxException));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        if (reasonEnd == ReasonEnd.PLAYED_TO_END) {
            this.a.accept(o.b.a);
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        this.a.accept(o.g.a);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void r(long j) {
        d0.h(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void s(float f, long j, long j2) {
        d0.p(this, f, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void t(Optional optional, long j, long j2) {
        d0.v(this, optional, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void u(Optional optional, long j, long j2) {
        d0.w(this, optional, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void v(y yVar, long j, long j2) {
        d0.a(this, yVar, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void w(long j, long j2) {
        this.a.accept(o.a.a);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void x(long j, long j2) {
        d0.m(this, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void y(int i, long j) {
        d0.e(this, i, j);
    }

    /* access modifiers changed from: package-private */
    public s<o> z() {
        return this.a;
    }
}
