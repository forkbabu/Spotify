package com.spotify.mobile.android.service.media;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.s;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ BrowserParams a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ f(BrowserParams browserParams, Boolean bool, Bundle bundle) {
        this.a = browserParams;
        this.b = bool;
        this.c = bundle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        BrowserParams browserParams = this.a;
        Boolean bool = this.b;
        Bundle bundle = this.c;
        Boolean bool2 = (Boolean) obj;
        boolean z = true;
        Logger.l("Decorate loading parameters with online ? %s", bool2);
        if (bundle == null || !bundle.containsKey("com.spotify.music.extra.SUGGESTED_TYPE")) {
            z = false;
        }
        if (z) {
            BrowserParams.a r = browserParams.r();
            r.b(s.b(bundle));
            browserParams = r.build();
        }
        BrowserParams.a r2 = browserParams.r();
        r2.h(bool2.booleanValue());
        r2.e(bool.booleanValue());
        return r2.build();
    }
}
