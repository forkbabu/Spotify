package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.h;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.e;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.g;
import com.spotify.music.features.ads.model.Ad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class c implements HlsPlaylistTracker, Loader.b<x<g>> {
    public static final /* synthetic */ int z = 0;
    private final h a;
    private final i b;
    private final v c;
    private final HashMap<Uri, a> f = new HashMap<>();
    private final List<HlsPlaylistTracker.b> n = new ArrayList();
    private final double o = 3.5d;
    private x.a<g> p;
    private v.a q;
    private Loader r;
    private Handler s;
    private HlsPlaylistTracker.c t;
    private e u;
    private Uri v;
    private f w;
    private boolean x;
    private long y = -9223372036854775807L;

    /* access modifiers changed from: private */
    public final class a implements Loader.b<x<g>>, Runnable {
        private final Uri a;
        private final Loader b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        private final x<g> c;
        private f f;
        private long n;
        private long o;
        private long p;
        private long q;
        private boolean r;
        private IOException s;

        public a(Uri uri) {
            this.a = uri;
            this.c = new x<>(c.this.a.a(4), uri, 4, c.this.p);
        }

        private boolean d(long j) {
            this.q = SystemClock.elapsedRealtime() + j;
            return this.a.equals(c.this.v) && !c.d(c.this);
        }

        private void j() {
            long m = this.b.m(this.c, this, ((t) c.this.c).b(this.c.b));
            v.a aVar = c.this.q;
            x<g> xVar = this.c;
            aVar.k(xVar.a, xVar.b, m);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void m(f fVar, long j) {
            f fVar2 = this.f;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.n = elapsedRealtime;
            f m = c.m(c.this, fVar2, fVar);
            this.f = m;
            if (m != fVar2) {
                this.s = null;
                this.o = elapsedRealtime;
                c.a(c.this, this.a, m);
            } else if (!m.l) {
                f fVar3 = this.f;
                if (fVar.i + ((long) fVar.o.size()) < fVar3.i) {
                    this.s = new HlsPlaylistTracker.PlaylistResetException(this.a);
                    c.l(c.this, this.a, -9223372036854775807L);
                } else {
                    double b2 = (double) u.b(fVar3.k);
                    double d = c.this.o;
                    Double.isNaN(b2);
                    if (((double) (elapsedRealtime - this.o)) > b2 * d) {
                        this.s = new HlsPlaylistTracker.PlaylistStuckException(this.a);
                        long a2 = ((t) c.this.c).a(4, j, this.s, 1);
                        c.l(c.this, this.a, a2);
                        if (a2 != -9223372036854775807L) {
                            d(a2);
                        }
                    }
                }
            }
            f fVar4 = this.f;
            this.p = u.b(fVar4 != fVar2 ? fVar4.k : fVar4.k / 2) + elapsedRealtime;
            if (this.a.equals(c.this.v) && !this.f.l) {
                h();
            }
        }

        public f e() {
            return this.f;
        }

        public boolean f() {
            int i;
            if (this.f == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, u.b(this.f.p));
            f fVar = this.f;
            if (fVar.l || (i = fVar.d) == 2 || i == 1 || this.n + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, boolean] */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void g(x<g> xVar, long j, long j2, boolean z) {
            x<g> xVar2 = xVar;
            c.this.q.e(xVar2.a, xVar2.f(), xVar2.d(), 4, j, j2, xVar2.c());
        }

        public void h() {
            this.q = 0;
            if (!this.r && !this.b.i() && !this.b.h()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.p) {
                    this.r = true;
                    c.this.s.postDelayed(this, this.p - elapsedRealtime);
                    return;
                }
                j();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long] */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void i(x<g> xVar, long j, long j2) {
            x<g> xVar2 = xVar;
            g e = xVar2.e();
            if (e instanceof f) {
                m((f) e, j2);
                c.this.q.g(xVar2.a, xVar2.f(), xVar2.d(), 4, j, j2, xVar2.c());
                return;
            }
            this.s = new ParserException("Loaded playlist has unexpected type.");
        }

        public void k() {
            this.b.j();
            IOException iOException = this.s;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void n() {
            this.b.l(null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int] */
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c o(x<g> xVar, long j, long j2, IOException iOException, int i) {
            Loader.c cVar;
            x<g> xVar2 = xVar;
            long a2 = ((t) c.this.c).a(xVar2.b, j2, iOException, i);
            boolean z = a2 != -9223372036854775807L;
            boolean z2 = c.l(c.this, this.a, a2) || !z;
            if (z) {
                z2 |= d(a2);
            }
            if (z2) {
                long c2 = ((t) c.this.c).c(xVar2.b, j2, iOException, i);
                cVar = c2 != -9223372036854775807L ? Loader.g(false, c2) : Loader.e;
            } else {
                cVar = Loader.d;
            }
            c.this.q.i(xVar2.a, xVar2.f(), xVar2.d(), 4, j, j2, xVar2.c(), iOException, !cVar.c());
            return cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.r = false;
            j();
        }
    }

    public c(h hVar, com.google.android.exoplayer2.upstream.v vVar, i iVar) {
        this.a = hVar;
        this.b = iVar;
        this.c = vVar;
    }

    static void a(c cVar, Uri uri, f fVar) {
        if (uri.equals(cVar.v)) {
            if (cVar.w == null) {
                cVar.x = !fVar.l;
                cVar.y = fVar.f;
            }
            cVar.w = fVar;
            ((HlsMediaSource) cVar.t).l(fVar);
        }
        int size = cVar.n.size();
        for (int i = 0; i < size; i++) {
            cVar.n.get(i).d();
        }
    }

    static boolean d(c cVar) {
        List<e.b> list = cVar.u.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a aVar = cVar.f.get(list.get(i).a);
            if (elapsedRealtime > aVar.q) {
                cVar.v = aVar.a;
                aVar.h();
                return true;
            }
        }
        return false;
    }

    static boolean l(c cVar, Uri uri, long j) {
        int size = cVar.n.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 |= !cVar.n.get(i).g(uri, j);
        }
        return z2;
    }

    static f m(c cVar, f fVar, f fVar2) {
        long j;
        long j2;
        long j3;
        int i;
        f.a p2;
        int size;
        int size2;
        cVar.getClass();
        fVar2.getClass();
        boolean z2 = true;
        if (fVar != null) {
            long j4 = fVar2.i;
            long j5 = fVar.i;
            if (j4 <= j5 && (j4 < j5 || ((size = fVar2.o.size()) <= (size2 = fVar.o.size()) && (size != size2 || !fVar2.l || fVar.l)))) {
                z2 = false;
            }
        }
        if (z2) {
            if (fVar2.m) {
                j = fVar2.f;
            } else {
                f fVar3 = cVar.w;
                j = fVar3 != null ? fVar3.f : 0;
                if (fVar != null) {
                    int size3 = fVar.o.size();
                    f.a p3 = p(fVar, fVar2);
                    if (p3 != null) {
                        j3 = fVar.f;
                        j2 = p3.n;
                    } else if (((long) size3) == fVar2.i - fVar.i) {
                        j3 = fVar.f;
                        j2 = fVar.p;
                    }
                    j = j3 + j2;
                }
            }
            if (fVar2.g) {
                i = fVar2.h;
            } else {
                f fVar4 = cVar.w;
                i = fVar4 != null ? fVar4.h : 0;
                if (!(fVar == null || (p2 = p(fVar, fVar2)) == null)) {
                    i = (fVar.h + p2.f) - fVar2.o.get(0).f;
                }
            }
            return new f(fVar2.d, fVar2.a, fVar2.b, fVar2.e, j, true, i, fVar2.i, fVar2.j, fVar2.k, fVar2.c, fVar2.l, fVar2.m, fVar2.n, fVar2.o);
        } else if (!fVar2.l || fVar.l) {
            return fVar;
        } else {
            return new f(fVar.d, fVar.a, fVar.b, fVar.e, fVar.f, fVar.g, fVar.h, fVar.i, fVar.j, fVar.k, fVar.c, true, fVar.m, fVar.n, fVar.o);
        }
    }

    private static f.a p(f fVar, f fVar2) {
        int i = (int) (fVar2.i - fVar.i);
        List<f.a> list = fVar.o;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public void A() {
        this.v = null;
        this.w = null;
        this.u = null;
        this.y = -9223372036854775807L;
        this.r.l(null);
        this.r = null;
        for (a aVar : this.f.values()) {
            aVar.n();
        }
        this.s.removeCallbacksAndMessages(null);
        this.s = null;
        this.f.clear();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, boolean] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void g(x<g> xVar, long j, long j2, boolean z2) {
        x<g> xVar2 = xVar;
        this.q.e(xVar2.a, xVar2.f(), xVar2.d(), 4, j, j2, xVar2.c());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void i(x<g> xVar, long j, long j2) {
        e eVar;
        x<g> xVar2 = xVar;
        g e = xVar2.e();
        boolean z2 = e instanceof f;
        if (z2) {
            String str = e.a;
            e eVar2 = e.n;
            eVar = new e("", Collections.emptyList(), Collections.singletonList(new e.b(Uri.parse(str), d0.p(Ad.DEFAULT_SKIPPABLE_AD_DELAY, null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            eVar = (e) e;
        }
        this.u = eVar;
        this.p = this.b.b(eVar);
        this.v = eVar.e.get(0).a;
        List<Uri> list = eVar.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f.put(uri, new a(uri));
        }
        a aVar = this.f.get(this.v);
        if (z2) {
            aVar.m((f) e, j2);
        } else {
            aVar.h();
        }
        this.q.g(xVar2.a, xVar2.f(), xVar2.d(), 4, j, j2, xVar2.c());
    }

    public void n(HlsPlaylistTracker.b bVar) {
        this.n.add(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int] */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public Loader.c o(x<g> xVar, long j, long j2, IOException iOException, int i) {
        x<g> xVar2 = xVar;
        long c2 = ((t) this.c).c(xVar2.b, j2, iOException, i);
        boolean z2 = c2 == -9223372036854775807L;
        this.q.i(xVar2.a, xVar2.f(), xVar2.d(), 4, j, j2, xVar2.c(), iOException, z2);
        if (z2) {
            return Loader.e;
        }
        return Loader.g(false, c2);
    }

    public long q() {
        return this.y;
    }

    public e r() {
        return this.u;
    }

    public f s(Uri uri, boolean z2) {
        f fVar;
        f e = this.f.get(uri).e();
        if (e != null && z2 && !uri.equals(this.v)) {
            List<e.b> list = this.u.e;
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(list.get(i).a)) {
                    z3 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z3 && ((fVar = this.w) == null || !fVar.l)) {
                this.v = uri;
                this.f.get(uri).h();
            }
        }
        return e;
    }

    public boolean t() {
        return this.x;
    }

    public boolean u(Uri uri) {
        return this.f.get(uri).f();
    }

    public void v(Uri uri) {
        this.f.get(uri).k();
    }

    public void w() {
        Loader loader = this.r;
        if (loader != null) {
            loader.j();
        }
        Uri uri = this.v;
        if (uri != null) {
            this.f.get(uri).k();
        }
    }

    public void x(Uri uri) {
        this.f.get(uri).h();
    }

    public void y(HlsPlaylistTracker.b bVar) {
        this.n.remove(bVar);
    }

    public void z(Uri uri, v.a aVar, HlsPlaylistTracker.c cVar) {
        this.s = new Handler();
        this.q = aVar;
        this.t = cVar;
        x xVar = new x(this.a.a(4), uri, 4, this.b.a());
        g.m(this.r == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.r = loader;
        aVar.k(xVar.a, xVar.b, loader.m(xVar, this, ((t) this.c).b(xVar.b)));
    }
}
