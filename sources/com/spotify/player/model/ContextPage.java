package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.AutoValue_ContextPage;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class ContextPage {
    public static final ContextPage EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return ContextPage.builder();
        }

        public abstract ContextPage build();

        @JsonProperty("metadata")
        public abstract Builder metadata(Map<String, String> map);

        @JsonProperty("next_page_url")
        public abstract Builder nextPageUrl(String str);

        @JsonProperty("page_url")
        public abstract Builder pageUrl(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder tracks(ImmutableList<ContextTrack> immutableList);

        @JsonProperty("tracks")
        public Builder tracks(List<ContextTrack> list) {
            return tracks(ImmutableList.copyOf((Collection) list));
        }
    }

    public static Builder builder() {
        return new AutoValue_ContextPage.Builder().pageUrl("").nextPageUrl("").metadata(Collections.emptyMap());
    }

    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonProperty("next_page_url")
    public abstract String nextPageUrl();

    @JsonProperty("page_url")
    public abstract String pageUrl();

    public abstract Builder toBuilder();

    @JsonProperty("tracks")
    public abstract Optional<ImmutableList<ContextTrack>> tracks();
}
