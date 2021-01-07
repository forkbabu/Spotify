package defpackage;

/* renamed from: ep9  reason: default package */
public final class ep9 implements fjf<dp9> {
    private final wlf<Boolean> a;

    public ep9(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dp9(this.a.get().booleanValue());
    }
}
