package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class w implements g {
    public final /* synthetic */ f2 a;

    public /* synthetic */ w(f2 f2Var) {
        this.a = f2Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.s((SessionState) obj);
    }
}
