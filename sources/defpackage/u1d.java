package defpackage;

import com.adjust.sdk.Constants;
import com.spotify.http.u;
import okhttp3.u;

/* renamed from: u1d  reason: default package */
public final class u1d implements fjf<q1d> {
    private final wlf<u> a;

    public u1d(wlf<u> wlf) {
        this.a = wlf;
    }

    public static q1d a(u uVar) {
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f("shareables.scdn.co");
        q1d q1d = (q1d) uVar.a(q1d.class, aVar.c());
        yif.g(q1d, "Cannot return null from a non-@Nullable @Provides method");
        return q1d;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
