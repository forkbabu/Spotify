package com.spotify.music.features.languagepicker.presenter;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ ListSubscriber a;

    public /* synthetic */ e(ListSubscriber listSubscriber) {
        this.a = listSubscriber;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((SessionState) obj);
    }
}
