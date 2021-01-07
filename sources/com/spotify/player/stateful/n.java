package com.spotify.player.stateful;

import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public final /* synthetic */ StatefulPlayerSimulator a;

    public /* synthetic */ n(StatefulPlayerSimulator statefulPlayerSimulator) {
        this.a = statefulPlayerSimulator;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((vpf) obj);
    }
}
