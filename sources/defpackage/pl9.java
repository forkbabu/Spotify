package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.freetiercommon.models.RemainingSkips;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.player.model.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: pl9  reason: default package */
public class pl9 extends m {
    private final ll9 a;
    private final nl9 b;
    private final tl9 c;
    private final rl9 f;
    private final jl9 n;
    private final y o;
    private final ImpressionLogger p;
    private final boolean q;
    private b r = EmptyDisposable.INSTANCE;

    public pl9(ll9 ll9, nl9 nl9, tl9 tl9, rl9 rl9, jl9 jl9, y yVar, ImpressionLogger impressionLogger, k kVar, fm9 fm9, c cVar) {
        this.a = ll9;
        this.b = nl9;
        this.c = tl9;
        this.f = rl9;
        this.n = jl9;
        this.p = impressionLogger;
        this.o = yVar;
        this.q = fm9.a(cVar);
        kVar.y0(this);
    }

    public ll9 E2() {
        return this.a;
    }

    public /* synthetic */ tpf F2(RemainingSkips remainingSkips) {
        return this.f.a();
    }

    public /* synthetic */ void G2(PlayerState playerState) {
        this.n.c(playerState.contextUri());
        this.p.a(null, "free-tier-pre-curation-dialog", -1, ImpressionLogger.ImpressionType.DIALOG, ImpressionLogger.RenderType.DIALOG);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStart() {
        if (this.r.d() && this.q) {
            ll9 ll9 = this.a;
            ll9.getClass();
            this.r = g.p(new zk9(ll9), BackpressureStrategy.BUFFER).l(this.b).F(new dl9(this)).l(this.c).Q(this.o).subscribe(new fl9(this), el9.a);
        }
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.r.dispose();
    }
}
