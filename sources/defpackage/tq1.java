package defpackage;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: tq1  reason: default package */
public class tq1 {
    private final v1 a;
    private final y b;
    private final g<PlayerState> c;

    public tq1(v1 v1Var, y yVar, g<PlayerState> gVar) {
        this.a = v1Var;
        this.b = yVar;
        this.c = gVar;
    }

    public s<u3<PlayerState, f>> a() {
        return new v(g.i(this.c, this.a.a0(), sq1.a)).o0(this.b);
    }
}
