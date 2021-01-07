package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.sso.protocol.a;

/* renamed from: ila  reason: default package */
public final class ila implements fjf<hla> {
    private final wlf<e92> a;
    private final wlf<r92> b;
    private final wlf<Activity> c;
    private final wlf<dla> d;
    private final wlf<a> e;

    public ila(wlf<e92> wlf, wlf<r92> wlf2, wlf<Activity> wlf3, wlf<dla> wlf4, wlf<a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hla(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
