package defpackage;

import com.spotify.libs.connect.volume.l;
import io.reactivex.y;

/* renamed from: cda  reason: default package */
public final class cda implements fjf<bda> {
    private final wlf<l> a;
    private final wlf<y> b;

    public cda(wlf<l> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bda(this.a.get(), this.b.get());
    }
}
