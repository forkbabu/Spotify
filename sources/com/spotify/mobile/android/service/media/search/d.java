package com.spotify.mobile.android.service.media.search;

import io.reactivex.functions.f;
import okhttp3.e;

public final /* synthetic */ class d implements f {
    public final /* synthetic */ e a;

    public /* synthetic */ d(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.cancel();
    }
}
