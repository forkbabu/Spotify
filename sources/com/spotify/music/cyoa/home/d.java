package com.spotify.music.cyoa.home;

import com.spotify.music.cyoa.model.CyoaGamesResponse;
import io.reactivex.z;

public interface d {
    @zqf("cyoa-hack/v1/games")
    z<CyoaGamesResponse> a();
}
