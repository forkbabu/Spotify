package defpackage;

/* renamed from: zo5  reason: default package */
public final class zo5 implements fjf<yo5> {
    private final wlf<to5> a;

    public zo5(wlf<to5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yo5(this.a.get());
    }
}
