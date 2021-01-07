package defpackage;

/* renamed from: tp5  reason: default package */
public final class tp5 implements fjf<sp5> {
    private final wlf<to5> a;

    public tp5(wlf<to5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sp5(this.a.get());
    }
}
