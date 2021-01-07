package defpackage;

/* renamed from: ko8  reason: default package */
public final class ko8 implements fjf<jo8> {
    private final wlf<lo8> a;

    public ko8(wlf<lo8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jo8(this.a.get());
    }
}
