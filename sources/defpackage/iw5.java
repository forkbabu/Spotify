package defpackage;

import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.ui.h0;
import com.spotify.libs.otp.ui.i0;
import com.spotify.music.features.phonenumbersignup.c;

/* renamed from: iw5  reason: default package */
public final class iw5 implements fjf<h0<c>> {
    private final wlf<d<c>> a;
    private final wlf<i0<c>> b;
    private final wlf<h0.b> c;

    public iw5(wlf<d<c>> wlf, wlf<i0<c>> wlf2, wlf<h0.b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get(), this.c.get());
    }
}
