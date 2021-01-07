package com.spotify.music.features.connect.plugins;

import com.google.common.collect.Collections2;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaState;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.connect.discovery.g;
import com.spotify.music.features.connect.discovery.j;
import com.spotify.music.playback.api.b;
import com.spotify.music.playback.api.f;
import com.spotify.rxjava2.p;
import io.reactivex.y;

public class e implements d, b, f {
    private ActiveConnectDevice a = ActiveConnectDevice.NONE;
    private final ConnectManager b;
    private final hba c;
    private final ru0 f;
    private final gs0 n;
    private final cs0 o;
    private final g p;
    private final j q;
    private final p r = new p();
    private final c s;
    private final xca t;
    private final qda u;
    private final y v;

    e(gs0 gs0, ConnectManager connectManager, cs0 cs0, g gVar, y yVar, hba hba, xca xca, j jVar, c cVar, qda qda, ru0 ru0) {
        this.b = connectManager;
        this.c = hba;
        this.f = ru0;
        this.n = gs0;
        this.o = cs0;
        this.q = jVar;
        this.p = gVar;
        this.s = cVar;
        this.t = xca;
        this.u = qda;
        this.v = yVar;
    }

    public static void c(e eVar, GaiaState gaiaState) {
        ActiveConnectDevice activeConnectDevice;
        eVar.getClass();
        gaiaState.getClass();
        if (gaiaState.isActive().booleanValue()) {
            activeConnectDevice = ActiveConnectDevice.LOCAL;
        } else if (Collections2.any(gaiaState.getDevices(), a.a)) {
            activeConnectDevice = ActiveConnectDevice.REMOTE;
        } else {
            activeConnectDevice = ActiveConnectDevice.NONE;
        }
        if (activeConnectDevice != eVar.a) {
            eVar.a = activeConnectDevice;
        }
        eVar.s.a(gaiaState);
    }

    @Override // com.spotify.music.playback.api.b
    public boolean a() {
        return this.a != ActiveConnectDevice.REMOTE;
    }

    @Override // com.spotify.music.playback.api.f
    public boolean b() {
        return this.a == ActiveConnectDevice.REMOTE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.b.start();
        this.f.a();
        this.c.d();
        this.p.r(this.q);
        this.b.l(this.p);
        this.p.C();
        this.b.n(this.p);
        this.p.a();
        this.r.b(this.n.a().o0(this.v).subscribe(new b(this)));
        this.t.d();
        this.u.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.r.a();
        synchronized (this) {
            this.p.B(this.q);
            this.b.k(this.p);
            this.o.e(null);
            this.b.n(null);
            this.p.F();
        }
        this.f.b();
        this.b.stop();
        this.c.e();
        this.t.e();
        this.u.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SpotifyConnect";
    }
}
