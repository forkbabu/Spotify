package defpackage;

/* renamed from: sh0  reason: default package */
public final class sh0 implements fjf<rh0> {
    private final wlf<qh0> a;

    public sh0(wlf<qh0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rh0(this.a.get());
    }
}
