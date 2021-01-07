package com.spotify.music.homecomponents.singleitem.card;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

final class d<T> implements g<Throwable> {
    final /* synthetic */ HomeSingleFocusCardViewBinder a;

    d(HomeSingleFocusCardViewBinder homeSingleFocusCardViewBinder) {
        this.a = homeSingleFocusCardViewBinder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Assertion.w("PlayerState error, hiding play button", th);
        this.a.h();
    }
}
