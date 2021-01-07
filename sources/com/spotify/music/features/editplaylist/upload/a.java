package com.spotify.music.features.editplaylist.upload;

import com.spotify.music.features.editplaylist.upload.proto.RegisterPlaylistImageRequest;
import com.spotify.music.features.editplaylist.upload.proto.RegisterPlaylistImageResponse;
import io.reactivex.z;

public interface a {
    @erf({"content-type: application/protobuf", "accept: application/protobuf"})
    @irf("playlist/v2/playlist/{playlist-id}/register-image")
    z<RegisterPlaylistImageResponse> a(@mrf("playlist-id") String str, @uqf RegisterPlaylistImageRequest registerPlaylistImageRequest);
}
