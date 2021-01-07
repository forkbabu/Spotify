package defpackage;

import com.spotify.libs.connect.providers.h;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: oy5  reason: default package */
public final class oy5 implements fjf<ny5> {
    private final wlf<d> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<mz5> c;
    private final wlf<h> d;
    private final wlf<cqe> e;

    public oy5(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<mz5> wlf3, wlf<h> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ny5(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
