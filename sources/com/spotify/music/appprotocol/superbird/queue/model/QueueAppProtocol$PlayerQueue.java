package com.spotify.music.appprotocol.superbird.queue.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.player.model.ContextTrack;
import java.util.List;

public abstract class QueueAppProtocol$PlayerQueue implements JacksonModel {
    public static QueueAppProtocol$PlayerQueue create(List<ContextTrack> list, Optional<ContextTrack> optional, List<ContextTrack> list2) {
        a aVar = a.a;
        return new AutoValue_QueueAppProtocol_PlayerQueue(Collections2.transform((List) list2, (Function) aVar), optional.transform(aVar).orNull(), Collections2.transform((List) list, (Function) aVar));
    }

    @JsonProperty("current")
    public abstract QueueAppProtocol$PlayerQueueItem currentTrack();

    @JsonProperty("next")
    public abstract List<QueueAppProtocol$PlayerQueueItem> nextTracks();

    @JsonProperty("previous")
    public abstract List<QueueAppProtocol$PlayerQueueItem> previousTracks();
}
