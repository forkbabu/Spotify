package com.spotify.mobile.android.offline.coordinator.cosmos;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginCommand;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginInit;
import com.spotify.mobile.android.offline.coordinator.proto.OfflinePlugin$PluginResponse;
import io.reactivex.a;
import io.reactivex.s;

@CosmosService
public interface f {
    @SUB("sp://offline/v2/plugin")
    s<OfflinePlugin$PluginCommand> a(@Body OfflinePlugin$PluginInit offlinePlugin$PluginInit);

    @POST("sp://offline/v2/plugin")
    a b(@Body OfflinePlugin$PluginResponse offlinePlugin$PluginResponse);
}
