package com.spotify.music.features.ads;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public final /* synthetic */ p0 a;

    public /* synthetic */ l(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        p0.b(this.a, (Optional) obj);
    }
}
