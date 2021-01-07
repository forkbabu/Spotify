package com.spotify.music.features.playlistentity;

import com.spotify.playlist.ondemand.proto.PlaylistUriResolverResponse;
import io.reactivex.z;

public interface q {
    @zqf("playlist/v2/resolve-uri/{uri}")
    z<PlaylistUriResolverResponse> a(@mrf("uri") String str);
}
