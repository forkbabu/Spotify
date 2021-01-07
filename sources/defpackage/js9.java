package defpackage;

/* renamed from: js9  reason: default package */
public final class js9 implements fjf<is9> {
    private final wlf<ws9> a;

    public js9(wlf<ws9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new is9(this.a.get());
    }
}
