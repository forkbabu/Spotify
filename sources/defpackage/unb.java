package defpackage;

/* renamed from: unb  reason: default package */
public final class unb implements fjf<tnb> {
    private final wlf<Boolean> a;

    public unb(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tnb(this.a.get().booleanValue());
    }
}
