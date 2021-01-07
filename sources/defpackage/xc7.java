package defpackage;

/* renamed from: xc7  reason: default package */
public final class xc7 implements fjf<wc7> {
    private final wlf<Boolean> a;
    private final wlf<ttc> b;
    private final wlf<String> c;

    public xc7(wlf<Boolean> wlf, wlf<ttc> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wc7(this.a.get().booleanValue(), this.b.get(), this.c.get());
    }
}
