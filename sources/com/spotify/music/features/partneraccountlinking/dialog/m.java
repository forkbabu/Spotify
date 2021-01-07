package com.spotify.music.features.partneraccountlinking.dialog;

import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ p a;

    public /* synthetic */ m(p pVar) {
        this.a = pVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(((Boolean) obj).booleanValue());
    }
}
