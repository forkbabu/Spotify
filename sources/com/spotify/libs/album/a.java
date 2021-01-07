package com.spotify.libs.album;

import io.reactivex.z;

public interface a {
    @zqf("album/v1/album-app/album/{id}/android")
    z<AlbumRelease> a(@mrf("id") String str);
}
