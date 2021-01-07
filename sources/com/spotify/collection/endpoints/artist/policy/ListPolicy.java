package com.spotify.collection.endpoints.artist.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;
import kotlin.jvm.internal.h;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ListPolicy implements JacksonModel {
    private final Map<String, Boolean> album;
    private final Map<String, Boolean> artist;
    private final Map<String, Boolean> artists;
    @JsonAnySetter
    private final Map<String, Boolean> attributes;

    public ListPolicy(Map<String, Boolean> map, @JsonProperty("album") Map<String, Boolean> map2, @JsonProperty("artist") Map<String, Boolean> map3, @JsonProperty("artists") Map<String, Boolean> map4) {
        this.attributes = map;
        this.album = map2;
        this.artist = map3;
        this.artists = map4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.collection.endpoints.artist.policy.ListPolicy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListPolicy copy$default(ListPolicy listPolicy, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = listPolicy.attributes;
        }
        if ((i & 2) != 0) {
            map2 = listPolicy.album;
        }
        if ((i & 4) != 0) {
            map3 = listPolicy.artist;
        }
        if ((i & 8) != 0) {
            map4 = listPolicy.artists;
        }
        return listPolicy.copy(map, map2, map3, map4);
    }

    public final Map<String, Boolean> component1() {
        return this.attributes;
    }

    public final Map<String, Boolean> component2() {
        return this.album;
    }

    public final Map<String, Boolean> component3() {
        return this.artist;
    }

    public final Map<String, Boolean> component4() {
        return this.artists;
    }

    public final ListPolicy copy(Map<String, Boolean> map, @JsonProperty("album") Map<String, Boolean> map2, @JsonProperty("artist") Map<String, Boolean> map3, @JsonProperty("artists") Map<String, Boolean> map4) {
        return new ListPolicy(map, map2, map3, map4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPolicy)) {
            return false;
        }
        ListPolicy listPolicy = (ListPolicy) obj;
        return h.a(this.attributes, listPolicy.attributes) && h.a(this.album, listPolicy.album) && h.a(this.artist, listPolicy.artist) && h.a(this.artists, listPolicy.artists);
    }

    public final Map<String, Boolean> getAlbum() {
        return this.album;
    }

    public final Map<String, Boolean> getArtist() {
        return this.artist;
    }

    public final Map<String, Boolean> getArtists() {
        return this.artists;
    }

    @JsonAnyGetter
    public final Map<String, Boolean> getAttributes() {
        return this.attributes;
    }

    public int hashCode() {
        Map<String, Boolean> map = this.attributes;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Boolean> map2 = this.album;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Boolean> map3 = this.artist;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, Boolean> map4 = this.artists;
        if (map4 != null) {
            i = map4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ListPolicy(attributes=");
        V0.append(this.attributes);
        V0.append(", album=");
        V0.append(this.album);
        V0.append(", artist=");
        V0.append(this.artist);
        V0.append(", artists=");
        return je.M0(V0, this.artists, ")");
    }
}
