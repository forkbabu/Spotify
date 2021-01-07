package com.spotify.player.internal;

import com.spotify.player.model.PlayerSession;
import com.spotify.player.model.command.PlaySessionCommand;
import com.spotify.player.model.command.PreparePlayCommand;
import io.reactivex.z;

public interface g {
    z<PlayerSession> a(PreparePlayCommand preparePlayCommand);

    z<zwd> b(String str, PlaySessionCommand playSessionCommand);
}
