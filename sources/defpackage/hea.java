package defpackage;

import com.google.protobuf.u;
import com.spotify.libs.connect.j;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: hea  reason: default package */
public final class hea implements fjf<cea> {
    private final wlf<dea> a;
    private final wlf<gl0<u>> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<y> d;
    private final wlf<iea> e;
    private final wlf<j> f;

    public hea(wlf<dea> wlf, wlf<gl0<u>> wlf2, wlf<g<PlayerState>> wlf3, wlf<y> wlf4, wlf<iea> wlf5, wlf<j> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cea(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
