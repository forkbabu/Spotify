package defpackage;

/* renamed from: u8b  reason: default package */
public final class u8b implements fjf<t8b> {
    private final wlf<String> a;

    public u8b(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t8b(this.a.get());
    }
}
