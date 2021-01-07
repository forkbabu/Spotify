package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.y;

/* renamed from: my6  reason: default package */
public final class my6 implements fjf<ly6> {
    private final wlf<String> a;
    private final wlf<txc> b;
    private final wlf<RxWebToken> c;
    private final wlf<y> d;

    public my6(wlf<String> wlf, wlf<txc> wlf2, wlf<RxWebToken> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ly6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
