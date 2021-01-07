package defpackage;

import io.reactivex.l;

/* renamed from: akd  reason: default package */
public final class akd implements fjf<l<String>> {
    private final wlf<bkd> a;

    public akd(wlf<bkd> wlf) {
        this.a = wlf;
    }

    public static l<String> a(bkd bkd) {
        return bkd.a();
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a();
    }
}
