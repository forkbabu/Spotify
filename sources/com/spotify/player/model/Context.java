package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.player.model.AutoValue_Context;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class Context {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return Context.builder("");
        }

        public abstract Context build();

        public abstract Builder metadata(ImmutableMap<String, String> immutableMap);

        @JsonProperty("metadata")
        public Builder metadata(Map<String, String> map) {
            return metadata(ImmutableMap.copyOf(map));
        }

        public abstract Builder pages(ImmutableList<ContextPage> immutableList);

        @JsonProperty("pages")
        public Builder pages(List<ContextPage> list) {
            return pages(ImmutableList.copyOf((Collection) list));
        }

        @JsonProperty("restrictions")
        public abstract Builder restrictions(Restrictions restrictions);

        @JsonProperty("uri")
        @JsonAlias({ContextTrack.Metadata.KEY_ENTITY_URI})
        public abstract Builder uri(String str);

        @JsonProperty("url")
        public abstract Builder url(String str);
    }

    public static final class Metadata {
        public static final String KEY_AUTOPLAY_CANDIDATE = "autoplay_candidate";
        public static final String KEY_CONTEXT_DESCRIPTION = "context_description";
        public static final String KEY_CONTEXT_LONG_DESCRIPTION = "context_long_description";
        public static final String KEY_CONTEXT_OWNER = "context_owner";
        public static final String KEY_FILTERING_PREDICATE = "filtering.predicate";
        public static final String KEY_FORMAT_LIST_TYPE = "format_list_type";
        public static final String KEY_IMAGE_LARGE_URL = "image_large_url";
        public static final String KEY_IMAGE_SMALL_URL = "image_small_url";
        public static final String KEY_IMAGE_URL = "image_url";
        public static final String KEY_IMAGE_XLARGE_URL = "image_xlarge_url";
        public static final String KEY_IS_DATA_SAVER_CONTEXT = "is_data_saver_context";
        public static final String KEY_IS_STRIPPED = "is_stripped";
        public static final String KEY_LICENSE = "license";
        public static final String KEY_REPORTING_URI = "reporting.uri";
        public static final String KEY_SHUFFLE_ALGORITHM = "shuffle.algorithm";
        public static final String KEY_SORTING_CRITERIA = "sorting.criteria";
        public static final String KEY_TRANSFORMING_FAILED = "transforming.failed";
        public static final String KEY_TRANSFORMING_ONGOING = "transforming.ongoing";
        public static final String KEY_TRANSFORMING_SHUFFLE = "transforming.shuffle";
        public static final String KEY_TRANSFORMING_STATUS = "transforming.status";
        public static final String KEY_TRANSFORMING_TIMEOUT = "transforming.timeout";
        public static final String KEY_TRANSFORMING_URL = "transforming.url";
        public static final String KEY_TRANSFORMING_WAIT = "transforming.wait";
        public static final String LICENSE_ON_DEMAND_WHEN_FREE = "mod";
        public static final String SHUFFLE_ALGORITHM_HISTORY = "history";
        public static final String SHUFFLE_ALGORITHM_HISTORY_ONLY = "history_only";
        public static final String SHUFFLE_ALGORITHM_NONE = "none";
        public static final String SHUFFLE_ALGORITHM_STABLE = "stable";
        public static final String SHUFFLE_ALGORITHM_WEIGHTED = "weighted";
    }

    public static Builder builder(String str) {
        return new AutoValue_Context.Builder().uri(str).url("").metadata(Collections.emptyMap());
    }

    public static Context fromTrackUris(String str, ImmutableList<String> immutableList) {
        ArrayList arrayList = new ArrayList();
        UnmodifiableListIterator<String> listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(ContextTrack.create(listIterator.next()));
        }
        return builder(str).pages(ImmutableList.of(ContextPage.builder().tracks(arrayList).build())).build();
    }

    public static Context fromUri(String str) {
        Builder builder = builder(str);
        return builder.url("context://" + str).build();
    }

    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonProperty("pages")
    public abstract Optional<ImmutableList<ContextPage>> pages();

    @JsonProperty("restrictions")
    public abstract Optional<Restrictions> restrictions();

    public abstract Builder toBuilder();

    @JsonProperty("uri")
    public abstract String uri();

    @JsonProperty("url")
    public abstract String url();
}
