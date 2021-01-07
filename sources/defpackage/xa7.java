package defpackage;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

/* renamed from: xa7  reason: default package */
public final class xa7 implements fjf<za7> {
    private final va7 a;
    private final wlf<u> b;

    public xa7(va7 va7, wlf<u> wlf) {
        this.a = va7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        va7 va7 = this.a;
        u uVar = this.b.get();
        va7.getClass();
        h.e(uVar, "retrofitMaker");
        za7 za7 = (za7) uVar.c(za7.class);
        yif.g(za7, "Cannot return null from a non-@Nullable @Provides method");
        return za7;
    }
}
