package defpackage;

import com.spotify.libs.otp.session.d;
import com.spotify.music.features.phonenumbersignup.c;
import io.reactivex.y;

/* renamed from: dw5  reason: default package */
public final class dw5 implements fjf<d<c>> {
    private final wlf<y> a;
    private final wlf<com.spotify.music.features.phonenumbersignup.datasource.d> b;

    public dw5(wlf<y> wlf, wlf<com.spotify.music.features.phonenumbersignup.datasource.d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get());
    }
}
