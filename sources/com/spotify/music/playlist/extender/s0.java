package com.spotify.music.playlist.extender;

import com.spotify.music.playlist.extender.model.ExtenderRequest;
import com.spotify.music.playlist.extender.model.ExtenderResponse;
import io.reactivex.z;

public interface s0 {
    @irf("playlistextender/v2/extendp")
    z<ExtenderResponse> a(@uqf ExtenderRequest extenderRequest);
}
