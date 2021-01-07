package defpackage;

import java.util.Map;

/* renamed from: ok9  reason: default package */
public final class ok9 implements fjf<nk9> {
    private final wlf<Map<String, pk9<?>>> a;

    public ok9(wlf<Map<String, pk9<?>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nk9(this.a.get());
    }
}
