package com.spotify.music.features.datasavermode.settings;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;

public class g {
    private final uda a;
    private final s<jv4> b;
    private b c = EmptyDisposable.INSTANCE;
    private h d;

    g(uda uda, s<jv4> sVar) {
        uda.getClass();
        this.a = uda;
        sVar.getClass();
        this.b = sVar;
    }

    public /* synthetic */ void a(jv4 jv4) {
        if (this.d != null) {
            boolean b2 = jv4.b();
            this.d.P0(b2, jv4.c());
            this.d.v2(b2);
        }
    }

    public void b(boolean z) {
        this.a.e(z);
    }

    public void c(h hVar) {
        this.d = hVar;
        this.c = this.b.subscribe(new c(this), b.a);
    }

    public void d() {
        this.c.dispose();
        this.d = null;
    }
}
