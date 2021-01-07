package defpackage;

/* renamed from: vf2  reason: default package */
public final class vf2 implements fjf<uf2> {
    private final wlf<nkd> a;

    public vf2(wlf<nkd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uf2(this.a.get());
    }
}
