package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: ps1  reason: default package */
public final class ps1 extends yr1 {
    public static final /* synthetic */ int l = 0;
    private b f = EmptyDisposable.INSTANCE;
    private long g = -1;
    private final y h;
    private final g<PlayerState> i;
    private final cqe j;
    private final ss1 k;

    public ps1(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar, cqe cqe, ss1 ss1) {
        super(v1Var, aVar);
        this.h = yVar;
        this.i = gVar;
        this.j = cqe;
        this.k = ss1;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.f = this.i.Q(this.h).subscribe(new wr1(this), vr1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        if (!this.f.d()) {
            this.f.dispose();
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        c(new AppProtocol.TrackElapsed(((ts1) this.k).a().orNull(), this.j));
    }

    public /* synthetic */ void k(PlayerState playerState) {
        Long or = playerState.position(this.j.d()).or((Optional<Long>) -1L);
        if (this.g != or.longValue()) {
            this.g = or.longValue();
            c(new AppProtocol.TrackElapsed(playerState, this.j));
        }
    }
}
