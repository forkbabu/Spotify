package defpackage;

/* renamed from: ctc  reason: default package */
public final class ctc implements fjf<btc> {
    private final wlf<ysc> a;
    private final wlf<rsc> b;

    public ctc(wlf<ysc> wlf, wlf<rsc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new btc(this.a.get(), this.b.get());
    }
}
