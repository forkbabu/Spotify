package com.spotify.music.features.languagepicker.presenter;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ ListSubscriber a;

    public /* synthetic */ d(ListSubscriber listSubscriber) {
        this.a = listSubscriber;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ListSubscriber.d(this.a, (Throwable) obj);
    }
}
