package defpackage;

/* renamed from: bha  reason: default package */
public final class bha implements fjf<aha> {
    private final wlf<vga> a;

    public bha(wlf<vga> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aha(this.a.get());
    }
}
