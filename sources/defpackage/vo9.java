package defpackage;

/* renamed from: vo9  reason: default package */
public final class vo9 implements fjf<uo9> {
    private final wlf<Boolean> a;

    public vo9(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uo9(this.a.get().booleanValue());
    }
}
