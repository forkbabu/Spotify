package defpackage;

import com.google.protobuf.u;
import com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties;

/* renamed from: fja  reason: default package */
public final class fja implements fjf<eja> {
    private final wlf<AndroidMediaBrowserServiceProperties> a;
    private final wlf<gl0<u>> b;

    public fja(wlf<AndroidMediaBrowserServiceProperties> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eja(this.a.get(), this.b.get());
    }
}
