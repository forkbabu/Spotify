package defpackage;

/* renamed from: jn8  reason: default package */
public final class jn8 implements fjf<in8> {
    private final wlf<sm8> a;
    private final wlf<ho8> b;

    public jn8(wlf<sm8> wlf, wlf<ho8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new in8(this.a.get(), this.b.get());
    }
}
