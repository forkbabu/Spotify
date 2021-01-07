package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.q;

/* renamed from: ts1  reason: default package */
public class ts1 implements ss1 {
    private final l a;
    private final q b = new q();
    private Optional<PlayerState> c = Optional.absent();

    public ts1(l lVar) {
        this.a = lVar;
    }

    public Optional<PlayerState> a() {
        return this.c;
    }

    public /* synthetic */ void b(PlayerState playerState) {
        this.c = Optional.of(playerState);
    }

    public /* synthetic */ void c(Throwable th) {
        this.c = Optional.absent();
        Logger.e(th, "Error to observe the player state.", new Object[0]);
    }

    public void d() {
        this.b.a(this.a.d().subscribe(new qs1(this), new rs1(this)));
    }

    public void e() {
        this.b.c();
    }
}
