package defpackage;

/* renamed from: yl9  reason: default package */
public final class yl9 implements fjf<xl9> {
    private final wlf<zvd> a;

    public yl9(wlf<zvd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xl9(this.a.get());
    }
}
