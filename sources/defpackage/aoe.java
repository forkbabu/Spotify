package defpackage;

import com.spotify.superbird.ota.api.b;
import io.reactivex.g;

/* renamed from: aoe  reason: default package */
public final class aoe implements fjf<zne> {
    private final wlf<b> a;
    private final wlf<xne> b;
    private final wlf<vne> c;
    private final wlf<yoe> d;
    private final wlf<ape> e;
    private final wlf<g<ooe>> f;

    public aoe(wlf<b> wlf, wlf<xne> wlf2, wlf<vne> wlf3, wlf<yoe> wlf4, wlf<ape> wlf5, wlf<g<ooe>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zne(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
