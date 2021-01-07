package defpackage;

/* renamed from: dr9  reason: default package */
public final class dr9 implements fjf<cr9> {
    private final wlf<gr9> a;

    public dr9(wlf<gr9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cr9(this.a.get());
    }
}
