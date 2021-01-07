package defpackage;

/* renamed from: m47  reason: default package */
public final class m47 implements fjf<l47> {
    private final wlf<coa> a;

    public m47(wlf<coa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l47(this.a.get());
    }
}
