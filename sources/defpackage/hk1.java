package defpackage;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.l;

/* renamed from: hk1  reason: default package */
public final class hk1 implements fjf<gk1> {
    private final wlf<l> a;
    private final wlf<com.spotify.libs.connect.volume.controllers.l> b;
    private final wlf<ConnectVolumeControlInstrumentation> c;

    public hk1(wlf<l> wlf, wlf<com.spotify.libs.connect.volume.controllers.l> wlf2, wlf<ConnectVolumeControlInstrumentation> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gk1(this.a.get(), this.b.get(), this.c.get());
    }
}
