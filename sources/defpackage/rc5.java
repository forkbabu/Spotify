package defpackage;

import com.jakewharton.rxrelay2.c;
import com.spotify.mobius.q;
import com.spotify.music.connection.l;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;

/* renamed from: rc5  reason: default package */
public final class rc5 {
    private final c<Boolean> a;
    private final c<Boolean> b;
    private final sc5 c;
    private final g<PlayerState> d;
    private final l e;

    public rc5(c<Boolean> cVar, c<Boolean> cVar2, sc5 sc5, g<PlayerState> gVar, l lVar) {
        this.a = cVar;
        this.b = cVar2;
        this.c = sc5;
        this.d = gVar;
        this.e = lVar;
    }

    public q<i> a() {
        g<PlayerState> gVar = this.d;
        gVar.getClass();
        return com.spotify.mobius.rx2.i.a(this.a.j0(lc5.a), this.b.E().j0(pc5.a), this.c.z().j0(nc5.a), new v(gVar).j0(mc5.a).E(), this.e.b().j0(qc5.a));
    }
}
