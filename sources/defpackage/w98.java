package defpackage;

/* renamed from: w98  reason: default package */
public final class w98 implements fjf<v98> {
    private final wlf<bj9> a;

    public w98(wlf<bj9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v98(this.a.get());
    }
}
