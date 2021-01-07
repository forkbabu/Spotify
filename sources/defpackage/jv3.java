package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.w;

/* renamed from: jv3  reason: default package */
public final class jv3 implements fjf<hv3> {
    private final wlf<kv3> a;
    private final wlf<w<Response, Response>> b;
    private final wlf<mv3> c;

    public jv3(wlf<kv3> wlf, wlf<w<Response, Response>> wlf2, wlf<mv3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hv3(this.a.get(), this.b.get(), this.c.get());
    }
}
