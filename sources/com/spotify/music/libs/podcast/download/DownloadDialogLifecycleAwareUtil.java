package com.spotify.music.libs.podcast.download;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.playlist.models.offline.a;
import com.spotify.rxjava2.p;
import io.reactivex.y;

public class DownloadDialogLifecycleAwareUtil implements e {
    private final d0 a;
    private final a0 b;
    private final y c;
    private final p f = new p();

    public DownloadDialogLifecycleAwareUtil(d0 d0Var, a0 a0Var, y yVar, n nVar) {
        this.a = d0Var;
        this.b = a0Var;
        this.c = yVar;
        nVar.A().a(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    public /* synthetic */ void a(a aVar, a0.a aVar2, a0.b bVar, c0 c0Var) {
        this.b.f(aVar, c0Var, aVar2, bVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    @Deprecated
    public void b(a aVar, String str, a0.a aVar2, a0.b bVar) {
        this.f.b(this.a.a(str).o0(this.c).subscribe(new b(this, aVar, aVar2, bVar)));
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        this.f.a();
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void o0(n nVar) {
        d.e(this, nVar);
    }
}
