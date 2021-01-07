package defpackage;

import android.app.Application;
import com.spotify.mobile.android.util.t;

/* renamed from: au2  reason: default package */
public final class au2 implements fjf<t> {
    private final wlf<Application> a;
    private final wlf<yyd> b;

    public au2(wlf<Application> wlf, wlf<yyd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ds2(this.a.get(), "com.spotify.music", false, this.b.get());
    }
}
