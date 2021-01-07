package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import defpackage.kef;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: qcf  reason: default package */
public final /* synthetic */ class qcf implements l {
    public final /* synthetic */ PlayerState a;
    public final /* synthetic */ cqe b;
    public final /* synthetic */ d c;

    public /* synthetic */ qcf(PlayerState playerState, cqe cqe, d dVar) {
        this.a = playerState;
        this.b = cqe;
        this.c = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = this.a;
        cqe cqe = this.b;
        z<zwd> a2 = this.c.a(c.g(rw.constrainToRange(((kef.q) obj).t() + playerState.position(cqe.d()).or((Optional<Long>) 0L).longValue(), 0, playerState.duration().or((Optional<Long>) 0L).longValue())));
        a2.getClass();
        return new i(a2).N();
    }
}
