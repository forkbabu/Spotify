package defpackage;

/* renamed from: jl5  reason: default package */
public final class jl5 implements fjf<il5> {
    private final wlf<tf5> a;

    public jl5(wlf<tf5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new il5(this.a.get());
    }
}
