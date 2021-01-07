package defpackage;

/* renamed from: x32  reason: default package */
public final class x32 implements fjf<w32> {
    private final wlf<ona> a;

    public x32(wlf<ona> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w32(this.a.get());
    }
}
