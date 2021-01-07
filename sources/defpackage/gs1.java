package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: gs1  reason: default package */
public final class gs1 extends yr1 {
    private Optional<Boolean> f = Optional.absent();
    private b g;
    private final y h;
    private final g<PlayerState> i;
    private final ss1 j;

    public gs1(v1 v1Var, ff2.a aVar, y yVar, g<PlayerState> gVar, ss1 ss1) {
        super(v1Var, aVar);
        this.h = yVar;
        this.i = gVar;
        this.j = ss1;
    }

    private void m(Optional<PlayerState> optional) {
        AppProtocol.Saved saved = new AppProtocol.Saved(optional.orNull());
        Boolean valueOf = Boolean.valueOf(saved.saved);
        if (!this.f.isPresent() || !valueOf.equals(this.f.get())) {
            c(saved);
            this.f = Optional.of(valueOf);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.g = this.i.Q(this.h).subscribe(new ir1(this), new hr1(this));
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
        c(new AppProtocol.Saved(((ts1) this.j).a().orNull()));
    }

    public /* synthetic */ void k(PlayerState playerState) {
        m(Optional.fromNullable(playerState));
    }

    public /* synthetic */ void l(Throwable th) {
        m(Optional.absent());
    }
}
