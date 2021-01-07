package com.spotify.music.homething.addnewdevice.scandevices.service;

import io.reactivex.functions.g;
import java.util.ArrayList;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ HomethingActivationService a;

    public /* synthetic */ f(HomethingActivationService homethingActivationService) {
        this.a = homethingActivationService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.v((ArrayList) obj);
    }
}
