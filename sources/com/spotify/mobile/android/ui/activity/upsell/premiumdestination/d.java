package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ p.a a;

    public /* synthetic */ d(p.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.b("An error occurred trying to get the offer");
    }
}
