package com.spotify.music.features.radio.common;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ AbstractContentFragment a;

    public /* synthetic */ a(AbstractContentFragment abstractContentFragment) {
        this.a = abstractContentFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AbstractContentFragment abstractContentFragment = this.a;
        SessionState sessionState = (SessionState) obj;
        if (abstractContentFragment.T4(sessionState)) {
            abstractContentFragment.Y4(sessionState);
        } else {
            abstractContentFragment.X4(sessionState);
        }
    }
}
