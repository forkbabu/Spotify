package com.spotify.music.features.hiddencontent.presenter;

import com.spotify.music.features.hiddencontent.model.BansResponse;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ HiddenContentFragmentPresenter a;

    public /* synthetic */ b(HiddenContentFragmentPresenter hiddenContentFragmentPresenter) {
        this.a = hiddenContentFragmentPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((BansResponse) obj);
    }
}
