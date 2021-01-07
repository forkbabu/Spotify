package com.spotify.music.features.login.startview;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ u a;

    public /* synthetic */ k(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((Optional) obj);
    }
}
