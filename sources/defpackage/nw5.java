package defpackage;

import com.spotify.libs.otp.ui.n0;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.phonenumbersignup.c;
import com.spotify.music.features.phonenumbersignup.f;

/* renamed from: nw5  reason: default package */
public final class nw5 implements fjf<n0<c, f>> {
    private final wlf<k> a;

    public nw5(wlf<k> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n0(this.a.get());
    }
}
