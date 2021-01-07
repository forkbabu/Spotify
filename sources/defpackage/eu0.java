package defpackage;

/* renamed from: eu0  reason: default package */
public final class eu0 implements fjf<du0> {
    private final wlf<fu0> a;

    public eu0(wlf<fu0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new du0(this.a.get());
    }
}
