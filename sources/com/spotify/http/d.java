package com.spotify.http;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ m a;

    public /* synthetic */ d(m mVar) {
        this.a = mVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((OfflineState) obj);
    }
}
