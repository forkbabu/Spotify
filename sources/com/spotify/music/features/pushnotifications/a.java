package com.spotify.music.features.pushnotifications;

import io.reactivex.functions.n;
import java.util.ArrayList;

public final /* synthetic */ class a implements n {
    public final /* synthetic */ i0 a;

    public /* synthetic */ a(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((ArrayList) this.a.d()).contains(((n0) obj).a());
    }
}
