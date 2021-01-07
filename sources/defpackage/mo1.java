package defpackage;

import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: mo1  reason: default package */
public final class mo1 implements lo1 {
    private final oo1 a;

    public mo1(oo1 oo1) {
        h.e(oo1, "endPoint");
        this.a = oo1;
    }

    @Override // defpackage.lo1
    public z<b91> a() {
        z<U> e = this.a.a().e(b91.class);
        h.d(e, "endPoint.playlists().cas…ubsViewModel::class.java)");
        return e;
    }
}
