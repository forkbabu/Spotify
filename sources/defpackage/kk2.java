package defpackage;

/* renamed from: kk2  reason: default package */
public final class kk2 implements fjf<jk2> {
    private final wlf<fk2> a;

    public kk2(wlf<fk2> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jk2(this.a.get());
    }
}
