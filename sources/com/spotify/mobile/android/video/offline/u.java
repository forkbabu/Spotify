package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.n;
import com.spotify.base.java.logging.Logger;
import com.spotify.rxjava2.q;
import io.reactivex.a;
import io.reactivex.y;
import java.util.UUID;

public class u {
    private final n a;
    private final c0 b;
    private final w c;
    private final r82 d;
    private final y e;
    private final q f = new q();

    public u(n nVar, c0 c0Var, w wVar, r82 r82, y yVar) {
        this.a = nVar;
        this.b = c0Var;
        this.c = wVar;
        this.d = r82;
        this.e = yVar;
    }

    public void a(String str) {
        this.f.a(a.u(new d(this, str)).G(this.e).subscribe());
    }

    public void b(g0 g0Var, f0 f0Var) {
        String b2 = g0Var.b();
        m mVar = new m(UUID.randomUUID().toString().replace("-", ""), g0Var.b(), g0Var.c());
        this.d.d(mVar, f0Var);
        this.d.h(b2);
        this.f.a(this.b.a(mVar, f0Var).B(this.e).p(new e(this, b2)).subscribe(new c(this, b2), new f(this, b2)));
    }

    public void c() {
        this.a.l(null, 1);
        this.a.k(new co(0));
        this.a.j(1);
    }

    public /* synthetic */ void d(String str) {
        this.c.a(str);
        this.a.g(str);
    }

    public /* synthetic */ void e(String str, DownloadHelper downloadHelper) {
        this.c.b(str, downloadHelper.f());
    }

    public void f(String str, DownloadHelper downloadHelper) {
        this.a.a(downloadHelper.e(str, null), 0);
        this.a.i();
        downloadHelper.j();
    }

    public /* synthetic */ void g(String str, Throwable th) {
        Logger.e(th, "Could not initiate download!", new Object[0]);
        this.d.i(str, 0, th);
    }

    public void h() {
        this.a.l(null, 3);
        this.f.c();
    }

    public void i(String str) {
        this.a.l(str, 4);
    }
}
