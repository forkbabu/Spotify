package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Queue;

/* renamed from: bu1  reason: default package */
public class bu1 {
    private final dt1 a;
    private final g<PlayerState> b;
    private final y c;
    private final fu1 d;
    private s3<StreamingCardData> e = pt1.a;
    private b f = EmptyDisposable.INSTANCE;
    private long g = -1;

    public bu1(y yVar, g<PlayerState> gVar, dt1 dt1, fu1 fu1) {
        this.c = yVar;
        this.b = gVar;
        this.a = dt1;
        this.d = fu1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: s3<com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(bu1 bu1, Optional optional) {
        bu1.getClass();
        if (optional.isPresent() && ((long) ((StreamingCardData) optional.get()).hashCode()) != bu1.g) {
            bu1.g = (long) ((StreamingCardData) optional.get()).hashCode();
            bu1.e.accept(optional.get());
        }
    }

    private void d() {
        if (this.f.d()) {
            g<PlayerState> gVar = this.b;
            s G0 = je.Z(gVar, gVar).j0(wt1.a).G0(Optional.absent());
            s<Queue<ContentItem>> d2 = this.a.d();
            fu1 fu1 = this.d;
            fu1.getClass();
            this.f = s.n(G0, d2, new vt1(fu1)).o0(this.c).subscribe(new rt1(this), qt1.a);
        }
    }

    public void b() {
        d();
        this.a.e();
    }

    public void c(s3<StreamingCardData> s3Var) {
        this.e = s3Var;
        d();
    }

    public void e() {
        if (!this.f.d()) {
            this.f.dispose();
        }
        this.g = -1;
    }
}
