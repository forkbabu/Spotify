package com.spotify.remoteconfig;

public final class rc implements fjf<qc> {
    private final wlf<l0e> a;

    public rc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qc qcVar = (qc) this.a.get().a(k.a);
        yif.g(qcVar, "Cannot return null from a non-@Nullable @Provides method");
        return qcVar;
    }
}
