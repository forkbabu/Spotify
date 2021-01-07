package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: pjc  reason: default package */
public class pjc {
    private final g<PlayerState> a;

    public pjc(g<PlayerState> gVar) {
        this.a = gVar;
    }

    public s<PlayerState> a(y yVar) {
        g<PlayerState> gVar = this.a;
        gVar.getClass();
        return new v(gVar).J0(new mjc(yVar));
    }
}
