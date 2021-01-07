package defpackage;

import io.reactivex.y;

/* renamed from: xxd  reason: default package */
public final class xxd implements fjf<wxd> {
    private final wlf<cqe> a;
    private final wlf<txd> b;
    private final wlf<y> c;

    public xxd(wlf<cqe> wlf, wlf<txd> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wxd(this.a.get(), this.b.get(), this.c.get());
    }
}
