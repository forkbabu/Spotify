package com.spotify.music.features.ads.screensaver;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.productstate.c;
import com.spotify.rxjava2.p;

public class l0 implements d {
    private final n0 a;
    private final t0 b;
    private final c c;
    private final p f = new p();

    public l0(n0 n0Var, t0 t0Var, c cVar) {
        this.a = n0Var;
        this.b = t0Var;
        this.c = cVar;
    }

    public /* synthetic */ void a(Boolean bool) {
        this.a.m(bool.booleanValue());
        if (this.a.g()) {
            this.b.c();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.f.b(this.c.a().subscribe(new c(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.m(false);
        this.b.a();
        this.f.a();
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ScreensaverAdFeaturePlugin";
    }
}
