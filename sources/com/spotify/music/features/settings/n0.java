package com.spotify.music.features.settings;

import com.spotify.music.features.settings.adapter.p2;
import io.reactivex.functions.g;

public final /* synthetic */ class n0 implements g {
    public final /* synthetic */ p2 a;

    public /* synthetic */ n0(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.N0(((Boolean) obj).booleanValue());
    }
}
