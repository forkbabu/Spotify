package defpackage;

import com.spotify.mobile.android.service.session.d;
import io.reactivex.y;

/* renamed from: zn1  reason: default package */
public final class zn1 implements fjf<yn1> {
    private final wlf<d> a;
    private final wlf<y> b;

    public zn1(wlf<d> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yn1(this.a.get(), this.b.get());
    }
}
