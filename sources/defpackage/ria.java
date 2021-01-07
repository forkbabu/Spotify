package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.z;

/* renamed from: ria  reason: default package */
public class ria {
    private final ajf<d> a;

    public ria(ajf<d> ajf) {
        this.a = ajf;
    }

    private z<zwd> c(Optional<PlayerState> optional, c cVar, int i) {
        if (!optional.isPresent()) {
            return this.a.get().a(cVar);
        }
        Optional<ContextTrack> track = optional.get().track();
        if (!track.isPresent() || !kxd.i(track.get())) {
            return this.a.get().a(cVar);
        }
        return this.a.get().a(j(optional.get(), i));
    }

    private static c j(PlayerState playerState, int i) {
        return c.g((long) ((int) Math.max(0L, Math.min(playerState.timestamp() + ((long) i), playerState.duration().or((Optional<Long>) 0L).longValue()))));
    }

    public z<zwd> a(Optional<PlayerState> optional) {
        if (!optional.isPresent()) {
            return this.a.get().a(c.e());
        }
        return this.a.get().a(j(optional.get(), 15000));
    }

    public z<zwd> b(Optional<PlayerState> optional) {
        return c(optional, c.i(), 15000);
    }

    public z<zwd> d(Optional<PlayerState> optional) {
        return c(optional, c.k(), -15000);
    }

    public z<zwd> e() {
        return this.a.get().a(c.i());
    }

    public z<zwd> f() {
        return this.a.get().a(c.c());
    }

    public z<zwd> g() {
        return this.a.get().a(c.k());
    }

    public z<zwd> h() {
        return this.a.get().a(c.e());
    }

    public z<zwd> i(Optional<PlayerState> optional) {
        if (!optional.isPresent()) {
            return this.a.get().a(c.e());
        }
        return this.a.get().a(j(optional.get(), -15000));
    }

    public z<zwd> k(Optional<PlayerState> optional) {
        if (!optional.isPresent()) {
            return this.a.get().a(c.e());
        }
        return this.a.get().a(optional.get().isPaused() ? c.e() : c.c());
    }
}
