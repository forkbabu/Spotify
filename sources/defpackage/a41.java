package defpackage;

import kotlin.jvm.internal.h;
import okhttp3.y;

/* renamed from: a41  reason: default package */
public final class a41 implements fjf<jj> {
    private final v31 a;
    private final wlf<y> b;

    public a41(v31 v31, wlf<y> wlf) {
        this.a = v31;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        v31 v31 = this.a;
        y yVar = this.b.get();
        v31.getClass();
        h.e(yVar, "okHttpClient");
        return new jj(yVar, "preview-player-lib");
    }
}
