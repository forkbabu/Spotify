package com.spotify.music.features.partneraccountlinking;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;
import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PartnerAccountLinkingSessionHelper.State) obj) == PartnerAccountLinkingSessionHelper.State.LOGGED_IN;
    }
}
