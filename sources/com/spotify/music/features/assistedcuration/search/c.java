package com.spotify.music.features.assistedcuration.search;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ AssistedCurationSearchActivity a;

    public /* synthetic */ c(AssistedCurationSearchActivity assistedCurationSearchActivity) {
        this.a = assistedCurationSearchActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.W0(((Boolean) obj).booleanValue());
    }
}
