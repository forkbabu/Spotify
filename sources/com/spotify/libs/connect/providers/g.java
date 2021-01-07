package com.spotify.libs.connect.providers;

import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((OfflineState) obj).offline());
    }
}
