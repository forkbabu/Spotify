package defpackage;

import com.spotify.superbird.pitstop.room.b;
import io.reactivex.y;

/* renamed from: ope  reason: default package */
public final class ope implements fjf<npe> {
    private final wlf<gpe> a;
    private final wlf<b> b;
    private final wlf<y> c;

    public ope(wlf<gpe> wlf, wlf<b> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new npe(this.a.get(), this.b.get(), this.c.get());
    }
}
