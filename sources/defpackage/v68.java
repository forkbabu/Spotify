package defpackage;

import android.app.Activity;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: v68  reason: default package */
public final class v68 implements fjf<u68> {
    private final wlf<Boolean> a;
    private final wlf<psa> b;
    private final wlf<q3> c;
    private final wlf<Activity> d;

    public v68(wlf<Boolean> wlf, wlf<psa> wlf2, wlf<q3> wlf3, wlf<Activity> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u68(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get());
    }
}
