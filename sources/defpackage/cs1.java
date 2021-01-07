package defpackage;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: cs1  reason: default package */
public final class cs1 extends yr1 {
    public static final /* synthetic */ int k = 0;
    private AppProtocol.PlaybackSpeed f;
    private b g;
    private final y h;
    private final g<PlayerState> i;
    private final ss1 j;

    public cs1(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar, ss1 ss1) {
        super(v1Var, aVar);
        this.h = yVar;
        this.i = gVar;
        this.j = ss1;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.g = this.i.Q(this.h).subscribe(new br1(this), cr1.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        b bVar = this.g;
        if (bVar != null && !bVar.d()) {
            this.g.dispose();
            this.g = null;
        }
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i2) {
        c(new AppProtocol.PlaybackSpeed(((ts1) this.j).a().orNull()));
    }

    public /* synthetic */ void k(PlayerState playerState) {
        AppProtocol.PlaybackSpeed playbackSpeed = new AppProtocol.PlaybackSpeed(playerState);
        if (!playbackSpeed.equals(this.f)) {
            this.f = playbackSpeed;
            c(playbackSpeed);
        }
    }
}
