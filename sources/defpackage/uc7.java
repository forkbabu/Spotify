package defpackage;

/* renamed from: uc7  reason: default package */
public final class uc7 implements fjf<tc7> {
    private final wlf<Boolean> a;
    private final wlf<awc> b;
    private final wlf<String> c;

    public uc7(wlf<Boolean> wlf, wlf<awc> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tc7(this.a.get().booleanValue(), this.b.get(), this.c.get());
    }
}
