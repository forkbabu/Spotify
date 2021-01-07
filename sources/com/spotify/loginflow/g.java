package com.spotify.loginflow;

import com.spotify.cosmos.session.SessionClient;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ SessionClient a;

    public /* synthetic */ g(SessionClient sessionClient) {
        this.a = sessionClient;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.notifyBootstrapCompleted((byte[]) obj);
    }
}
