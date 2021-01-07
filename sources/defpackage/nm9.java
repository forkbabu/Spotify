package defpackage;

/* renamed from: nm9  reason: default package */
public final class nm9 implements fjf<lm9> {
    private final wlf<en9> a;

    public nm9(wlf<en9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lm9(this.a.get());
    }
}
