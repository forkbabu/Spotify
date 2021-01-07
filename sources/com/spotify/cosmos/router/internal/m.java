package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.router.Lifetime;
import io.reactivex.functions.f;

public final /* synthetic */ class m implements f {
    public final /* synthetic */ Lifetime a;

    public /* synthetic */ m(Lifetime lifetime) {
        this.a = lifetime;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.destroy();
    }
}
