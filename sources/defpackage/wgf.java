package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.l;
import io.reactivex.g;
import io.reactivex.schedulers.a;
import java.util.concurrent.TimeUnit;

/* renamed from: wgf  reason: default package */
public final class wgf implements fjf<g<ugf>> {
    private final wlf<l> a;

    public wgf(wlf<l> wlf) {
        this.a = wlf;
    }

    public static g<ugf> a(l lVar) {
        g<PlayerState> d = lVar.d();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.getClass();
        return d.X(250, timeUnit, a.a()).O(rgf.a).s();
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
