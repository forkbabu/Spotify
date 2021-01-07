package com.spotify.mobile.android.video.endvideo;

import io.reactivex.functions.a;

public final /* synthetic */ class h implements a {
    public final /* synthetic */ PendingEndVideoEvent a;

    public /* synthetic */ h(PendingEndVideoEvent pendingEndVideoEvent) {
        this.a = pendingEndVideoEvent;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e();
    }
}
