package com.spotify.music.playlist.extender.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.playlist.extender.model.AutoValue_RecTrack;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecTrack implements JacksonModel {
    private static final String SPOTIFY_TRACK_PREFIX = "spotify:track:";

    public interface a {
        a a(boolean z);

        a b(boolean z);

        RecTrack build();

        a c(boolean z);
    }

    public static a builder() {
        AutoValue_RecTrack.b bVar = new AutoValue_RecTrack.b();
        bVar.a(false);
        AutoValue_RecTrack.b bVar2 = bVar;
        bVar2.c(false);
        AutoValue_RecTrack.b bVar3 = bVar2;
        bVar3.b(false);
        return bVar3;
    }

    @JsonCreator
    public static RecTrack create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("album") Item item, @JsonProperty("artists") List<Item> list, @JsonProperty("duration") int i) {
        AutoValue_RecTrack.b bVar = (AutoValue_RecTrack.b) builder();
        bVar.g(str);
        AutoValue_RecTrack.b bVar2 = bVar;
        bVar2.h(str2);
        AutoValue_RecTrack.b bVar3 = bVar2;
        bVar3.d(item);
        AutoValue_RecTrack.b bVar4 = bVar3;
        bVar4.e(list);
        AutoValue_RecTrack.b bVar5 = bVar4;
        bVar5.f(i);
        return bVar5.build();
    }

    public abstract Item getAlbum();

    public abstract List<Item> getArtists();

    public abstract int getDuration();

    public abstract String getId();

    public abstract String getName();

    @JsonIgnore
    public String getUri() {
        StringBuilder V0 = je.V0(SPOTIFY_TRACK_PREFIX);
        V0.append(getId());
        return V0.toString();
    }

    public abstract boolean isCurrentlyPlayable();

    public abstract boolean isExplicit();

    public abstract boolean isTagged19plus();

    public abstract a toBuilder();
}
