package com.spotify.player.queue;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import io.reactivex.g;
import io.reactivex.z;

public interface f {
    g<PlayerQueue> a();

    z<zwd> b(SetQueueCommand setQueueCommand);

    z<zwd> c(ContextTrack contextTrack);
}
