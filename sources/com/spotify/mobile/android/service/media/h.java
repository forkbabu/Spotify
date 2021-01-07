package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ BrowserParams a;

    public /* synthetic */ h(BrowserParams browserParams) {
        this.a = browserParams;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "error loading data for browser params, %s", this.a);
    }
}
