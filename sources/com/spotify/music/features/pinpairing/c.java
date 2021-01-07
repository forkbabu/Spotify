package com.spotify.music.features.pinpairing;

import io.reactivex.functions.g;
import java.net.HttpCookie;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ PinPairingFragment a;

    public /* synthetic */ c(PinPairingFragment pinPairingFragment) {
        this.a = pinPairingFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        HttpCookie httpCookie = (HttpCookie) obj;
        this.a.y0.setCookie(httpCookie.getDomain(), httpCookie.toString());
    }
}
