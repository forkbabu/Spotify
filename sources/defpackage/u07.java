package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.playlist.extender.f0;
import io.reactivex.y;

/* renamed from: u07  reason: default package */
public final class u07 implements fjf<t07> {
    private final wlf<y> a;
    private final wlf<f0.b> b;
    private final wlf<l> c;

    public u07(wlf<y> wlf, wlf<f0.b> wlf2, wlf<l> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t07(this.a, this.b, this.c);
    }
}
