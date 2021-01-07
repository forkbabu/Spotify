package defpackage;

import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: yq8  reason: default package */
public final class yq8 implements fjf<s<Boolean>> {
    private final wlf<Integer> a;
    private final wlf<y> b;

    public yq8(wlf<Integer> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        int intValue = this.a.get().intValue();
        return s.i0(Boolean.TRUE).C((long) intValue, TimeUnit.MILLISECONDS, this.b.get());
    }
}
