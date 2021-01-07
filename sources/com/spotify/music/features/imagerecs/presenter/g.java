package com.spotify.music.features.imagerecs.presenter;

import io.reactivex.functions.f;
import okhttp3.e;

public final /* synthetic */ class g implements f {
    public final /* synthetic */ e a;

    public /* synthetic */ g(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.cancel();
    }
}
