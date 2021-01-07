package com.spotify.music.features.languagepicker.presenter;

import io.reactivex.functions.g;
import java.util.List;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ ListSubscriber a;

    public /* synthetic */ a(ListSubscriber listSubscriber) {
        this.a = listSubscriber;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((List) obj);
    }
}
