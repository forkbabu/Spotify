package com.spotify.music.appprotocol.superbird.queue.model;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return QueueAppProtocol$PlayerQueueItem.create((ContextTrack) obj);
    }
}
