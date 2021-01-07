package com.spotify.music.features.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

public final /* synthetic */ class s implements c {
    public static final /* synthetic */ s a = new s();

    private /* synthetic */ s() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return new u3((PlayerQueue) obj, (PlayerState) obj2);
    }
}
