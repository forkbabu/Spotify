package defpackage;

import defpackage.soa;

/* renamed from: poa  reason: default package */
public final class poa implements fjf<ooa> {
    private final wlf<soa.a> a;

    public poa(wlf<soa.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ooa(this.a.get());
    }
}
