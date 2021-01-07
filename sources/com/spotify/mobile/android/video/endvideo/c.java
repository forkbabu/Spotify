package com.spotify.mobile.android.video.endvideo;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ l a;

    public /* synthetic */ c(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.Y((Response) obj);
    }
}
