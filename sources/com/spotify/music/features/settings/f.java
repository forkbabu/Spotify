package com.spotify.music.features.settings;

import com.spotify.music.features.settings.adapter.p2;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ p2 a;

    public /* synthetic */ f(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.U0(((Boolean) obj).booleanValue());
    }
}
