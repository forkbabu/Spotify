package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Lifetime;
import io.reactivex.functions.f;

public final /* synthetic */ class u implements f {
    public final /* synthetic */ Lifetime a;

    public /* synthetic */ u(Lifetime lifetime) {
        this.a = lifetime;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.destroy();
    }
}
