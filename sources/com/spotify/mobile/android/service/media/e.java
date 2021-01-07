package com.spotify.mobile.android.service.media;

import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ x1 a;
    public final /* synthetic */ BrowserParams b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ e(x1 x1Var, BrowserParams browserParams, Bundle bundle) {
        this.a = x1Var;
        this.b = browserParams;
        this.c = bundle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, (Boolean) obj);
    }
}
