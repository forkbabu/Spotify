package com.spotify.player.sub;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class g implements l {
    private final l a;
    private final Map<u3<Integer, Integer>, io.reactivex.g<PlayerState>> b = new ConcurrentHashMap();
    private final s<PlayerError> c;

    public g(l lVar) {
        this.a = lVar;
        this.c = ((nec) lVar).error().z0();
    }

    @Override // com.spotify.player.sub.l
    public io.reactivex.g<PlayerState> a(int i, int i2) {
        return (io.reactivex.g) Optional.fromNullable(this.b.get(new u3(Integer.valueOf(i), Integer.valueOf(i2)))).or((Supplier<? extends Object>) new b(this, i, i2));
    }

    public io.reactivex.g b(int i, int i2) {
        io.reactivex.g<PlayerState> r0 = this.a.a(i, i2).V(1).r0();
        this.b.put(new u3<>(Integer.valueOf(i), Integer.valueOf(i2)), r0);
        return r0;
    }

    @Override // com.spotify.player.sub.l
    public io.reactivex.g<PlayerState> d() {
        return a(2, 2);
    }

    @Override // com.spotify.player.sub.l
    public s<PlayerError> error() {
        return this.c;
    }
}
