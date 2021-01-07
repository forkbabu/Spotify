package defpackage;

/* renamed from: dp2  reason: default package */
public final class dp2 implements fjf<cp2> {
    private final wlf<ko2> a;

    public dp2(wlf<ko2> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cp2(this.a.get());
    }
}
