package com.spotify.player.sub;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import defpackage.pxd;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.s;
import java.util.Locale;

public class h implements l {
    private final RxRouter a;
    private final pxd b;

    public h(RxRouter rxRouter, pxd pxd) {
        this.a = rxRouter;
        this.b = pxd;
    }

    private <T> Optional<T> e(Response response, Class<T> cls) {
        pxd.a<T> a2 = this.b.a(response.getBody(), cls);
        if (a2 instanceof pxd.a.b) {
            return Optional.of(((pxd.a.b) a2).a());
        }
        return Optional.absent();
    }

    @Override // com.spotify.player.sub.l
    public g<PlayerState> a(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            return this.a.resolve(new Request(Request.SUB, String.format(Locale.US, "sp://player/v2/main?reverse_cap=%d&future_cap=%d", Integer.valueOf(i), Integer.valueOf(i2)))).j0(new c(this)).Q(a.a).j0(f.a).Y0(BackpressureStrategy.LATEST);
        }
        throw new IllegalArgumentException("Cap under zero");
    }

    public /* synthetic */ Optional b(Response response) {
        return e(response, PlayerState.class);
    }

    public /* synthetic */ Optional c(Response response) {
        return e(response, PlayerError.class);
    }

    @Override // com.spotify.player.sub.l
    public g<PlayerState> d() {
        return a(2, 2);
    }

    @Override // com.spotify.player.sub.l
    public s<PlayerError> error() {
        return this.a.resolve(new Request(Request.SUB, "sp://player/v2/main/error")).j0(new d(this)).Q(a.a).j0(e.a);
    }
}
