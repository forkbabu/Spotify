package defpackage;

/* renamed from: vk4  reason: default package */
public final class vk4 implements fjf<uk4> {
    private final wlf<kk4> a;

    public vk4(wlf<kk4> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uk4(this.a.get());
    }
}
