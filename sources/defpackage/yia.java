package defpackage;

import android.content.Context;
import com.spotify.mobile.android.sso.m;
import com.spotify.music.builtinauth.authenticator.f0;

/* renamed from: yia  reason: default package */
public final class yia implements fjf<xia> {
    private final wlf<f0> a;
    private final wlf<m> b;
    private final wlf<Context> c;

    public yia(wlf<f0> wlf, wlf<m> wlf2, wlf<Context> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xia(this.a.get(), this.b.get(), this.c.get());
    }
}
