package defpackage;

import defpackage.v32;

/* renamed from: s32  reason: default package */
public final class s32 implements fjf<r32> {
    private final wlf<v32.a> a;
    private final wlf<t32> b;

    public s32(wlf<v32.a> wlf, wlf<t32> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r32(this.a.get(), this.b.get());
    }
}
