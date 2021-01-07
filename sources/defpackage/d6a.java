package defpackage;

import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: d6a  reason: default package */
public final class d6a implements fjf<s<Boolean>> {
    private final wlf<f6a> a;
    private final wlf<y> b;

    public d6a(wlf<f6a> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        f6a f6a = this.a.get();
        y yVar = this.b.get();
        h.e(f6a, "suppressBanners");
        h.e(yVar, "mainThreadScheduler");
        s<Boolean> o0 = f6a.a().o0(yVar);
        h.d(o0, "suppressBanners.navigati…veOn(mainThreadScheduler)");
        return o0;
    }
}
