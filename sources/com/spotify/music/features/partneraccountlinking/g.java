package com.spotify.music.features.partneraccountlinking;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PartnerAccountLinkingSessionHelper.State state;
        if (!((SessionState) obj).loggedIn()) {
            state = PartnerAccountLinkingSessionHelper.State.NOT_LOGGED_IN;
        } else {
            state = PartnerAccountLinkingSessionHelper.State.LOGGED_IN;
        }
        return s.i0(state);
    }
}
