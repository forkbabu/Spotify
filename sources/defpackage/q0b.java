package defpackage;

import defpackage.xya;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import io.reactivex.v;
import io.reactivex.w;
import java.util.concurrent.TimeUnit;

/* renamed from: q0b  reason: default package */
public class q0b implements w<xya.g, zya> {
    private final vz0 a;
    private final w<xya.g, tz0> b;

    public q0b(vz0 vz0, w<xya.g, tz0> wVar) {
        this.a = vz0;
        this.b = wVar;
    }

    public /* synthetic */ s a(tz0 tz0) {
        return this.a.a(tz0.a()).A(new wza(tz0)).A(vza.a).E(new tza(tz0)).P();
    }

    @Override // io.reactivex.w
    public v<zya> apply(s<xya.g> sVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sVar.getClass();
        return sVar.z(200, timeUnit, a.a()).q(this.b).q(new h0b(new uza(this), c0b.a));
    }
}
