package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.v0;
import com.spotify.mobile.android.audioplayer.domain.d;
import io.reactivex.functions.f;
import io.reactivex.t;
import io.reactivex.u;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: d41  reason: default package */
public final class d41<T> implements u<d> {
    final /* synthetic */ cqe a;
    final /* synthetic */ m0 b;

    /* renamed from: d41$a */
    static final class a implements f {
        final /* synthetic */ d41 a;
        final /* synthetic */ m0.a b;

        a(d41 d41, m0.a aVar) {
            this.a = d41;
            this.b = aVar;
        }

        @Override // io.reactivex.functions.f
        public final void cancel() {
            this.a.b.h(this.b);
        }
    }

    /* renamed from: d41$b */
    public static final class b implements m0.a {
        final /* synthetic */ d41 a;
        final /* synthetic */ t b;

        b(d41 d41, t tVar) {
            this.a = d41;
            this.b = tVar;
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void F(int i) {
            l0.g(this, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void G(f0 f0Var, hq hqVar) {
            l0.k(this, f0Var, hqVar);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void I(k0 k0Var) {
            l0.c(this, k0Var);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void M(int i) {
            l0.f(this, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void O(ExoPlaybackException exoPlaybackException) {
            l0.e(this, exoPlaybackException);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: io.reactivex.t */
        /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: io.reactivex.t */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.m0.a
        public void R(boolean z, int i) {
            if (i == 3) {
                this.b.onNext(new d.e(this.a.a.b()));
            } else if (i == 4) {
                this.b.onNext(d.C0173d.a);
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void T(v0 v0Var, Object obj, int i) {
            l0.j(this, v0Var, obj, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void b0(boolean z) {
            l0.a(this, z);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void f() {
            l0.h(this);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void j(int i) {
            l0.d(this, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void k(boolean z) {
            l0.b(this, z);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void n(v0 v0Var, int i) {
            l0.i(this, v0Var, i);
        }
    }

    d41(cqe cqe, m0 m0Var) {
        this.a = cqe;
        this.b = m0Var;
    }

    @Override // io.reactivex.u
    public final void subscribe(t<d> tVar) {
        h.e(tVar, "emitter");
        b bVar = new b(this, tVar);
        this.b.o(bVar);
        tVar.e(new a(this, bVar));
    }
}
