package defpackage;

import com.spotify.mobile.android.util.t;
import kotlin.jvm.internal.h;

/* renamed from: lkd  reason: default package */
public final class lkd implements fjf<hkd> {
    private final kkd a;
    private final wlf<jkd> b;
    private final wlf<t> c;

    public lkd(kkd kkd, wlf<jkd> wlf, wlf<t> wlf2) {
        this.a = kkd;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        kkd kkd = this.a;
        jkd jkd = this.b.get();
        t tVar = this.c.get();
        kkd.getClass();
        h.e(jkd, "superbirdCrashReportingEndpoint");
        h.e(tVar, "clientInfo");
        return new ikd(jkd, tVar);
    }
}
