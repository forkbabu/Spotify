package defpackage;

import com.spotify.player.play.f;

/* renamed from: bn3  reason: default package */
public final class bn3 implements fjf<an3> {
    private final wlf<f> a;
    private final wlf<lxd> b;

    public bn3(wlf<f> wlf, wlf<lxd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new an3(this.a.get(), this.b.get());
    }
}
