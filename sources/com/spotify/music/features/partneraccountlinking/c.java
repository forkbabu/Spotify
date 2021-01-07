package com.spotify.music.features.partneraccountlinking;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ o a;

    public /* synthetic */ c(o oVar) {
        this.a = oVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return o.f(this.a, (PartnerAccountLinkingSessionHelper.State) obj);
    }
}
