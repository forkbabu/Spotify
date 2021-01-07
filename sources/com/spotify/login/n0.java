package com.spotify.login;

import com.spotify.cosmos.session.SessionClient;
import io.reactivex.functions.l;

public final /* synthetic */ class n0 implements l {
    public final /* synthetic */ SessionClient a;

    public /* synthetic */ n0(SessionClient sessionClient) {
        this.a = sessionClient;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.notifyBootstrapCompleted((byte[]) obj);
    }
}
