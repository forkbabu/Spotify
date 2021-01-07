package com.spotify.libs.connect.volume.controllers;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.s;

public class l implements p, ru0.a {
    private final j a;
    private final p b;
    private final p c;
    private final p d;
    private boolean e = true;

    public l(j jVar, p pVar, p pVar2) {
        this.a = jVar;
        this.b = pVar;
        this.c = pVar2;
        this.d = new p();
    }

    private p d() {
        return this.e ? this.b : this.c;
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public s<Float> a() {
        s<Float> a2 = this.b.a();
        Float valueOf = Float.valueOf(-1.0f);
        return s.n(a2.G0(valueOf), this.c.a().G0(valueOf), new c(this)).Q(b.a).E().N(new e(this));
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float c() {
        return d().c();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float e() {
        return d().e();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public float f() {
        return d().f();
    }

    @Override // com.spotify.libs.connect.volume.controllers.p
    public boolean g(Float f) {
        return d().g(f);
    }

    public /* synthetic */ Float h(Float f, Float f2) {
        return this.e ? f : f2;
    }

    public /* synthetic */ void i(Float f) {
        Logger.b("[Volume: %f, localActive: %b]", f, Boolean.valueOf(this.e));
    }

    public /* synthetic */ void j(GaiaDevice gaiaDevice) {
        boolean isSelf = gaiaDevice.isSelf();
        this.e = isSelf;
        Logger.b("Local controller active: %b", Boolean.valueOf(isSelf));
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.d.b(this.a.p(l.class.getSimpleName()).subscribe(new d(this)));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.d.a();
    }
}
