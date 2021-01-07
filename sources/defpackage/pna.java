package defpackage;

import io.reactivex.y;

/* renamed from: pna  reason: default package */
public final class pna implements fjf<ona> {
    private final wlf<qna> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public pna(wlf<qna> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ona(this.a.get(), this.b.get(), this.c.get());
    }
}
