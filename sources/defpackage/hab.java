package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.y;
import defpackage.p62;
import defpackage.r62;

/* renamed from: hab  reason: default package */
public final class hab implements fjf<s> {
    private final wlf<r62.a> a;
    private final wlf<c> b;
    private final wlf<y> c;

    public hab(wlf<r62.a> wlf, wlf<c> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = this.b.get();
        ajf a2 = ejf.a(this.c);
        p62.a a3 = p62.a();
        a3.b((String) cVar.M0(jab.c));
        a3.c((String) cVar.M0(jab.d));
        a3.e(((Integer) cVar.M0(jab.e)).intValue());
        a3.d(((y) a2.get()).b());
        return this.a.get().a(a3.a()).a();
    }
}
