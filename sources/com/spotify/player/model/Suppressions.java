package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class Suppressions {
    public static final Suppressions EMPTY = create();

    public static final class Providers {
        public static final String ADS = "ad";
        public static final String MFT = "mft";
        public static final String MFT_DISALLOW_RESTART_PLAY = "mft/disallow_restart_play";
        public static final String MFT_INJECT_FILLER_TRACKS = "mft/inject_filler_tracks";
        public static final String MFT_INJECT_RANDOM_TRACKS = "mft/inject_random_tracks";
        public static final String RESUME_POINT = "played_state/resume_point";
    }

    public static Suppressions create() {
        return create(Collections.emptySet());
    }

    @JsonProperty("providers")
    public abstract ImmutableSet<String> providers();

    @JsonCreator
    public static Suppressions create(@JsonProperty("providers") Set<String> set) {
        return new AutoValue_Suppressions(set == null ? ImmutableSet.of() : ImmutableSet.copyOf((Collection) set));
    }
}
