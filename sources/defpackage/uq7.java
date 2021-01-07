package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.d;

/* renamed from: uq7  reason: default package */
public final /* synthetic */ class uq7 implements d {
    public static final /* synthetic */ uq7 a = new uq7();

    private /* synthetic */ uq7() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        hs7 hs7 = (hs7) obj;
        hs7 hs72 = (hs7) obj2;
        if (hs7.c().p() != hs72.c().p() || !rw.equal(hs7.c().g(), hs72.c().g())) {
            return false;
        }
        if (!MoreObjects.isNullOrEmpty(hs72.c().g()) || rw.equal(hs7.d(), hs72.d())) {
            return true;
        }
        return false;
    }
}
