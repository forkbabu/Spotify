package com.spotify.mobile.android.video.exo;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.offline.u;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.v0;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.exception.ErrorType;
import com.spotify.mobile.android.video.exo.q;
import com.spotify.mobile.android.video.x;
import com.spotify.music.json.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class m implements t, v {
    private e72 A;
    private a0 B;
    private Looper C;
    private final Optional<n<q>> D;
    private final v.a a;
    private final Uri b;
    private final b c;
    private final int f;
    private final q.a n;
    private final x o;
    private final c p;
    private final k.a q;
    private final List<t.b> r = new ArrayList(1);
    private final HashSet<Object> s = new HashSet<>(1);
    private x.a<? extends r> t;
    private Loader u;
    private k v;
    private Handler w;
    private r x;
    private w y;
    private v0 z;

    private final class b implements Loader.b<com.google.android.exoplayer2.upstream.x<r>> {
        b(a aVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, boolean] */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void g(com.google.android.exoplayer2.upstream.x<r> xVar, long j, long j2, boolean z) {
            com.google.android.exoplayer2.upstream.x<r> xVar2 = xVar;
            m.this.a.e(xVar2.a, xVar2.f(), xVar2.d(), xVar2.b, j, j2, xVar2.c());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long] */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void i(com.google.android.exoplayer2.upstream.x<r> xVar, long j, long j2) {
            m.h(m.this, xVar, j, j2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int] */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c o(com.google.android.exoplayer2.upstream.x<r> xVar, long j, long j2, IOException iOException, int i) {
            m.j(m.this, xVar, j, j2, iOException);
            return Loader.e;
        }
    }

    /* access modifiers changed from: private */
    public static final class c {
        private final Handler a;
        private final e72 b;

        /* access modifiers changed from: package-private */
        public class a implements Runnable {
            final /* synthetic */ com.spotify.mobile.android.video.x a;
            final /* synthetic */ Exception b;

            a(com.spotify.mobile.android.video.x xVar, Exception exc) {
                this.a = xVar;
                this.b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.b.w(this.a, this.b);
            }
        }

        public c(Handler handler, e72 e72) {
            if (e72 != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = e72;
        }

        public void b(com.spotify.mobile.android.video.x xVar, Exception exc) {
            if (this.b != null) {
                this.a.post(new a(xVar, exc));
            }
        }
    }

    public m(g gVar, com.spotify.mobile.android.video.x xVar, r rVar, Uri uri, k.a aVar, Handler handler, e72 e72, int i, q.a aVar2, List<com.google.android.exoplayer2.offline.x> list, String str, boolean z2, Optional<n<com.google.android.exoplayer2.drm.q>> optional) {
        boolean z3 = true;
        this.o = xVar;
        this.x = null;
        this.b = uri;
        this.A = e72;
        v.a r2 = new v.a().r(0, null, 0);
        this.a = r2;
        r2.a(handler, this);
        this.p = new c(handler, e72);
        this.t = new s(gVar, str, z2);
        this.f = i;
        this.n = aVar2;
        this.q = aVar;
        this.D = optional;
        if (list != null && !list.isEmpty()) {
            this.t = new u(this.t, list);
        }
        if (this.x != null) {
            if ((list == null || list.isEmpty()) ? false : z3) {
                this.x.a(list);
            }
            this.c = null;
            return;
        }
        this.c = new b(null);
    }

    static void h(m mVar, com.google.android.exoplayer2.upstream.x xVar, long j, long j2) {
        mVar.getClass();
        r rVar = (r) xVar.e();
        if (rVar == null) {
            return;
        }
        if (!rVar.e() || mVar.D.isPresent()) {
            mVar.x = rVar;
            mVar.k();
            mVar.a.g(xVar.a, xVar.f(), xVar.d(), xVar.b, j, j2, xVar.c());
            return;
        }
        mVar.p.b(mVar.o, new DrmException("Unsupported os version", ErrorType.ERROR_DRM_UNSUPPORTED_OS_VERSION));
    }

    static Loader.c j(m mVar, com.google.android.exoplayer2.upstream.x xVar, long j, long j2, IOException iOException) {
        ManifestResponseException manifestResponseException = iOException;
        mVar.getClass();
        mVar.a.i(xVar.a, xVar.f(), xVar.d(), xVar.b, j, j2, xVar.c(), iOException, manifestResponseException instanceof ParserException);
        if (manifestResponseException != null && (iOException.getCause() instanceof InvalidResponseCodeException)) {
            InvalidResponseCodeException invalidResponseCodeException = (InvalidResponseCodeException) iOException.getCause();
            manifestResponseException = new ManifestResponseException(invalidResponseCodeException.mResponseCode, invalidResponseCodeException.mResponseBody);
        }
        mVar.p.b(mVar.o, manifestResponseException);
        return Loader.e;
    }

    private void k() {
        this.z = new d0(this.x.c(0).a(), true, false, false, this.x, null);
        for (t.b bVar : this.r) {
            bVar.b(this, this.z);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public void B(int i, t.a aVar, v.c cVar) {
        e72 e72 = this.A;
        if (e72 != null) {
            e72.Y(this.o, cVar.b, cVar.c, cVar.e);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public void D(int i, t.a aVar, v.b bVar, v.c cVar) {
        ImmutableList immutableList;
        if (this.A != null && cVar.a == 4) {
            com.spotify.mobile.android.video.exo.model.a d = this.x.d();
            if (d != null) {
                immutableList = ImmutableList.copyOf((Collection) d.a());
            } else {
                immutableList = ImmutableList.of();
            }
            this.A.x(this.o, immutableList);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public void E(int i, t.a aVar) {
    }

    @Override // com.google.android.exoplayer2.source.v
    public void J(int i, t.a aVar, v.b bVar, v.c cVar) {
    }

    @Override // com.google.android.exoplayer2.source.v
    public void K(int i, t.a aVar, v.b bVar, v.c cVar, IOException iOException, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.source.v
    public void L(int i, t.a aVar) {
    }

    @Override // com.google.android.exoplayer2.source.t
    public void a(t.b bVar) {
        this.r.remove(bVar);
        if (this.r.isEmpty()) {
            this.C = null;
            this.z = null;
            this.x = null;
            this.A = null;
            this.v = null;
            this.y = null;
            Loader loader = this.u;
            if (loader != null) {
                loader.l(null);
                this.u = null;
            }
            Handler handler = this.w;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.w = null;
            }
        }
        if (this.D.isPresent()) {
            this.D.get().d();
        }
    }

    @Override // com.google.android.exoplayer2.source.t
    public void b(Handler handler, v vVar) {
        this.a.a(handler, vVar);
    }

    @Override // com.google.android.exoplayer2.source.t
    public void c(v vVar) {
        this.a.p(vVar);
    }

    @Override // com.google.android.exoplayer2.source.t
    public void d(s sVar) {
        for (ko<q> koVar : ((l) sVar).w) {
            koVar.B();
        }
    }

    @Override // com.google.android.exoplayer2.source.t
    public void e(t.b bVar, a0 a0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.C;
        com.google.android.exoplayer2.util.g.a(looper == null || looper == myLooper);
        if (this.D.isPresent()) {
            this.D.get().k();
        }
        this.B = a0Var;
        this.r.add(bVar);
        if (this.C == null) {
            this.C = myLooper;
            this.s.add(bVar);
            if (this.x != null) {
                k();
                return;
            }
            this.v = this.q.a();
            Loader loader = new Loader("Loader:SpotifyAdaptiveMediaSource");
            this.u = loader;
            this.y = loader;
            this.w = new Handler();
            com.google.android.exoplayer2.upstream.x xVar = new com.google.android.exoplayer2.upstream.x(this.v, this.b, 4, this.t);
            this.a.k(xVar.a, xVar.b, this.u.m(xVar, this.c, this.f));
        } else if (this.z != null) {
            this.s.isEmpty();
            this.s.add(bVar);
            bVar.b(this, this.z);
        }
    }

    @Override // com.google.android.exoplayer2.source.t
    public s f(t.a aVar, com.google.android.exoplayer2.upstream.n nVar, long j) {
        return new l(this.x, 0, this.B, this.n, this.f, this.a, 0, this.y, nVar, this.D);
    }

    @Override // com.google.android.exoplayer2.source.t
    public void g() {
    }

    @Override // com.google.android.exoplayer2.source.v
    public void s(int i, t.a aVar, v.c cVar) {
    }

    @Override // com.google.android.exoplayer2.source.v
    public void t(int i, t.a aVar, v.b bVar, v.c cVar) {
        e72 e72 = this.A;
        if (e72 != null && cVar.a == 4) {
            e72.v(this.o);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public void u(int i, t.a aVar) {
    }
}
