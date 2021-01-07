package com.spotify.music.spotlets.radio.service;

import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;

public class h0 {
    private final k0 a;
    private final a b = new a();
    private final yfd c;
    private final y d;

    h0(k0 k0Var, yfd yfd, y yVar) {
        this.a = k0Var;
        this.c = yfd;
        this.d = yVar;
    }

    public /* synthetic */ void a(Throwable th) {
        this.a.m(null);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a aVar = this.b;
        s<RadioStationsModel> o0 = this.c.c().o0(this.d);
        k0 k0Var = this.a;
        k0Var.getClass();
        aVar.b(o0.subscribe(new a(k0Var), new x(this)));
    }

    public void c() {
        this.b.f();
    }
}
