package defpackage;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

/* renamed from: ji4  reason: default package */
public final class ji4 implements fjf<hi4> {
    private final ii4 a;
    private final wlf<u> b;

    public ji4(ii4 ii4, wlf<u> wlf) {
        this.a = ii4;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ii4 ii4 = this.a;
        u uVar = this.b.get();
        ii4.getClass();
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(hi4.class);
        h.d(c, "retrofitMaker.createWebg…kageEndpoint::class.java)");
        return (hi4) c;
    }
}
