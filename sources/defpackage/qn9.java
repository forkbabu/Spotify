package defpackage;

import com.spotify.remoteconfig.AndroidGoogleClockProperties;

/* renamed from: qn9  reason: default package */
public final class qn9 implements fjf<pn9> {
    private final wlf<AndroidGoogleClockProperties> a;
    private final wlf<fi1> b;

    public qn9(wlf<AndroidGoogleClockProperties> wlf, wlf<fi1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pn9(this.a.get(), this.b.get());
    }
}
