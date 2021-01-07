package defpackage;

import com.spotify.mobile.android.service.media.b3;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediabrowserservice.v1;
import com.spotify.music.libs.mediasession.e0;

/* renamed from: px8  reason: default package */
public final class px8 implements fjf<ox8> {
    private final wlf<cqe> a;
    private final wlf<d> b;
    private final wlf<pea> c;
    private final wlf<e0> d;
    private final wlf<p> e;
    private final wlf<b3> f;
    private final wlf<v1> g;

    public px8(wlf<cqe> wlf, wlf<d> wlf2, wlf<pea> wlf3, wlf<e0> wlf4, wlf<p> wlf5, wlf<b3> wlf6, wlf<v1> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ox8(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
