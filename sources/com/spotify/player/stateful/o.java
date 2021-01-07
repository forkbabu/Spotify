package com.spotify.player.stateful;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ StatefulPlayerSimulator a;

    public /* synthetic */ o(StatefulPlayerSimulator statefulPlayerSimulator) {
        this.a = statefulPlayerSimulator;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        StatefulPlayerSimulator.a(this.a, (PlayerState) obj);
    }
}
