package defpackage;

import java.util.Random;

/* renamed from: yl2  reason: default package */
public final class yl2 implements fjf<xl2> {
    private final wlf<Random> a;

    public yl2(wlf<Random> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xl2(this.a.get());
    }
}
