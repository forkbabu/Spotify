package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.offline.n;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.offline.c0;
import com.spotify.mobile.android.video.offline.j0;
import com.spotify.mobile.android.video.offline.k0;
import com.spotify.mobile.android.video.offline.t;
import com.spotify.mobile.android.video.offline.v;
import com.spotify.mobile.android.video.offline.w;
import com.spotify.mobile.android.video.offline.x;
import com.spotify.mobile.android.video.offline.z;
import defpackage.x72;
import java.io.File;
import java.util.List;
import okhttp3.y;

/* renamed from: j82  reason: default package */
public final class j82 implements x72 {
    private wlf<Context> a;
    private wlf<com.google.android.exoplayer2.database.a> b;
    private wlf<y> c;
    private wlf<File> d;
    private wlf<z> e;
    private wlf<io.reactivex.z<p62>> f;
    private wlf<v> g;
    private wlf<n> h;
    private wlf<y62> i;
    private wlf<List<f>> j;
    private wlf<Boolean> k;
    private wlf<c0> l;
    private wlf<j0> m = new k0(this.c);
    private wlf<x> n;
    private wlf<w> o;
    private wlf<gl0<u>> p;
    private wlf<cqe> q;
    private wlf<com.spotify.mobile.android.util.connectivity.y> r;
    private wlf<r82> s;
    private wlf<io.reactivex.y> t;
    private wlf<com.spotify.mobile.android.video.offline.u> u;
    private wlf<Boolean> v;
    private wlf<t> w;
    private wlf<BetamaxOfflineManager> x;

    /* renamed from: j82$b */
    private static final class b implements x72.a {
        b(a aVar) {
        }

        @Override // defpackage.x72.a
        public x72 a(Context context, gl0<u> gl0, y yVar, File file, y62 y62, io.reactivex.z<p62> zVar, List<f> list, io.reactivex.y yVar2, cqe cqe, com.spotify.mobile.android.util.connectivity.y yVar3, boolean z, boolean z2) {
            context.getClass();
            gl0.getClass();
            yVar.getClass();
            zVar.getClass();
            list.getClass();
            yVar2.getClass();
            cqe.getClass();
            yVar3.getClass();
            Boolean.valueOf(z).getClass();
            Boolean.valueOf(z2).getClass();
            return new j82(context, gl0, yVar, file, y62, zVar, list, yVar2, cqe, yVar3, Boolean.valueOf(z), Boolean.valueOf(z2), null);
        }
    }

    j82(Context context, gl0 gl0, y yVar, File file, y62 y62, io.reactivex.z zVar, List list, io.reactivex.y yVar2, cqe cqe, com.spotify.mobile.android.util.connectivity.y yVar3, Boolean bool, Boolean bool2, a aVar) {
        fjf a2 = gjf.a(context);
        this.a = a2;
        this.b = ejf.b(new e82(a2));
        this.c = gjf.a(yVar);
        fjf a3 = gjf.a(file);
        this.d = a3;
        this.e = ejf.b(new i82(this.b, a3));
        fjf a4 = gjf.a(zVar);
        this.f = a4;
        a82 a82 = new a82(this.c, this.e, a4);
        this.g = a82;
        this.h = ejf.b(new g82(this.a, this.b, a82));
        this.i = gjf.a(y62);
        this.j = gjf.a(list);
        fjf a5 = gjf.a(bool);
        this.k = a5;
        wlf<Context> wlf = this.a;
        this.l = new f82(wlf, this.i, this.j, this.f, a5);
        wlf<x> b2 = ejf.b(new c82(wlf));
        this.n = b2;
        this.o = ejf.b(new b82(this.m, this.f, b2, this.j));
        this.p = gjf.a(gl0);
        this.q = gjf.a(cqe);
        fjf a6 = gjf.a(yVar3);
        this.r = a6;
        this.s = ejf.b(new h82(this.p, this.q, a6));
        fjf a7 = gjf.a(yVar2);
        this.t = a7;
        this.u = ejf.b(new z72(this.h, this.l, this.o, this.s, a7));
        fjf a8 = gjf.a(bool2);
        this.v = a8;
        wlf<t> b3 = ejf.b(new y72(this.h, this.n, this.s, this.d, a8));
        this.w = b3;
        this.x = ejf.b(new d82(this.u, b3, this.s));
    }

    public static x72.a c() {
        return new b(null);
    }

    @Override // defpackage.x72
    public BetamaxOfflineManager a() {
        return this.x.get();
    }

    @Override // defpackage.x72
    public z b() {
        return this.e.get();
    }
}
