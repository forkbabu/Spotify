package defpackage;

/* renamed from: p80  reason: default package */
public final class p80 implements fjf<i80> {
    private final wlf<n80> a;

    public p80(wlf<n80> wlf) {
        this.a = wlf;
    }

    public static i80 a(Object obj) {
        return new i80((n80) obj);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
