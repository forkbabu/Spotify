package defpackage;

import android.support.v4.media.RatingCompat;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.media.b2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.paste.widgets.b;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: zx8  reason: default package */
public class zx8 {
    private final g<PlayerState> a;
    private final y b;
    private final pea c;
    private final b2 d;
    private final p e = new p();

    zx8(g<PlayerState> gVar, y yVar, pea pea, v1 v1Var) {
        this.a = gVar;
        this.b = yVar;
        this.c = pea;
        this.d = v1Var.n2();
    }

    public e a(RatingCompat ratingCompat, PlayerState playerState) {
        String contextUri = playerState.contextUri();
        String e2 = b.e(playerState);
        if (MoreObjects.isNullOrEmpty(e2) || MoreObjects.isNullOrEmpty(contextUri)) {
            return io.reactivex.internal.operators.completable.b.a;
        }
        if (ratingCompat.c()) {
            return this.d.a(e2, contextUri);
        }
        return this.d.c(e2);
    }

    public void b(RatingCompat ratingCompat, yda yda) {
        if (ratingCompat.b()) {
            p pVar = this.e;
            z<String> j = this.c.j(yda, ratingCompat.c());
            j.getClass();
            pVar.b(new i(j).e(this.a.h0(1).Q(this.b)).H(new yw8(this, ratingCompat)).subscribe());
        }
    }
}
