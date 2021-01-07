package defpackage;

import com.spotify.accountinfostore.room.LocalAccountInfoDatabase;
import io.reactivex.y;

/* renamed from: i70  reason: default package */
public final class i70 implements fjf<g70> {
    private final wlf<cqe> a;
    private final wlf<y> b;
    private final wlf<LocalAccountInfoDatabase> c;

    public i70(wlf<cqe> wlf, wlf<y> wlf2, wlf<LocalAccountInfoDatabase> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g70(this.a.get(), this.b.get(), ejf.a(this.c));
    }
}
