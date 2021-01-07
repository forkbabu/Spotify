package com.spotify.music.features.pushnotifications;

import io.reactivex.functions.n;
import java.util.ArrayList;

public final /* synthetic */ class g implements n {
    public final /* synthetic */ k0 a;

    public /* synthetic */ g(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((ArrayList) this.a.d()).contains(((n0) obj).a());
    }
}
