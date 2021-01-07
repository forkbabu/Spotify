package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: y6e  reason: default package */
public final class y6e implements fjf<x6e> {
    private final wlf<Context> a;
    private final wlf<Map<Integer, List<i6e>>> b;

    public y6e(wlf<Context> wlf, wlf<Map<Integer, List<i6e>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x6e(this.a.get(), this.b.get());
    }
}
