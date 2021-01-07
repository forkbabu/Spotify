package com.spotify.music.features.blendtastematch.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Join implements JacksonModel {
    private final String playlistUri;

    public Join(@JsonProperty("playlist_uri") String str) {
        this.playlistUri = str;
    }

    public static /* synthetic */ Join copy$default(Join join, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = join.playlistUri;
        }
        return join.copy(str);
    }

    public final String component1() {
        return this.playlistUri;
    }

    public final Join copy(@JsonProperty("playlist_uri") String str) {
        return new Join(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Join) && h.a(this.playlistUri, ((Join) obj).playlistUri);
        }
        return true;
    }

    public final String getPlaylistUri() {
        return this.playlistUri;
    }

    public int hashCode() {
        String str = this.playlistUri;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("Join(playlistUri="), this.playlistUri, ")");
    }
}
