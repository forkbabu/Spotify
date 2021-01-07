package com.spotify.music.homething.addnewdevice.scandevices.service;

import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ HomethingActivationService a;

    public /* synthetic */ e(HomethingActivationService homethingActivationService) {
        this.a = homethingActivationService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.w((Long) obj);
    }
}
