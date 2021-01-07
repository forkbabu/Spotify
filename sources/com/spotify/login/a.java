package com.spotify.login;

import com.spotify.cosmos.session.SessionClient;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ SessionClient a;

    public /* synthetic */ a(SessionClient sessionClient) {
        this.a = sessionClient;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.notifyBootstrapFailed();
    }
}
