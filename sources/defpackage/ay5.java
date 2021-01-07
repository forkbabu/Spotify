package defpackage;

import android.app.Service;
import com.spotify.mobile.android.service.o;

/* renamed from: ay5  reason: default package */
public final class ay5 implements fjf<zx5> {
    private final wlf<Service> a;
    private final wlf<o> b;

    public ay5(wlf<Service> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zx5(this.a.get(), this.b.get());
    }
}
