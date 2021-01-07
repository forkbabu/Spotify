package defpackage;

/* renamed from: mj4  reason: default package */
public final class mj4 implements fjf<lj4> {
    private final wlf<nj4> a;

    public mj4(wlf<nj4> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lj4(this.a.get());
    }
}
