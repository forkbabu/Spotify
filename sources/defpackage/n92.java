package defpackage;

import android.app.Application;
import com.spotify.mobile.android.waze.sdkprotocol.a;
import io.reactivex.y;

/* renamed from: n92  reason: default package */
public final class n92 implements fjf<m92> {
    private final wlf<Application> a;
    private final wlf<a> b;
    private final wlf<i92> c;
    private final wlf<y> d;

    public n92(wlf<Application> wlf, wlf<a> wlf2, wlf<i92> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m92(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
