package defpackage;

import com.spotify.mobile.android.waze.model.b;
import io.reactivex.y;

/* renamed from: sb2  reason: default package */
public final class sb2 implements fjf<rb2> {
    private final wlf<b> a;
    private final wlf<y> b;
    private final wlf<vla> c;

    public sb2(wlf<b> wlf, wlf<y> wlf2, wlf<vla> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rb2(this.a.get(), this.b.get(), this.c.get());
    }
}
