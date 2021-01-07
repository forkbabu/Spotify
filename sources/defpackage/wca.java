package defpackage;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.instrumentation.g;
import com.spotify.libs.connect.volume.controllers.k;

/* renamed from: wca  reason: default package */
public final class wca implements fjf<vca> {
    private final wlf<k> a;
    private final wlf<dda> b;
    private final wlf<g> c;
    private final wlf<ConnectVolumeControlInstrumentation> d;

    public wca(wlf<k> wlf, wlf<dda> wlf2, wlf<g> wlf3, wlf<ConnectVolumeControlInstrumentation> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vca(this.a, this.b, this.c, this.d);
    }
}
