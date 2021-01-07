package defpackage;

/* renamed from: ty6  reason: default package */
public final class ty6 implements fjf<sy6> {
    private final wlf<jzc> a;

    public ty6(wlf<jzc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sy6(this.a.get());
    }
}
