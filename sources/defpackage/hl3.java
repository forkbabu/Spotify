package defpackage;

/* renamed from: hl3  reason: default package */
public final class hl3 implements fjf<el3> {
    private final wlf<sl3> a;

    public hl3(wlf<sl3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new el3(this.a.get());
    }
}
