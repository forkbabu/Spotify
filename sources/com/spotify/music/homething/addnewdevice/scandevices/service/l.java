package com.spotify.music.homething.addnewdevice.scandevices.service;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public final /* synthetic */ HomethingActivationService a;

    public /* synthetic */ l(HomethingActivationService homethingActivationService) {
        this.a = homethingActivationService;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Long l = (Long) obj;
        return this.a.n.a("homething").P();
    }
}
