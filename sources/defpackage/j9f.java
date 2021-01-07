package defpackage;

import defpackage.t8a;

/* renamed from: j9f  reason: default package */
public final class j9f implements fjf<i9f> {
    private final wlf<t8a.a> a;

    public j9f(wlf<t8a.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i9f(this.a.get());
    }
}
