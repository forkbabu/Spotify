package defpackage;

import io.reactivex.l;
import kotlin.jvm.internal.h;

/* renamed from: upe  reason: default package */
public final class upe implements fjf<ppe> {
    private final spe a;
    private final wlf<rpe> b;
    private final wlf<l<String>> c;
    private final wlf<cqe> d;

    public upe(spe spe, wlf<rpe> wlf, wlf<l<String>> wlf2, wlf<cqe> wlf3) {
        this.a = spe;
        this.b = wlf;
        this.c = wlf2;
        this.d = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        spe spe = this.a;
        rpe rpe = this.b.get();
        l<String> lVar = this.c.get();
        cqe cqe = this.d.get();
        spe.getClass();
        h.e(rpe, "superbirdPresetsEndpoint");
        h.e(lVar, "superbirdSerial");
        h.e(cqe, "clock");
        return new qpe(rpe, lVar, cqe);
    }
}
