package defpackage;

/* renamed from: gc3  reason: default package */
public final class gc3 implements fjf<kwd> {
    private final wlf<jwd> a;

    public gc3(wlf<jwd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kwd(this.a.get());
    }
}
