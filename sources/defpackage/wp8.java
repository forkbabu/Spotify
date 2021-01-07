package defpackage;

import com.spotify.music.features.tasteonboarding.logging.b;
import com.spotify.remoteconfig.v5;

/* renamed from: wp8  reason: default package */
public final class wp8 implements fjf<vp8> {
    private final wlf<kp8> a;
    private final wlf<cqe> b;
    private final wlf<b> c;
    private final wlf<b> d;
    private final wlf<v5> e;

    public wp8(wlf<kp8> wlf, wlf<cqe> wlf2, wlf<b> wlf3, wlf<b> wlf4, wlf<v5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vp8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
