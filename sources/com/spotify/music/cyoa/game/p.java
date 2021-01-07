package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.model.CyoaGame;
import com.spotify.music.cyoa.model.CyoaGameStatus;
import com.spotify.music.cyoa.model.CyoaSelectOption;
import io.reactivex.z;

public interface p {
    @zqf("cyoa-hack/v1/games/{gameId}")
    z<CyoaGame> a(@mrf("gameId") int i);

    @irf("cyoa-hack/v1/games/{gameId}/select")
    z<CyoaGameStatus> b(@mrf("gameId") int i, @uqf CyoaSelectOption cyoaSelectOption);

    @irf("cyoa-hack/v1/games/{gameId}/start")
    z<CyoaGameStatus> c(@mrf("gameId") int i);

    @irf("cyoa-hack/v1/games/{gameId}/continue")
    z<CyoaGameStatus> d(@mrf("gameId") int i);
}
