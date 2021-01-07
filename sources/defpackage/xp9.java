package defpackage;

/* renamed from: xp9  reason: default package */
public final class xp9 implements fjf<wp9> {
    private final wlf<a71> a;

    public xp9(wlf<a71> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wp9(this.a.get());
    }
}
