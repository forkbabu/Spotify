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

/* renamed from: bs1  reason: default package */
public final class bs1 extends yr1 {
    public static final /* synthetic */ int k = 0;
    private AppProtocol.TrackData f;
    private b g = EmptyDisposable.INSTANCE;
    private final y h;
    private final g<PlayerState> i;
    private final ss1 j;

    public bs1(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar, ss1 ss1) {
        super(v1Var, aVar);
        this.h = yVar;
        this.i = gVar;
        this.j = ss1;
    }

    public static void k(bs1 bs1, PlayerState playerState) {
        bs1.getClass();
        AppProtocol.TrackData trackDataFor = AppProtocol.TrackData.trackDataFor(playerState);
        if (!trackDataFor.equals(bs1.f)) {
            bs1.f = trackDataFor;
            bs1.c(trackDataFor);
        }
    }

    @Override // defpackage.ff2
    public void d() {
        this.g = this.i.Q(this.h).subscribe(new ar1(this), zq1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        if (!this.g.d()) {
            this.g.dispose();
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        Optional<PlayerState> a = ((ts1) this.j).a();
        if (!a.isPresent()) {
            c(AppProtocol.c);
        } else {
            c(AppProtocol.TrackData.trackDataFor(a.get()));
        }
    }
}
