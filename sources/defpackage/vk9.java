package defpackage;

/* renamed from: vk9  reason: default package */
public final class vk9 implements fjf<uk9> {
    private final wlf<jz1> a;
    private final wlf<String> b;
    private final wlf<cqe> c;

    public vk9(wlf<jz1> wlf, wlf<String> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uk9(this.a.get(), this.b.get(), this.c.get());
    }
}
