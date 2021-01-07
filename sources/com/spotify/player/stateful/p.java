package com.spotify.player.stateful;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.StatefulPlayerSimulator;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ StatefulPlayerSimulator a;
    public final /* synthetic */ PlayerState b;
    public final /* synthetic */ StatefulPlayerSimulator.StateOrigin c;

    public /* synthetic */ p(StatefulPlayerSimulator statefulPlayerSimulator, PlayerState playerState, StatefulPlayerSimulator.StateOrigin stateOrigin) {
        this.a = statefulPlayerSimulator;
        this.b = playerState;
        this.c = stateOrigin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c);
    }
}
