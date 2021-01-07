package defpackage;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.player.model.PlayerState;
import defpackage.ff2;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: yg2  reason: default package */
public class yg2 {
    private final v1 a;
    private final y b;
    private final g<PlayerState> c;

    public yg2(v1 v1Var, y yVar, g<PlayerState> gVar) {
        this.a = v1Var;
        this.b = yVar;
        this.c = gVar;
    }

    public void a(og0<String, ff2> og0, ff2.a aVar) {
        sr1 sr1 = (sr1) og0;
        sr1.a.d(sr1.b, "com.spotify.play_queue", new xg2(this.a, aVar, this.b, this.c));
    }
}
