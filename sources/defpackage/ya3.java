package defpackage;

import defpackage.sba;

/* renamed from: ya3  reason: default package */
public final class ya3 implements fjf<sba.a> {
    private final wlf<jr4> a;

    public ya3(wlf<jr4> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        if (this.a.get().isEnabled()) {
            return wa3.a;
        }
        return xa3.a;
    }
}
