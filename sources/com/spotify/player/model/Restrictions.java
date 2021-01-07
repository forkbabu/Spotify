package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import com.spotify.player.model.AutoValue_Restrictions;
import java.util.Collections;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class Restrictions {
    public static final Restrictions EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return Restrictions.builder();
        }

        public abstract Restrictions build();

        @JsonProperty("disallow_inserting_into_context_tracks_reasons")
        public abstract Builder disallowInsertingIntoContextTracksReasons(Set<String> set);

        @JsonProperty("disallow_inserting_into_next_tracks_reasons")
        public abstract Builder disallowInsertingIntoNextTracksReasons(Set<String> set);

        @JsonProperty("disallow_interrupting_playback_reasons")
        public abstract Builder disallowInterruptingPlaybackReasons(Set<String> set);

        @JsonProperty("disallow_pausing_reasons")
        public abstract Builder disallowPausingReasons(Set<String> set);

        @JsonProperty("disallow_peeking_next_reasons")
        public abstract Builder disallowPeekingNextReasons(Set<String> set);

        @JsonProperty("disallow_peeking_prev_reasons")
        public abstract Builder disallowPeekingPrevReasons(Set<String> set);

        @JsonProperty("disallow_remote_control_reasons")
        public abstract Builder disallowRemoteControlReasons(Set<String> set);

        @JsonProperty("disallow_removing_from_context_tracks_reasons")
        public abstract Builder disallowRemovingFromContextTracksReasons(Set<String> set);

        @JsonProperty("disallow_removing_from_next_tracks_reasons")
        public abstract Builder disallowRemovingFromNextTracksReasons(Set<String> set);

        @JsonProperty("disallow_reordering_in_context_tracks_reasons")
        public abstract Builder disallowReorderingInContextTracksReasons(Set<String> set);

        @JsonProperty("disallow_reordering_in_next_tracks_reasons")
        public abstract Builder disallowReorderingInNextTracksReasons(Set<String> set);

        @JsonProperty("disallow_resuming_reasons")
        public abstract Builder disallowResumingReasons(Set<String> set);

        @JsonProperty("disallow_seeking_reasons")
        public abstract Builder disallowSeekingReasons(Set<String> set);

        @JsonProperty("disallow_set_queue_reasons")
        public abstract Builder disallowSetQueueReasons(Set<String> set);

        @JsonProperty("disallow_skipping_next_reasons")
        public abstract Builder disallowSkippingNextReasons(Set<String> set);

        @JsonProperty("disallow_skipping_prev_reasons")
        public abstract Builder disallowSkippingPrevReasons(Set<String> set);

        @JsonProperty("disallow_toggling_repeat_context_reasons")
        public abstract Builder disallowTogglingRepeatContextReasons(Set<String> set);

        @JsonProperty("disallow_toggling_repeat_track_reasons")
        public abstract Builder disallowTogglingRepeatTrackReasons(Set<String> set);

        @JsonProperty("disallow_toggling_shuffle_reasons")
        public abstract Builder disallowTogglingShuffleReasons(Set<String> set);

        @JsonProperty("disallow_transferring_playback_reasons")
        public abstract Builder disallowTransferringPlaybackReasons(Set<String> set);

        @JsonProperty("disallow_updating_context_reasons")
        public abstract Builder disallowUpdatingContextReasons(Set<String> set);
    }

    public static Builder builder() {
        return new AutoValue_Restrictions.Builder().disallowPausingReasons(Collections.emptySet()).disallowResumingReasons(Collections.emptySet()).disallowSeekingReasons(Collections.emptySet()).disallowPeekingPrevReasons(Collections.emptySet()).disallowPeekingNextReasons(Collections.emptySet()).disallowSkippingPrevReasons(Collections.emptySet()).disallowSkippingNextReasons(Collections.emptySet()).disallowTogglingRepeatContextReasons(Collections.emptySet()).disallowTogglingRepeatTrackReasons(Collections.emptySet()).disallowTogglingShuffleReasons(Collections.emptySet()).disallowSetQueueReasons(Collections.emptySet()).disallowInterruptingPlaybackReasons(Collections.emptySet()).disallowTransferringPlaybackReasons(Collections.emptySet()).disallowRemoteControlReasons(Collections.emptySet()).disallowInsertingIntoNextTracksReasons(Collections.emptySet()).disallowInsertingIntoContextTracksReasons(Collections.emptySet()).disallowReorderingInNextTracksReasons(Collections.emptySet()).disallowReorderingInContextTracksReasons(Collections.emptySet()).disallowRemovingFromNextTracksReasons(Collections.emptySet()).disallowUpdatingContextReasons(Collections.emptySet()).disallowRemovingFromContextTracksReasons(Collections.emptySet());
    }

    @JsonProperty("disallow_inserting_into_context_tracks_reasons")
    public abstract ImmutableSet<String> disallowInsertingIntoContextTracksReasons();

    @JsonProperty("disallow_inserting_into_next_tracks_reasons")
    public abstract ImmutableSet<String> disallowInsertingIntoNextTracksReasons();

    @JsonProperty("disallow_interrupting_playback_reasons")
    public abstract ImmutableSet<String> disallowInterruptingPlaybackReasons();

    @JsonProperty("disallow_pausing_reasons")
    public abstract ImmutableSet<String> disallowPausingReasons();

    @JsonProperty("disallow_peeking_next_reasons")
    public abstract ImmutableSet<String> disallowPeekingNextReasons();

    @JsonProperty("disallow_peeking_prev_reasons")
    public abstract ImmutableSet<String> disallowPeekingPrevReasons();

    @JsonProperty("disallow_remote_control_reasons")
    public abstract ImmutableSet<String> disallowRemoteControlReasons();

    @JsonProperty("disallow_removing_from_context_tracks_reasons")
    public abstract ImmutableSet<String> disallowRemovingFromContextTracksReasons();

    @JsonProperty("disallow_removing_from_next_tracks_reasons")
    public abstract ImmutableSet<String> disallowRemovingFromNextTracksReasons();

    @JsonProperty("disallow_reordering_in_context_tracks_reasons")
    public abstract ImmutableSet<String> disallowReorderingInContextTracksReasons();

    @JsonProperty("disallow_reordering_in_next_tracks_reasons")
    public abstract ImmutableSet<String> disallowReorderingInNextTracksReasons();

    @JsonProperty("disallow_resuming_reasons")
    public abstract ImmutableSet<String> disallowResumingReasons();

    @JsonProperty("disallow_seeking_reasons")
    public abstract ImmutableSet<String> disallowSeekingReasons();

    @JsonProperty("disallow_set_queue_reasons")
    public abstract ImmutableSet<String> disallowSetQueueReasons();

    @JsonProperty("disallow_skipping_next_reasons")
    public abstract ImmutableSet<String> disallowSkippingNextReasons();

    @JsonProperty("disallow_skipping_prev_reasons")
    public abstract ImmutableSet<String> disallowSkippingPrevReasons();

    @JsonProperty("disallow_toggling_repeat_context_reasons")
    public abstract ImmutableSet<String> disallowTogglingRepeatContextReasons();

    @JsonProperty("disallow_toggling_repeat_track_reasons")
    public abstract ImmutableSet<String> disallowTogglingRepeatTrackReasons();

    @JsonProperty("disallow_toggling_shuffle_reasons")
    public abstract ImmutableSet<String> disallowTogglingShuffleReasons();

    @JsonProperty("disallow_transferring_playback_reasons")
    public abstract ImmutableSet<String> disallowTransferringPlaybackReasons();

    @JsonProperty("disallow_updating_context_reasons")
    public abstract ImmutableSet<String> disallowUpdatingContextReasons();

    public abstract Builder toBuilder();
}
