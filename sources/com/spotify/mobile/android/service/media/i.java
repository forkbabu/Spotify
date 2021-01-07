package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ qh1 a;
    public final /* synthetic */ BrowserParams b;

    public /* synthetic */ i(qh1 qh1, BrowserParams browserParams) {
        this.a = qh1;
        this.b = browserParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        qh1 qh1 = this.a;
        BrowserParams browserParams = this.b;
        Map<String, String> map = (Map) obj;
        Logger.l("Delegating the loading to %s, productState %s", qh1, map);
        return qh1.a(browserParams, map);
    }
}
