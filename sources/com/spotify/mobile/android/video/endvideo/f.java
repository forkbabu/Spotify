package com.spotify.mobile.android.video.endvideo;

import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ l a;

    public /* synthetic */ f(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.U((PendingMessageResponse) obj);
    }
}
