package com.spotify.mobile.android.video.cosmos;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        VideoPlayerAdvanceReason videoPlayerAdvanceReason = k.d;
        Logger.e((Throwable) obj, "Error trying to send request to ContextPlayer", new Object[0]);
    }
}
