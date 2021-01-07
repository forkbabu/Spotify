package com.spotify.libs.connect;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.volume.c;
import com.spotify.libs.connect.volume.l;
import com.spotify.rxjava2.q;
import defpackage.cs0;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.y;

public class p implements cs0.a {
    private volatile float a;
    private GaiaDevice b;
    private final q c = new q();
    private final c d;
    private final l e;
    private final y f;

    p(c cVar, l lVar, y yVar) {
        this.d = cVar;
        this.e = lVar;
        this.f = yVar;
    }

    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        this.b = gaiaDevice;
    }

    public /* synthetic */ void b(x xVar, Float f2) {
        this.a = f2.floatValue();
        xVar.onNext(Float.valueOf(this.a));
    }

    public void c(x<Float> xVar, s<GaiaDevice> sVar, GaiaDevice gaiaDevice) {
        this.b = gaiaDevice;
        this.c.a(sVar.o0(this.f).subscribe(new d(this), c.a));
        this.c.a(this.e.a().subscribe(new e(this, xVar), new b(xVar)));
    }

    public boolean d() {
        GaiaDevice gaiaDevice = this.b;
        return gaiaDevice != null && !gaiaDevice.isSelf() && this.b.supportsVolume();
    }

    public void e() {
        this.c.c();
    }
}
