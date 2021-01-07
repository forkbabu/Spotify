package defpackage;

import java.util.Set;

/* renamed from: ord  reason: default package */
public final class ord implements fjf<nrd> {
    private final wlf<Set<prd>> a;

    public ord(wlf<Set<prd>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nrd(this.a.get());
    }
}
