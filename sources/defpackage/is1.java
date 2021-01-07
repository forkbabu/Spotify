package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: is1  reason: default package */
public final class is1 extends yr1 {
    public static final /* synthetic */ int k = 0;
    private b f;
    private Optional<Boolean> g = Optional.absent();
    private final y h;
    private final g<PlayerState> i;
    private final ss1 j;

    public is1(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar, ss1 ss1) {
        super(v1Var, aVar);
        this.h = yVar;
        this.i = gVar;
        this.j = ss1;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.f = this.i.Q(this.h).subscribe(new mr1(this), nr1.a);
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
        c(new AppProtocol.Shuffle(((ts1) this.j).a().orNull()));
    }

    public /* synthetic */ void k(PlayerState playerState) {
        AppProtocol.Shuffle shuffle = new AppProtocol.Shuffle(playerState);
        Boolean valueOf = Boolean.valueOf(shuffle.shuffle);
        if (!this.g.isPresent() || !valueOf.equals(this.g.get())) {
            this.g = Optional.of(valueOf);
            c(shuffle);
        }
    }
}
