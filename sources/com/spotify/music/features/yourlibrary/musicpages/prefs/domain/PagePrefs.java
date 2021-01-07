package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.AutoValue_PagePrefs;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(as = PagePrefs.class)
public abstract class PagePrefs implements JacksonModel {

    public static abstract class a {
        public abstract a a(SortOrder sortOrder);

        public abstract PagePrefs b();

        public abstract a c(Map<String, Boolean> map);

        public abstract a d(Map<String, String> map);

        public abstract a e(Long l);

        public abstract a f(String str);
    }

    public static a builder() {
        return new AutoValue_PagePrefs.b();
    }

    public static a builderWithDefault() {
        a builder = builder();
        builder.e(null);
        builder.a(null);
        builder.c(ImmutableMap.of());
        builder.d(ImmutableMap.of());
        return builder;
    }

    @JsonCreator
    public static PagePrefs create(@JsonProperty("uri") String str, @JsonProperty("timestamp") Long l, @JsonProperty("active_sort_order") SortOrder sortOrder, @JsonProperty("filter_states") Map<String, Boolean> map, @JsonProperty("options") Map<String, String> map2) {
        a builder = builder();
        builder.f(str);
        builder.e(l);
        builder.a(sortOrder);
        builder.c(ImmutableMap.copyOf((Map) MoreObjects.firstNonNull(map, ImmutableMap.of())));
        builder.d(ImmutableMap.copyOf((Map) MoreObjects.firstNonNull(map2, ImmutableMap.of())));
        return builder.b();
    }

    @JsonProperty("active_sort_order")
    public abstract SortOrder activeSortOrder();

    @JsonProperty("filter_states")
    public abstract Map<String, Boolean> filterStates();

    @JsonProperty("options")
    public abstract Map<String, String> options();

    @JsonProperty("timestamp")
    public abstract Long timestamp();

    public abstract a toBuilder();

    @JsonProperty("uri")
    public abstract String uri();

    public PagePrefs withActiveSortOrder(SortOrder sortOrder) {
        a builder = toBuilder();
        builder.a(sortOrder);
        return builder.b();
    }

    public PagePrefs withFilterStates(Map<String, Boolean> map) {
        a builder = toBuilder();
        builder.c(map);
        return builder.b();
    }

    public PagePrefs withOptions(Map<String, String> map) {
        a builder = toBuilder();
        builder.d(map);
        return builder.b();
    }

    public PagePrefs withTimestamp(long j) {
        a builder = toBuilder();
        builder.e(Long.valueOf(j));
        return builder.b();
    }
}
