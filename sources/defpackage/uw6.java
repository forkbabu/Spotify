package defpackage;

import com.spotify.glue.dialogs.g;
import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* renamed from: uw6  reason: default package */
public final class uw6 implements fjf<tw6> {
    private final wlf<t> a;
    private final wlf<wt6> b;
    private final wlf<y> c;
    private final wlf<v> d;
    private final wlf<g> e;

    public uw6(wlf<t> wlf, wlf<wt6> wlf2, wlf<y> wlf3, wlf<v> wlf4, wlf<g> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tw6(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
