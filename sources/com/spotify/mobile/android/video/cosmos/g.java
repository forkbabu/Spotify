package com.spotify.mobile.android.video.cosmos;

import com.spotify.mobile.android.util.Assertion;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        VideoPlayerAdvanceReason videoPlayerAdvanceReason = k.d;
        Assertion.i("Request failed", (Throwable) obj);
    }
}
