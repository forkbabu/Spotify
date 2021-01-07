package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.x;
import io.reactivex.y;
import java.nio.ByteBuffer;

/* renamed from: aef  reason: default package */
public final class aef implements fjf<zdf> {
    private final wlf<wdf> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<x<ByteBuffer>> c;
    private final wlf<y> d;
    private final wlf<sef> e;

    public aef(wlf<wdf> wlf, wlf<g<PlayerState>> wlf2, wlf<x<ByteBuffer>> wlf3, wlf<y> wlf4, wlf<sef> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zdf(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
