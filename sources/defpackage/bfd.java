package defpackage;

import io.reactivex.y;

/* renamed from: bfd  reason: default package */
public final class bfd implements fjf<afd> {
    private final wlf<y> a;

    public bfd(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new afd(this.a.get());
    }
}
