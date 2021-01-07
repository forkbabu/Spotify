package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.functions.l;

public final /* synthetic */ class o0 implements l {
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i) {
        this.a = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = this.a;
        PlayerQueue playerQueue = (PlayerQueue) obj;
        if (i == 0) {
            return playerQueue.track();
        }
        if (i < 0) {
            ImmutableList<ContextTrack> prevTracks = playerQueue.prevTracks();
            if (prevTracks.size() + i < 0) {
                return Optional.absent();
            }
            return Optional.of(prevTracks.get(prevTracks.size() + i));
        }
        ImmutableList<ContextTrack> nextTracks = playerQueue.nextTracks();
        if (nextTracks.size() < i) {
            return Optional.absent();
        }
        return Optional.of(nextTracks.get(i - 1));
    }
}
