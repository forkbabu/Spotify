package defpackage;

/* renamed from: a77  reason: default package */
public final class a77 implements fjf<z67> {
    private final wlf<jzc> a;
    private final wlf<tsc> b;

    public a77(wlf<jzc> wlf, wlf<tsc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z67(this.a.get(), this.b.get());
    }
}
