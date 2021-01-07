package defpackage;

/* renamed from: nn8  reason: default package */
public final class nn8 implements fjf<mn8> {
    private final wlf<jo8> a;
    private final wlf<sm8> b;

    public nn8(wlf<jo8> wlf, wlf<sm8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mn8(this.a.get(), this.b.get());
    }
}
