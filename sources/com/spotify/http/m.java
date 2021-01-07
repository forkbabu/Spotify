package com.spotify.http;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;

public class m {
    private final WebgateTokenProvider a;
    private final q b;
    private final tn0 c;
    private final j d;
    private final c e;
    private final s<ng0> f;
    private final y g;
    private final p h = new p();
    private final p i = new p();

    public m(WebgateTokenProvider webgateTokenProvider, q qVar, tn0 tn0, j jVar, c cVar, s<ng0> sVar, y yVar) {
        this.a = webgateTokenProvider;
        this.b = qVar;
        this.c = tn0;
        this.d = jVar;
        this.e = cVar;
        this.f = sVar;
        this.g = yVar;
    }

    public /* synthetic */ void a(OfflineState offlineState) {
        this.c.b(offlineState.offlineState() == OfflineState.State.FORCED_OFFLINE);
    }

    public /* synthetic */ void b(ng0 ng0) {
        this.a.reset();
    }

    public void c() {
        this.a.reset();
        this.b.b();
    }

    public void d() {
        this.d.b();
        this.h.b(this.e.a().subscribe(new d(this)));
        this.i.b(this.f.o0(this.g).subscribe(new c(this)));
    }

    public void e() {
        this.a.onStop();
        this.i.a();
        this.h.a();
        this.d.c();
    }
}
