package com.spotify.music.libs.mediabrowserservice;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ n1 a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ g(n1 n1Var, v1 v1Var) {
        this.a = n1Var;
        this.b = v1Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (SessionState) obj);
    }
}
