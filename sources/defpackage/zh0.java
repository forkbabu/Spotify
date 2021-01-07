package defpackage;

/* renamed from: zh0  reason: default package */
public final class zh0 implements fjf<yh0> {
    private final wlf<wh0> a;

    public zh0(wlf<wh0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yh0(this.a.get());
    }
}
