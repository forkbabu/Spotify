package defpackage;

/* renamed from: tl8  reason: default package */
public final class tl8 implements fjf<Integer> {
    private final wlf<Boolean> a;

    public tl8(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Integer.valueOf(this.a.get().booleanValue() ? 0 : 3);
    }
}
