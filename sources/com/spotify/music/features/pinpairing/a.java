package com.spotify.music.features.pinpairing;

import io.reactivex.functions.g;
import java.net.HttpCookie;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ PinPairingFragment a;

    public /* synthetic */ a(PinPairingFragment pinPairingFragment) {
        this.a = pinPairingFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k5((HttpCookie) obj);
    }
}
