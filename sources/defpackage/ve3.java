package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: ve3  reason: default package */
public class ve3 implements w<b91, b91> {
    private final g<PlayerState> a;
    private final y b;

    public ve3(g<PlayerState> gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        g<PlayerState> gVar = this.a;
        return s.n(sVar, je.Z(gVar, gVar).j0(te3.a).G0(Optional.absent()).o0(this.b).E(), new ue3(this));
    }
}
