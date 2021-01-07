package com.spotify.music.features.connect.cast;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.r;

public class o extends com.spotify.music.features.connect.cast.discovery.a implements k {
    private final t f;
    private final r g;
    private v h;
    private final r.b i;

    public class a implements r.b {
        a() {
            o.this = r1;
        }

        public void a() {
            if (o.this.h != null) {
                o.this.h.d();
            }
        }

        public void b(DiscoveredDevice discoveredDevice) {
            if (!(o.this.h == null || discoveredDevice == null)) {
                o.this.h.a(discoveredDevice);
            }
            o.this.n(false);
        }
    }

    public o(Context context, String str, r rVar, t tVar) {
        super(context, str);
        a aVar = new a();
        this.i = aVar;
        this.f = tVar;
        this.g = rVar;
        rVar.n(aVar);
        tVar.q(this);
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void a() {
        this.f.n();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public boolean c(String str) {
        return this.g.j(str);
    }

    @Override // com.spotify.music.features.connect.cast.discovery.a, com.spotify.music.features.connect.cast.discovery.h
    public void d() {
        super.d();
        this.f.t();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void e(String str) {
        q(str, new a(this, str));
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void g(String str, v vVar) {
        this.h = vVar;
        if (!this.f.o(str)) {
            vVar.a(null);
        }
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public boolean h() {
        return true;
    }

    @Override // com.spotify.music.features.connect.cast.discovery.a, com.spotify.music.features.connect.cast.discovery.h
    public void i() {
        super.i();
        this.f.s();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void k(String str, v vVar) {
        this.h = vVar;
        if (!this.f.o(str)) {
            vVar.a(null);
        }
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public boolean l(String str) {
        CastDevice g2 = this.f.g(str);
        return g2 != null && !g2.s2();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void m(String str) {
        this.g.m(str);
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void n(boolean z) {
        this.f.o(null);
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void start() {
        this.g.o();
    }

    @Override // com.spotify.music.features.connect.cast.discovery.h
    public void stop() {
        this.g.p();
    }

    public /* synthetic */ void t(String str) {
        this.f.p(str);
    }

    public void u(DiscoveredDevice discoveredDevice) {
        o(discoveredDevice);
    }

    public void v(DiscoveredDevice discoveredDevice) {
        p(discoveredDevice.getDeviceId());
    }

    public void w(CastDevice castDevice) {
        if (castDevice != null) {
            this.g.g(castDevice);
        }
    }
}
