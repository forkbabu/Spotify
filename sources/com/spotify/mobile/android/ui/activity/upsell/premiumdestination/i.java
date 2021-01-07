package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ u a;

    public /* synthetic */ i(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.u((SessionState) obj);
    }
}
