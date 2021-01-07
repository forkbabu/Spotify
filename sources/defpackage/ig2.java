package defpackage;

import com.spotify.superbird.ota.model.h;
import io.reactivex.l;
import io.reactivex.subjects.c;

/* renamed from: ig2  reason: default package */
public final class ig2 implements fjf<hg2> {
    private final wlf<zne> a;
    private final wlf<vne> b;
    private final wlf<l<String>> c;
    private final wlf<c<h>> d;
    private final wlf<tne> e;
    private final wlf<c<ooe>> f;

    public ig2(wlf<zne> wlf, wlf<vne> wlf2, wlf<l<String>> wlf3, wlf<c<h>> wlf4, wlf<tne> wlf5, wlf<c<ooe>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hg2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
