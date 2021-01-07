package com.spotify.music.connection;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.a0;
import io.reactivex.t;

public final /* synthetic */ class c implements a0 {
    public final /* synthetic */ t a;

    public /* synthetic */ c(t tVar) {
        this.a = tVar;
    }

    @Override // com.spotify.mobile.android.util.connectivity.a0
    public final void a(ConnectionType connectionType, boolean z) {
        t tVar = this.a;
        if (!tVar.d()) {
            tVar.onNext(Boolean.valueOf(connectionType != ConnectionType.CONNECTION_TYPE_NONE));
        }
    }
}
