package defpackage;

import defpackage.ru0;
import java.util.Set;

/* renamed from: su0  reason: default package */
public final class su0 implements fjf<ru0> {
    private final wlf<Set<ru0.a>> a;

    public su0(wlf<Set<ru0.a>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ru0(this.a.get());
    }
}
