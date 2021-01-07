package com.spotify.libs.connect;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ p a;

    public /* synthetic */ d(p pVar) {
        this.a = pVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((GaiaDevice) obj);
    }
}
