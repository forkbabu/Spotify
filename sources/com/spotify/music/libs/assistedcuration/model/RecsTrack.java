package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecsTrack implements JacksonModel {
    private static final String CONTENT_RATING_19_PLUS_ONLY = "MOGEF-19+";

    @JsonCreator
    public static RecsTrack create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("preview_id") String str3, @JsonProperty("album") RecsItem recsItem, @JsonProperty("artists") List<RecsItem> list, @JsonProperty("explicit") boolean z, @JsonProperty("content_rating") List<RecsContentRating> list2) {
        String imageUrl = recsItem != null ? recsItem.imageUrl() : "";
        boolean z2 = false;
        for (RecsContentRating recsContentRating : list2) {
            if (recsContentRating.tags().contains(CONTENT_RATING_19_PLUS_ONLY)) {
                z2 = true;
            }
        }
        return new AutoValue_RecsTrack(str, str2, (String) MoreObjects.firstNonNull(str3, ""), imageUrl, recsItem, list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of(), z && !z2, z2);
    }

    public abstract RecsItem album();

    public String albumName() {
        RecsItem album = album();
        if (album != null) {
            return album.name();
        }
        return null;
    }

    public String artistName() {
        if (artists().isEmpty()) {
            return "";
        }
        return artists().get(0).name();
    }

    public List<String> artistNames() {
        return ImmutableList.copyOf(Collections2.transform((Iterable) artists(), (Function) c.a));
    }

    public abstract List<RecsItem> artists();

    public String image() {
        RecsItem album = album();
        if (album == null) {
            return "";
        }
        return (String) MoreObjects.firstNonNull(album.largeImageUrl(), MoreObjects.firstNonNull(album.imageUrl(), ""));
    }

    public abstract String imageUri();

    public abstract boolean is19PlusOnly();

    public abstract boolean isExplicit();

    public abstract String name();

    public abstract String previewId();

    public abstract String uri();
}
