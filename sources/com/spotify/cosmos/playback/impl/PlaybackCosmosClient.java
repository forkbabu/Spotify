package com.spotify.cosmos.playback.impl;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.playback.PlaybackClient;
import com.spotify.cosmos.playback.model.PositionResponse;
import com.spotify.cosmos.playback.model.SetVolumeRequest;
import com.spotify.cosmos.playback.model.VolumeResponse;
import io.reactivex.a;
import io.reactivex.s;

@CosmosService
public interface PlaybackCosmosClient extends PlaybackClient {
    @Override // com.spotify.cosmos.playback.PlaybackClient
    @SUB("sp://playback/v1/position")
    s<PositionResponse> position(@Query("position") long j);

    @Override // com.spotify.cosmos.playback.PlaybackClient
    @PUT("sp://playback/v1/volume")
    a setVolume(@Body SetVolumeRequest setVolumeRequest);

    @Override // com.spotify.cosmos.playback.PlaybackClient
    @SUB("sp://playback/v1/volume")
    s<VolumeResponse> volume();
}
