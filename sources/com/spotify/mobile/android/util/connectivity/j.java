package com.spotify.mobile.android.util.connectivity;

import io.reactivex.t;

public final /* synthetic */ class j implements a0 {
    public final /* synthetic */ t a;

    public /* synthetic */ j(t tVar) {
        this.a = tVar;
    }

    @Override // com.spotify.mobile.android.util.connectivity.a0
    public final void a(ConnectionType connectionType, boolean z) {
        t tVar = this.a;
        if (!tVar.d()) {
            tVar.onNext(connectionType);
        }
    }
}
