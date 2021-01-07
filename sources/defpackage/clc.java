package defpackage;

/* renamed from: clc  reason: default package */
public final class clc implements fjf<blc> {
    private final wlf<dlc> a;
    private final wlf<flc> b;

    public clc(wlf<dlc> wlf, wlf<flc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new blc(this.a.get(), this.b.get());
    }
}
