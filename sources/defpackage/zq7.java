package defpackage;

import io.reactivex.functions.d;

/* renamed from: zq7  reason: default package */
public final /* synthetic */ class zq7 implements d {
    public static final /* synthetic */ zq7 a = new zq7();

    private /* synthetic */ zq7() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        hs7 hs7 = (hs7) obj;
        hs7 hs72 = (hs7) obj2;
        return hs7.i() == hs72.i() && rw.equal(hs7.c().k(), hs72.c().k()) && rw.equal(hs7.c().i(), hs72.c().i());
    }
}
