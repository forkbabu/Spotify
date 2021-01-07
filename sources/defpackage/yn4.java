package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* renamed from: yn4  reason: default package */
public final class yn4 implements fjf<Supplier<Integer>> {
    private final wlf<Context> a;

    public yn4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xn4(this.a.get());
    }
}
