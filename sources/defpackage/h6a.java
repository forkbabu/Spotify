package defpackage;

import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: h6a  reason: default package */
public final class h6a implements fjf<s<Boolean>> {
    private final wlf<j6a> a;
    private final wlf<y> b;

    public h6a(wlf<j6a> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static s<Boolean> a(j6a j6a, y yVar) {
        h.e(j6a, "suppressOfflineBanner");
        h.e(yVar, "mainThreadScheduler");
        s<Boolean> o0 = j6a.a().o0(yVar);
        h.d(o0, "suppressOfflineBanner.co…ThreadScheduler\n        )");
        return o0;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
