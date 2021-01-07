package com.spotify.music.libs.connect;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((GaiaDevice) obj);
    }
}
