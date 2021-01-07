package com.spotify.music.libs.partnerapps.api;

import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return d.d(this.a, (PartnerIntegrationsResponse) obj);
    }
}
