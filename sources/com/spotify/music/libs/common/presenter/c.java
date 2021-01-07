package com.spotify.music.libs.common.presenter;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ c(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h((SessionState) obj);
    }
}
