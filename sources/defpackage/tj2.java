package defpackage;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

/* renamed from: tj2  reason: default package */
public final class tj2 implements fjf<fj2> {
    private final sj2 a;
    private final wlf<u> b;

    public tj2(sj2 sj2, wlf<u> wlf) {
        this.a = sj2;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        sj2 sj2 = this.a;
        u uVar = this.b.get();
        sj2.getClass();
        h.e(uVar, "retrofitMaker");
        fj2 fj2 = (fj2) uVar.c(fj2.class);
        yif.g(fj2, "Cannot return null from a non-@Nullable @Provides method");
        return fj2;
    }
}
