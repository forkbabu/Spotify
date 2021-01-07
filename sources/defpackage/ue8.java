package defpackage;

import java.util.Set;

/* renamed from: ue8  reason: default package */
public final class ue8 implements fjf<te8> {
    private final wlf<Set<ve8>> a;
    private final wlf<Set<we8>> b;

    public ue8(wlf<Set<ve8>> wlf, wlf<Set<we8>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new te8(this.a.get(), this.b.get());
    }
}
