package defpackage;

/* renamed from: xo9  reason: default package */
public final class xo9 implements fjf<wo9> {
    private final wlf<ina> a;

    public xo9(wlf<ina> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wo9(this.a.get());
    }
}
