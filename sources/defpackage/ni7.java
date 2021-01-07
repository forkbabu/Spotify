package defpackage;

import com.spotify.mobile.android.service.session.f;
import com.spotify.remoteconfig.PremiumDestinationProperties;

/* renamed from: ni7  reason: default package */
public final class ni7 implements fjf<mi7> {
    private final wlf<PremiumDestinationProperties> a;
    private final wlf<f> b;
    private final wlf<cqe> c;
    private final wlf<oi7> d;

    public ni7(wlf<PremiumDestinationProperties> wlf, wlf<f> wlf2, wlf<cqe> wlf3, wlf<oi7> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mi7(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
