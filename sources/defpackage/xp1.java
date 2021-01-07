package defpackage;

import com.spotify.music.features.ads.screensaver.n0;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: xp1  reason: default package */
public class xp1 {
    private final g<PlayerState> a;
    private final n0 b;
    private final p c = new p();

    public xp1(g<PlayerState> gVar, n0 n0Var) {
        this.a = gVar;
        this.b = n0Var;
    }

    public /* synthetic */ void a(Boolean bool) {
        this.b.r(!bool.booleanValue());
    }

    public void b() {
        this.c.b(this.a.O(wp1.a).f0(up1.a).s().subscribe(new vp1(this)));
    }

    public void c() {
        this.c.a();
    }
}
