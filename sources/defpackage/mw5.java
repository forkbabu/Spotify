package defpackage;

import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.ui.l0;
import com.spotify.libs.otp.ui.n0;
import com.spotify.music.features.phonenumbersignup.c;
import com.spotify.music.features.phonenumbersignup.f;
import io.reactivex.y;

/* renamed from: mw5  reason: default package */
public final class mw5 implements fjf<l0<c, f>> {
    private final wlf<d<c>> a;
    private final wlf<n0<c, f>> b;
    private final wlf<y> c;
    private final wlf<com.spotify.music.features.phonenumbersignup.datasource.d> d;
    private final wlf<l0.b> e;
    private final wlf<l0.d> f;

    public mw5(wlf<d<c>> wlf, wlf<n0<c, f>> wlf2, wlf<y> wlf3, wlf<com.spotify.music.features.phonenumbersignup.datasource.d> wlf4, wlf<l0.b> wlf5, wlf<l0.d> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
