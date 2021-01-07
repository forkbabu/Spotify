package com.spotify.player.sub;

import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;

public interface l {
    g<PlayerState> a(int i, int i2);

    g<PlayerState> d();

    s<PlayerError> error();
}
