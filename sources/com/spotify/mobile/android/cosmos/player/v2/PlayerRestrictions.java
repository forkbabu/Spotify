package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class PlayerRestrictions implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayerRestrictions> CREATOR = new Parcelable.Creator<PlayerRestrictions>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayerRestrictions createFromParcel(Parcel parcel) {
            return new PlayerRestrictions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayerRestrictions[] newArray(int i) {
            return new PlayerRestrictions[i];
        }
    };
    @JsonProperty("disallow_inserting_into_context_tracks_reasons")
    private final Set<String> mDisallowInsertingIntoContextTracksReasons;
    @JsonProperty("disallow_inserting_into_next_tracks_reasons")
    private final Set<String> mDisallowInsertingIntoNextTracksReasons;
    @JsonProperty("disallow_pausing_reasons")
    private final Set<String> mDisallowPausingReasons;
    @JsonProperty("disallow_peeking_next_reasons")
    private final Set<String> mDisallowPeekingNextReasons;
    @JsonProperty("disallow_peeking_prev_reasons")
    private final Set<String> mDisallowPeekingPrevReasons;
    @JsonProperty("disallow_remote_control_reasons")
    private final Set<String> mDisallowRemoteControlReasons;
    @JsonProperty("disallow_removing_from_context_tracks_reasons")
    private final Set<String> mDisallowRemovingFromContextTracksReasons;
    @JsonProperty("disallow_removing_from_next_tracks_reasons")
    private final Set<String> mDisallowRemovingFromNextTracksReasons;
    @JsonProperty("disallow_reordering_in_context_tracks_reasons")
    private final Set<String> mDisallowReorderingInContextTracksReasons;
    @JsonProperty("disallow_reordering_in_next_tracks_reasons")
    private final Set<String> mDisallowReorderingInNextTracksReasons;
    @JsonProperty("disallow_resuming_reasons")
    private final Set<String> mDisallowResumingReasons;
    @JsonProperty("disallow_seeking_reasons")
    private final Set<String> mDisallowSeekingReasons;
    @JsonProperty("disallow_set_queue_reasons")
    private final Set<String> mDisallowSetQueueReasons;
    @JsonProperty("disallow_skipping_next_reasons")
    private final Set<String> mDisallowSkippingNextReasons;
    @JsonProperty("disallow_skipping_prev_reasons")
    private final Set<String> mDisallowSkippingPrevReasons;
    @JsonProperty("disallow_toggling_repeat_context_reasons")
    private final Set<String> mDisallowTogglingRepeatContextReasons;
    @JsonProperty("disallow_toggling_repeat_track_reasons")
    private final Set<String> mDisallowTogglingRepeatTrackReasons;
    @JsonProperty("disallow_toggling_shuffle_reasons")
    private final Set<String> mDisallowTogglingShuffleReasons;
    @JsonProperty("disallow_transferring_playback_reasons")
    private final Set<String> mDisallowTransferringPlaybackReasons;
    @JsonProperty("disallow_updating_context_reasons")
    private final Set<String> mDisallowUpdatingContextReasons;

    @JsonCreator
    public PlayerRestrictions(@JsonProperty("disallow_peeking_prev_reasons") Set<String> set, @JsonProperty("disallow_peeking_next_reasons") Set<String> set2, @JsonProperty("disallow_skipping_prev_reasons") Set<String> set3, @JsonProperty("disallow_skipping_next_reasons") Set<String> set4, @JsonProperty("disallow_pausing_reasons") Set<String> set5, @JsonProperty("disallow_resuming_reasons") Set<String> set6, @JsonProperty("disallow_toggling_repeat_context_reasons") Set<String> set7, @JsonProperty("disallow_toggling_repeat_track_reasons") Set<String> set8, @JsonProperty("disallow_toggling_shuffle_reasons") Set<String> set9, @JsonProperty("disallow_seeking_reasons") Set<String> set10, @JsonProperty("disallow_transferring_playback_reasons") Set<String> set11, @JsonProperty("disallow_remote_control_reasons") Set<String> set12, @JsonProperty("disallow_inserting_into_next_tracks_reasons") Set<String> set13, @JsonProperty("disallow_inserting_into_context_tracks_reasons") Set<String> set14, @JsonProperty("disallow_reordering_in_next_tracks_reasons") Set<String> set15, @JsonProperty("disallow_reordering_in_context_tracks_reasons") Set<String> set16, @JsonProperty("disallow_removing_from_next_tracks_reasons") Set<String> set17, @JsonProperty("disallow_removing_from_context_tracks_reasons") Set<String> set18, @JsonProperty("disallow_updating_context_reasons") Set<String> set19, @JsonProperty("disallow_set_queue_reasons") Set<String> set20) {
        this.mDisallowPeekingPrevReasons = unmodifiable(set);
        this.mDisallowPeekingNextReasons = unmodifiable(set2);
        this.mDisallowSkippingPrevReasons = unmodifiable(set3);
        this.mDisallowSkippingNextReasons = unmodifiable(set4);
        this.mDisallowPausingReasons = unmodifiable(set5);
        this.mDisallowResumingReasons = unmodifiable(set6);
        this.mDisallowTogglingRepeatContextReasons = unmodifiable(set7);
        this.mDisallowTogglingRepeatTrackReasons = unmodifiable(set8);
        this.mDisallowTogglingShuffleReasons = unmodifiable(set9);
        this.mDisallowSeekingReasons = unmodifiable(set10);
        this.mDisallowTransferringPlaybackReasons = unmodifiable(set11);
        this.mDisallowRemoteControlReasons = unmodifiable(set12);
        this.mDisallowInsertingIntoNextTracksReasons = unmodifiable(set13);
        this.mDisallowInsertingIntoContextTracksReasons = unmodifiable(set14);
        this.mDisallowReorderingInNextTracksReasons = unmodifiable(set15);
        this.mDisallowReorderingInContextTracksReasons = unmodifiable(set16);
        this.mDisallowRemovingFromNextTracksReasons = unmodifiable(set17);
        this.mDisallowRemovingFromContextTracksReasons = unmodifiable(set18);
        this.mDisallowUpdatingContextReasons = unmodifiable(set19);
        this.mDisallowSetQueueReasons = unmodifiable(set20);
    }

    public static PlayerRestrictions empty() {
        return new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
    }

    private static Set<String> unmodifiable(Set<String> set) {
        if (set == null) {
            set = Collections.emptySet();
        }
        return Collections.unmodifiableSet(set);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Set<String> disallowInsertingIntoContextTracksReasons() {
        return this.mDisallowInsertingIntoContextTracksReasons;
    }

    public Set<String> disallowInsertingIntoNextTracksReasons() {
        return this.mDisallowInsertingIntoNextTracksReasons;
    }

    public Set<String> disallowPausingReasons() {
        return this.mDisallowPausingReasons;
    }

    public Set<String> disallowPeekingNextReasons() {
        return this.mDisallowPeekingNextReasons;
    }

    public Set<String> disallowPeekingPrevReasons() {
        return this.mDisallowPeekingPrevReasons;
    }

    public Set<String> disallowRemoteControlReasons() {
        return this.mDisallowRemoteControlReasons;
    }

    public Set<String> disallowRemovingFromContextTracksReasons() {
        return this.mDisallowRemovingFromContextTracksReasons;
    }

    public Set<String> disallowRemovingFromNextTracksReasons() {
        return this.mDisallowRemovingFromNextTracksReasons;
    }

    public Set<String> disallowReorderingInContextTracksReasons() {
        return this.mDisallowReorderingInContextTracksReasons;
    }

    public Set<String> disallowReorderingInNextTracksReasons() {
        return this.mDisallowReorderingInNextTracksReasons;
    }

    public Set<String> disallowResumingReasons() {
        return this.mDisallowResumingReasons;
    }

    public Set<String> disallowSeekingReasons() {
        return this.mDisallowSeekingReasons;
    }

    public Set<String> disallowSetQueueReasons() {
        return this.mDisallowSetQueueReasons;
    }

    public Set<String> disallowSkippingNextReasons() {
        return this.mDisallowSkippingNextReasons;
    }

    public Set<String> disallowSkippingPrevReasons() {
        return this.mDisallowSkippingPrevReasons;
    }

    public Set<String> disallowTogglingRepeatContextReasons() {
        return this.mDisallowTogglingRepeatContextReasons;
    }

    public Set<String> disallowTogglingRepeatTrackReasons() {
        return this.mDisallowTogglingRepeatTrackReasons;
    }

    public Set<String> disallowTogglingShuffleReasons() {
        return this.mDisallowTogglingShuffleReasons;
    }

    public Set<String> disallowTransferringPlaybackReasons() {
        return this.mDisallowTransferringPlaybackReasons;
    }

    public Set<String> disallowUpdatingContextReasons() {
        return this.mDisallowUpdatingContextReasons;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerRestrictions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = (PlayerRestrictions) obj;
        return this.mDisallowPausingReasons.equals(playerRestrictions.mDisallowPausingReasons) && this.mDisallowPeekingNextReasons.equals(playerRestrictions.mDisallowPeekingNextReasons) && this.mDisallowPeekingPrevReasons.equals(playerRestrictions.mDisallowPeekingPrevReasons) && this.mDisallowResumingReasons.equals(playerRestrictions.mDisallowResumingReasons) && this.mDisallowSeekingReasons.equals(playerRestrictions.mDisallowSeekingReasons) && this.mDisallowSkippingNextReasons.equals(playerRestrictions.mDisallowSkippingNextReasons) && this.mDisallowSkippingPrevReasons.equals(playerRestrictions.mDisallowSkippingPrevReasons) && this.mDisallowTogglingRepeatContextReasons.equals(playerRestrictions.mDisallowTogglingRepeatContextReasons) && this.mDisallowTogglingRepeatTrackReasons.equals(playerRestrictions.mDisallowTogglingRepeatTrackReasons) && this.mDisallowTogglingShuffleReasons.equals(playerRestrictions.mDisallowTogglingShuffleReasons) && this.mDisallowTransferringPlaybackReasons.equals(playerRestrictions.mDisallowTransferringPlaybackReasons) && this.mDisallowRemoteControlReasons.equals(playerRestrictions.mDisallowRemoteControlReasons) && this.mDisallowInsertingIntoNextTracksReasons.equals(playerRestrictions.mDisallowInsertingIntoNextTracksReasons) && this.mDisallowInsertingIntoContextTracksReasons.equals(playerRestrictions.mDisallowInsertingIntoContextTracksReasons) && this.mDisallowReorderingInNextTracksReasons.equals(playerRestrictions.mDisallowReorderingInNextTracksReasons) && this.mDisallowReorderingInContextTracksReasons.equals(playerRestrictions.mDisallowReorderingInContextTracksReasons) && this.mDisallowRemovingFromNextTracksReasons.equals(playerRestrictions.mDisallowRemovingFromNextTracksReasons) && this.mDisallowRemovingFromContextTracksReasons.equals(playerRestrictions.mDisallowRemovingFromContextTracksReasons) && this.mDisallowUpdatingContextReasons.equals(playerRestrictions.mDisallowUpdatingContextReasons) && this.mDisallowSetQueueReasons.equals(playerRestrictions.mDisallowSetQueueReasons);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.mDisallowSetQueueReasons.hashCode() + je.c(this.mDisallowUpdatingContextReasons, je.c(this.mDisallowRemovingFromContextTracksReasons, je.c(this.mDisallowRemovingFromNextTracksReasons, je.c(this.mDisallowReorderingInContextTracksReasons, je.c(this.mDisallowReorderingInNextTracksReasons, je.c(this.mDisallowInsertingIntoContextTracksReasons, je.c(this.mDisallowInsertingIntoNextTracksReasons, je.c(this.mDisallowRemoteControlReasons, je.c(this.mDisallowTransferringPlaybackReasons, je.c(this.mDisallowSeekingReasons, je.c(this.mDisallowTogglingShuffleReasons, je.c(this.mDisallowTogglingRepeatTrackReasons, je.c(this.mDisallowTogglingRepeatContextReasons, je.c(this.mDisallowResumingReasons, je.c(this.mDisallowPausingReasons, je.c(this.mDisallowSkippingNextReasons, je.c(this.mDisallowSkippingPrevReasons, je.c(this.mDisallowPeekingNextReasons, this.mDisallowPeekingPrevReasons.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.u(parcel, this.mDisallowPeekingPrevReasons);
        gf0.u(parcel, this.mDisallowPeekingNextReasons);
        gf0.u(parcel, this.mDisallowSkippingPrevReasons);
        gf0.u(parcel, this.mDisallowSkippingNextReasons);
        gf0.u(parcel, this.mDisallowPausingReasons);
        gf0.u(parcel, this.mDisallowResumingReasons);
        gf0.u(parcel, this.mDisallowTogglingRepeatContextReasons);
        gf0.u(parcel, this.mDisallowTogglingRepeatTrackReasons);
        gf0.u(parcel, this.mDisallowTogglingShuffleReasons);
        gf0.u(parcel, this.mDisallowSeekingReasons);
        gf0.u(parcel, this.mDisallowTransferringPlaybackReasons);
        gf0.u(parcel, this.mDisallowRemoteControlReasons);
        gf0.u(parcel, this.mDisallowInsertingIntoNextTracksReasons);
        gf0.u(parcel, this.mDisallowInsertingIntoContextTracksReasons);
        gf0.u(parcel, this.mDisallowReorderingInNextTracksReasons);
        gf0.u(parcel, this.mDisallowReorderingInContextTracksReasons);
        gf0.u(parcel, this.mDisallowRemovingFromNextTracksReasons);
        gf0.u(parcel, this.mDisallowRemovingFromContextTracksReasons);
        gf0.u(parcel, this.mDisallowUpdatingContextReasons);
        gf0.u(parcel, this.mDisallowSetQueueReasons);
    }

    protected PlayerRestrictions(Parcel parcel) {
        this.mDisallowPeekingPrevReasons = gf0.m(parcel);
        this.mDisallowPeekingNextReasons = gf0.m(parcel);
        this.mDisallowSkippingPrevReasons = gf0.m(parcel);
        this.mDisallowSkippingNextReasons = gf0.m(parcel);
        this.mDisallowPausingReasons = gf0.m(parcel);
        this.mDisallowResumingReasons = gf0.m(parcel);
        this.mDisallowTogglingRepeatContextReasons = gf0.m(parcel);
        this.mDisallowTogglingRepeatTrackReasons = gf0.m(parcel);
        this.mDisallowTogglingShuffleReasons = gf0.m(parcel);
        this.mDisallowSeekingReasons = gf0.m(parcel);
        this.mDisallowTransferringPlaybackReasons = gf0.m(parcel);
        this.mDisallowRemoteControlReasons = gf0.m(parcel);
        this.mDisallowInsertingIntoNextTracksReasons = gf0.m(parcel);
        this.mDisallowInsertingIntoContextTracksReasons = gf0.m(parcel);
        this.mDisallowReorderingInNextTracksReasons = gf0.m(parcel);
        this.mDisallowReorderingInContextTracksReasons = gf0.m(parcel);
        this.mDisallowRemovingFromNextTracksReasons = gf0.m(parcel);
        this.mDisallowRemovingFromContextTracksReasons = gf0.m(parcel);
        this.mDisallowUpdatingContextReasons = gf0.m(parcel);
        this.mDisallowSetQueueReasons = gf0.m(parcel);
    }
}
