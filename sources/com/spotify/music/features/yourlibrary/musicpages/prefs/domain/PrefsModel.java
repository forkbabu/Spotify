package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.AutoValue_PrefsModel;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(as = PrefsModel.class)
public abstract class PrefsModel implements JacksonModel {
    public static final PrefsModel DEFAULT;

    public static abstract class a {
        public abstract PrefsModel a();

        public abstract a b(List<PagePrefs> list);
    }

    static {
        a builder = builder();
        builder.b(ImmutableList.of());
        DEFAULT = builder.a();
    }

    public static a builder() {
        return new AutoValue_PrefsModel.b();
    }

    @JsonCreator
    public static PrefsModel create(@JsonProperty("page_prefs") List<PagePrefs> list) {
        a builder = builder();
        builder.b(ImmutableList.copyOf((Collection) MoreObjects.firstNonNull(list, ImmutableList.of())));
        return builder.a();
    }

    @JsonProperty("page_prefs")
    public abstract List<PagePrefs> pagePrefs();

    public abstract a toBuilder();

    public PrefsModel withPagePrefs(List<PagePrefs> list) {
        a builder = toBuilder();
        builder.b(ImmutableList.copyOf((Collection) list));
        return builder.a();
    }
}
