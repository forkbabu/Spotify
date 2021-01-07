package com.spotify.mobile.android.video.endvideo;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ l a;
    public final /* synthetic */ PendingEndVideoEvent b;

    public /* synthetic */ d(l lVar, PendingEndVideoEvent pendingEndVideoEvent) {
        this.a = lVar;
        this.b = pendingEndVideoEvent;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.W(this.b, (Response) obj);
    }
}
