package defpackage;

import com.spotify.music.spotlets.offline.util.c;
import io.reactivex.y;

/* renamed from: pp4  reason: default package */
public final class pp4 implements fjf<op4> {
    private final wlf<qo4> a;
    private final wlf<c> b;
    private final wlf<y> c;

    public pp4(wlf<qo4> wlf, wlf<c> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new op4(this.a.get(), this.b.get(), this.c.get());
    }
}
