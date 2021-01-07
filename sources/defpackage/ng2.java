package defpackage;

import com.spotify.superbird.ota.model.f;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ng2  reason: default package */
public final class ng2 implements fjf<mg2> {
    private final wlf<y> a;
    private final wlf<g<f>> b;

    public ng2(wlf<y> wlf, wlf<g<f>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mg2(this.a.get(), this.b.get());
    }
}
