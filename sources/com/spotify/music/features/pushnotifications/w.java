package com.spotify.music.features.pushnotifications;

import io.reactivex.functions.g;
import java.util.List;

public final /* synthetic */ class w implements g {
    public final /* synthetic */ r0 a;

    public /* synthetic */ w(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        r0.a(this.a, (List) obj);
    }
}
