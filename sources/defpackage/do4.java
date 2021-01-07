package defpackage;

/* renamed from: do4  reason: default package */
public final class do4 implements fjf<co4> {
    private final wlf<i80> a;

    public do4(wlf<i80> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new co4(this.a.get());
    }
}
