package com.spotify.music.appprotocol.superbird.queue.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.player.model.ContextTrack;

public abstract class QueueAppProtocol$PlayerQueueItem implements JacksonModel {
    public static QueueAppProtocol$PlayerQueueItem create(ContextTrack contextTrack) {
        String str;
        String uid = contextTrack.uid();
        String uri = contextTrack.uri();
        String str2 = contextTrack.metadata().get("title");
        if (kxd.i(contextTrack)) {
            str = contextTrack.metadata().get("album_title");
        } else {
            str = contextTrack.metadata().get("artist_name");
        }
        return new AutoValue_QueueAppProtocol_PlayerQueueItem(uid, uri, str2, str, getImageUrl(contextTrack), contextTrack.provider());
    }

    private static String getImageUrl(ContextTrack contextTrack) {
        if (contextTrack.metadata().containsKey("image_xlarge_url")) {
            return contextTrack.metadata().get("image_xlarge_url");
        }
        if (contextTrack.metadata().containsKey("image_large_url")) {
            return contextTrack.metadata().get("image_large_url");
        }
        return contextTrack.metadata().get("image_url");
    }

    @JsonProperty("artist_name")
    public abstract String artistName();

    @JsonProperty("image_uri")
    public abstract String imageUri();

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty(ContextTrack.Metadata.KEY_PROVIDER)
    public abstract String provider();

    @JsonProperty("uid")
    public abstract String uid();

    @JsonProperty("uri")
    public abstract String uri();
}
