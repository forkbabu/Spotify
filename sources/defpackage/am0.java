package defpackage;

import com.spotify.music.libs.facebook.q;
import io.reactivex.y;

/* renamed from: am0  reason: default package */
public final class am0 implements fjf<zl0> {
    private final wlf<y> a;
    private final wlf<q> b;

    public am0(wlf<y> wlf, wlf<q> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zl0(this.a.get(), this.b.get());
    }
}
