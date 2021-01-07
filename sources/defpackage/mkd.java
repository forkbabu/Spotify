package defpackage;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

/* renamed from: mkd  reason: default package */
public final class mkd implements fjf<jkd> {
    private final kkd a;
    private final wlf<u> b;

    public mkd(kkd kkd, wlf<u> wlf) {
        this.a = kkd;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        kkd kkd = this.a;
        u uVar = this.b.get();
        kkd.getClass();
        h.e(uVar, "retrofitMaker");
        Object a2 = uVar.a(jkd.class, okhttp3.u.p("https://spotify.backtrace.io:6098/"));
        h.d(a2, "retrofitMaker.createCust…            url\n        )");
        return (jkd) a2;
    }
}
