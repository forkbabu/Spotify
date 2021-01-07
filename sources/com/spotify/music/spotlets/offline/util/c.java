package com.spotify.music.spotlets.offline.util;

import com.spotify.music.connection.OfflineState;
import com.spotify.music.connection.k;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;

public class c {
    private final k a;
    private final y b;
    private final s<OfflineState> c;
    private final p d = new p();
    private final g<OfflineState> e = b.a;
    private final g<Throwable> f = a.a;

    public c(k kVar, y yVar) {
        this.a = kVar;
        this.b = yVar;
        this.c = kVar.b().o0(yVar).E().v0(1).h1();
    }

    public s<OfflineState> a() {
        return this.c;
    }

    public void b(boolean z) {
        this.d.b(this.a.a(OfflineState.create(z ? OfflineState.State.FORCED_OFFLINE : OfflineState.State.ONLINE)).B(this.b).subscribe(this.e, this.f));
    }
}
