package com.spotify.player.play;

import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.PreparePlayCommand;
import io.reactivex.z;

public interface f {
    z<zwd> a(PlayCommand playCommand);

    z<g> b(PreparePlayCommand preparePlayCommand);
}
