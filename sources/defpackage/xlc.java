package defpackage;

import com.spotify.pageloader.m0;
import com.spotify.pageloader.o0;
import kotlin.jvm.internal.h;

/* renamed from: xlc  reason: default package */
public final class xlc implements wlc {
    private final vjc a;
    private final int b;

    public xlc(vjc vjc, int i) {
        h.e(vjc, "dataSource");
        this.a = vjc;
        this.b = i;
    }

    @Override // defpackage.wlc
    public o0<wjc> a() {
        o0<wjc> a2 = m0.a(this.a.a(0, this.b));
        h.d(a2, "SingleLoadable.create(da…tDataSingle(0, pageSize))");
        return a2;
    }
}
