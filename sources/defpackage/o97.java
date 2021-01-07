package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: o97  reason: default package */
public class o97 implements n97 {
    private final g<PlayerState> a;
    private final g<Long> b;

    public o97(g<PlayerState> gVar, g<Long> gVar2) {
        this.a = gVar;
        this.b = gVar2;
    }

    @Override // defpackage.n97
    public s<m97> c() {
        return new v(g.i(this.a, this.b, h97.a).s());
    }
}
