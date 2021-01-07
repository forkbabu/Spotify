package defpackage;

/* renamed from: sh8  reason: default package */
public final class sh8 implements fjf<rh8> {
    private final wlf<ej8> a;
    private final wlf<ij8> b;

    public sh8(wlf<ej8> wlf, wlf<ij8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        rh8 rh8 = new rh8(this.a.get());
        rh8.c = this.b.get();
        return rh8;
    }
}
