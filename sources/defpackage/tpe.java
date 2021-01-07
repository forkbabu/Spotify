package defpackage;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

/* renamed from: tpe  reason: default package */
public final class tpe implements fjf<rpe> {
    private final spe a;
    private final wlf<u> b;

    public tpe(spe spe, wlf<u> wlf) {
        this.a = spe;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        spe spe = this.a;
        u uVar = this.b.get();
        spe.getClass();
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(rpe.class);
        h.d(c, "retrofitMaker.createWebg…setsEndpoint::class.java)");
        return (rpe) c;
    }
}
