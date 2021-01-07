package com.spotify.mobile.android.offline.coordinator.cosmos;

import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginCommand;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return e.c(this.a, (OfflinePlugin$PluginCommand) obj);
    }
}
