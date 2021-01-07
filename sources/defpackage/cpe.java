package defpackage;

/* renamed from: cpe  reason: default package */
public final class cpe implements fjf<bpe> {
    private final wlf<dpe> a;
    private final wlf<cqe> b;

    public cpe(wlf<dpe> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bpe(this.a.get(), this.b.get());
    }
}
