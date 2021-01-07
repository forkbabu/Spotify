package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ p a;
    public final /* synthetic */ p.a b;

    public /* synthetic */ c(p pVar, p.a aVar) {
        this.a = pVar;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, (Offer) obj);
    }
}
