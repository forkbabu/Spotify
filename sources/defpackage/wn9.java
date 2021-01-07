package defpackage;

import com.spotify.remoteconfig.AndroidGoogleClockProperties;

/* renamed from: wn9  reason: default package */
public final class wn9 implements fjf<vn9> {
    private final wlf<AndroidGoogleClockProperties> a;
    private final wlf<jh1> b;
    private final wlf<co9> c;
    private final wlf<rn9> d;

    public wn9(wlf<AndroidGoogleClockProperties> wlf, wlf<jh1> wlf2, wlf<co9> wlf3, wlf<rn9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vn9(this.a.get(), this.b, this.c, this.d);
    }
}
