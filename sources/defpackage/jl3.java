package defpackage;

/* renamed from: jl3  reason: default package */
public final class jl3 implements fjf<il3> {
    private final wlf<tl3> a;

    public jl3(wlf<tl3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new il3(this.a.get());
    }
}
