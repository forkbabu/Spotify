package com.spotify.player.stateful;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import io.reactivex.z;

public class s implements d {
    private final d a;
    private final StatefulPlayerSimulator b;

    public s(d dVar, StatefulPlayerSimulator statefulPlayerSimulator) {
        this.a = dVar;
        this.b = statefulPlayerSimulator;
    }

    @Override // com.spotify.player.options.d
    public z<zwd> a(boolean z) {
        this.b.i(z);
        return this.a.a(z);
    }

    @Override // com.spotify.player.options.d
    public z<zwd> setRepeatMode(RepeatMode repeatMode) {
        this.b.h(repeatMode);
        return this.a.setRepeatMode(repeatMode);
    }
}
