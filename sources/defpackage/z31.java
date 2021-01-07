package defpackage;

import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.k;
import kotlin.jvm.internal.h;

/* renamed from: z31  reason: default package */
public final class z31 implements fjf<w> {
    private final v31 a;
    private final wlf<k.a> b;

    public z31(v31 v31, wlf<k.a> wlf) {
        this.a = v31;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        v31 v31 = this.a;
        k.a aVar = this.b.get();
        v31.getClass();
        h.e(aVar, "dataSourceFactory");
        return new y.a(aVar);
    }
}
