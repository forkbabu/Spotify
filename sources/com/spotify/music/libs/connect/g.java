package com.spotify.music.libs.connect;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.container.app.foregroundstate.d;
import com.spotify.rxjava2.p;
import io.reactivex.s;

public class g {
    private final d a;
    private final p b = new p();
    private a c;

    public interface a {
    }

    public g(d dVar) {
        this.a = dVar;
    }

    public void a(GaiaDevice gaiaDevice) {
        if (gaiaDevice.isActive() && !this.a.a()) {
            a aVar = this.c;
            ((tm4) aVar).a.a(gaiaDevice.getAttachId());
        }
    }

    public void b(a aVar) {
        this.c = aVar;
    }

    public void c(s<GaiaDevice> sVar) {
        this.b.b(sVar.subscribe(new b(this), f.a));
    }

    public void d() {
        this.b.a();
    }
}
