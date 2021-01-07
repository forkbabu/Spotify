package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class c {
    @JsonCreator
    public static c create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("explicit") boolean z, @JsonProperty("playable") boolean z2, @JsonProperty("artists") List<AlbumArtist> list, @JsonProperty("duration") long j) {
        return new d(str, str2, z, z2, gf0.a(list), j);
    }

    @JsonGetter("artists")
    public abstract List<AlbumArtist> a();

    @JsonGetter("duration")
    public abstract long b();

    @JsonGetter("name")
    public abstract String c();

    @JsonGetter("uri")
    public abstract String d();

    @JsonGetter("explicit")
    public abstract boolean e();

    @JsonGetter("playable")
    public abstract boolean f();
}
