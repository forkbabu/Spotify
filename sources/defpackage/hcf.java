package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: hcf  reason: default package */
public final /* synthetic */ class hcf implements w {
    public final /* synthetic */ PlayerState a;
    public final /* synthetic */ cqe b;
    public final /* synthetic */ d c;

    public /* synthetic */ hcf(PlayerState playerState, cqe cqe, d dVar) {
        this.a = playerState;
        this.b = cqe;
        this.c = dVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new qcf(this.a, this.b, this.c));
    }
}
