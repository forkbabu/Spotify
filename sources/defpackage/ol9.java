package defpackage;

import io.reactivex.y;

/* renamed from: ol9  reason: default package */
public final class ol9 implements fjf<nl9> {
    private final wlf<mk9> a;
    private final wlf<y> b;

    public ol9(wlf<mk9> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nl9(this.a.get(), this.b.get());
    }
}
