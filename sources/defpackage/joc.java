package defpackage;

import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;

/* renamed from: joc  reason: default package */
public final class joc implements fjf<ioc> {
    private final wlf<SpeedControlInteractor> a;
    private final wlf<goc> b;

    public joc(wlf<SpeedControlInteractor> wlf, wlf<goc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ioc(this.a.get(), this.b.get());
    }
}
