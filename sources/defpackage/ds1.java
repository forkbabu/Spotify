package defpackage;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ds1  reason: default package */
public final class ds1 extends yr1 {
    public static final /* synthetic */ int k = 0;
    private b f;
    private final y g;
    private final g<PlayerState> h;
    private final cqe i;
    private final ss1 j;

    public ds1(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar, cqe cqe, ss1 ss1) {
        super(v1Var, aVar);
        this.g = yVar;
        this.h = gVar;
        this.i = cqe;
        this.j = ss1;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.f = this.h.Q(this.g).subscribe(new dr1(this), er1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        b bVar = this.f;
        if (bVar != null && !bVar.d()) {
            this.f.dispose();
            this.f = null;
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        c(AppProtocol.PlayerState.playerStateFrom(((ts1) this.j).a().orNull(), this.i));
    }

    public /* synthetic */ void k(PlayerState playerState) {
        c(AppProtocol.PlayerState.playerStateFrom(playerState, this.i));
    }
}
