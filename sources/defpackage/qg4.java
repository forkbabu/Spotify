package defpackage;

import defpackage.og4;

/* renamed from: qg4  reason: default package */
public final class qg4 implements fjf<og4.b> {
    private final wlf<String> a;

    public qg4(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new og4.b(this.a.get());
    }
}
