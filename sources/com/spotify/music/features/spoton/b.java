package com.spotify.music.features.spoton;

import com.spotify.mobile.android.service.media.v1;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ m a;

    public /* synthetic */ b(m mVar) {
        this.a = mVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((v1) obj);
    }
}
