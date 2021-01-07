package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ x1 a;

    public /* synthetic */ g(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return x1.c(this.a, (BrowserParams) obj);
    }
}
