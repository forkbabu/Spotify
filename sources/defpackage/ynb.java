package defpackage;

/* renamed from: ynb  reason: default package */
public final class ynb implements fjf<snb> {
    private final wlf<vnb> a;
    private final wlf<ttc> b;

    public ynb(wlf<vnb> wlf, wlf<ttc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new snb(this.a.get(), this.b.get());
    }
}
