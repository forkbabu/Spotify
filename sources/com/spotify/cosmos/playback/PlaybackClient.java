package com.spotify.cosmos.playback;

import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.playback.model.PositionResponse;
import com.spotify.cosmos.playback.model.SetVolumeRequest;
import com.spotify.cosmos.playback.model.VolumeResponse;
import io.reactivex.a;
import io.reactivex.s;

public interface PlaybackClient {
    s<PositionResponse> position(@Query("position") long j);

    a setVolume(SetVolumeRequest setVolumeRequest);

    s<VolumeResponse> volume();
}
