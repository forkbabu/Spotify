package defpackage;

/* renamed from: s84  reason: default package */
public final class s84 implements fjf<r84> {
    private final wlf<u84> a;

    public s84(wlf<u84> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r84(this.a.get());
    }
}
