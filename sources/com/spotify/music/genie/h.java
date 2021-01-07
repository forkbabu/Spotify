package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ q a;

    public /* synthetic */ h(q qVar) {
        this.a = qVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((SessionState) obj);
    }
}
