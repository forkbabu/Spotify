package defpackage;

import android.content.res.Resources;
import com.spotify.libs.otp.ui.c0;
import com.spotify.libs.otp.ui.h0;
import com.spotify.libs.otp.ui.l0;
import com.spotify.loginflow.navigation.d;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.phonenumbersignup.c;
import com.spotify.music.features.phonenumbersignup.e;
import com.spotify.music.features.phonenumbersignup.f;
import com.spotify.music.features.phonenumbersignup.instrumentation.b;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: gx5  reason: default package */
public final class gx5 implements fjf<fx5> {
    private final wlf<Resources> a;
    private final wlf<d> b;
    private final wlf<k> c;
    private final wlf<y> d;
    private final wlf<y> e;
    private final wlf<s<SignupConfigurationResponse>> f;
    private final wlf<b> g;
    private final wlf<com.spotify.music.features.phonenumbersignup.datasource.d> h;
    private final wlf<com.spotify.libs.otp.session.d<c>> i;
    private final wlf<e> j;
    private final wlf<h0<c>> k;
    private final wlf<l0<c, f>> l;
    private final wlf<c0> m;
    private final wlf<wq0> n;
    private final wlf<br0> o;

    public gx5(wlf<Resources> wlf, wlf<d> wlf2, wlf<k> wlf3, wlf<y> wlf4, wlf<y> wlf5, wlf<s<SignupConfigurationResponse>> wlf6, wlf<b> wlf7, wlf<com.spotify.music.features.phonenumbersignup.datasource.d> wlf8, wlf<com.spotify.libs.otp.session.d<c>> wlf9, wlf<e> wlf10, wlf<h0<c>> wlf11, wlf<l0<c, f>> wlf12, wlf<c0> wlf13, wlf<wq0> wlf14, wlf<br0> wlf15) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fx5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get());
    }
}
