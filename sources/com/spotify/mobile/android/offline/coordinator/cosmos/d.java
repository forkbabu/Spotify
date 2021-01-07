package com.spotify.mobile.android.offline.coordinator.cosmos;

import com.spotify.mobile.android.offline.coordinator.cosmos.e;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginCommand;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ OfflinePlugin$PluginCommand a;

    public /* synthetic */ d(OfflinePlugin$PluginCommand offlinePlugin$PluginCommand) {
        this.a = offlinePlugin$PluginCommand;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new e.b(this.a, ((Map) obj).values());
    }
}
