package defpackage;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

/* renamed from: bz8  reason: default package */
public final class bz8 implements fjf<zy8> {
    private final az8 a;
    private final wlf<u> b;

    public bz8(az8 az8, wlf<u> wlf) {
        this.a = az8;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        az8 az8 = this.a;
        u uVar = this.b.get();
        az8.getClass();
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(zy8.class);
        h.d(c, "retrofitMaker.createWebg…ppedEndpoint::class.java)");
        return (zy8) c;
    }
}
