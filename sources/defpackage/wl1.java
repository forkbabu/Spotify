package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.i2;
import com.spotify.mobile.android.service.media.p2;
import com.spotify.player.model.ContextTrack;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: wl1  reason: default package */
public class wl1 {
    private final pea a;
    private final p2 b;
    private final i2 c;

    public wl1(pea pea, p2 p2Var, i2 i2Var) {
        this.a = pea;
        this.b = p2Var;
        this.c = i2Var;
    }

    public e a(yda yda, int i, Optional optional) {
        if (!optional.isPresent()) {
            return b.a;
        }
        ContextTrack contextTrack = (ContextTrack) optional.get();
        z<String> n = this.a.n(yda, contextTrack.uri(), null);
        n.getClass();
        i iVar = new i(n);
        if (i > 0) {
            z<zwd> j = this.c.j(contextTrack);
            j.getClass();
            return new i(j).E(iVar);
        } else if (i >= 0) {
            return iVar;
        } else {
            z<zwd> f = this.c.f(contextTrack);
            f.getClass();
            return new i(f).E(iVar);
        }
    }

    public a b(int i, yda yda) {
        return this.b.m(i).t(new rl1(this, yda, i)).B();
    }
}
