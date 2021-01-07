package defpackage;

/* renamed from: ot8  reason: default package */
public final class ot8 implements fjf<nt8> {
    private final wlf<String> a;

    public ot8(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nt8(this.a.get());
    }
}
