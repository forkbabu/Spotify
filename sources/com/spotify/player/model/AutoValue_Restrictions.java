package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import com.spotify.player.model.Restrictions;
import java.util.Collection;
import java.util.Set;

final class AutoValue_Restrictions extends Restrictions {
    private final ImmutableSet<String> disallowInsertingIntoContextTracksReasons;
    private final ImmutableSet<String> disallowInsertingIntoNextTracksReasons;
    private final ImmutableSet<String> disallowInterruptingPlaybackReasons;
    private final ImmutableSet<String> disallowPausingReasons;
    private final ImmutableSet<String> disallowPeekingNextReasons;
    private final ImmutableSet<String> disallowPeekingPrevReasons;
    private final ImmutableSet<String> disallowRemoteControlReasons;
    private final ImmutableSet<String> disallowRemovingFromContextTracksReasons;
    private final ImmutableSet<String> disallowRemovingFromNextTracksReasons;
    private final ImmutableSet<String> disallowReorderingInContextTracksReasons;
    private final ImmutableSet<String> disallowReorderingInNextTracksReasons;
    private final ImmutableSet<String> disallowResumingReasons;
    private final ImmutableSet<String> disallowSeekingReasons;
    private final ImmutableSet<String> disallowSetQueueReasons;
    private final ImmutableSet<String> disallowSkippingNextReasons;
    private final ImmutableSet<String> disallowSkippingPrevReasons;
    private final ImmutableSet<String> disallowTogglingRepeatContextReasons;
    private final ImmutableSet<String> disallowTogglingRepeatTrackReasons;
    private final ImmutableSet<String> disallowTogglingShuffleReasons;
    private final ImmutableSet<String> disallowTransferringPlaybackReasons;
    private final ImmutableSet<String> disallowUpdatingContextReasons;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Restrictions.Builder {
        private ImmutableSet<String> disallowInsertingIntoContextTracksReasons;
        private ImmutableSet<String> disallowInsertingIntoNextTracksReasons;
        private ImmutableSet<String> disallowInterruptingPlaybackReasons;
        private ImmutableSet<String> disallowPausingReasons;
        private ImmutableSet<String> disallowPeekingNextReasons;
        private ImmutableSet<String> disallowPeekingPrevReasons;
        private ImmutableSet<String> disallowRemoteControlReasons;
        private ImmutableSet<String> disallowRemovingFromContextTracksReasons;
        private ImmutableSet<String> disallowRemovingFromNextTracksReasons;
        private ImmutableSet<String> disallowReorderingInContextTracksReasons;
        private ImmutableSet<String> disallowReorderingInNextTracksReasons;
        private ImmutableSet<String> disallowResumingReasons;
        private ImmutableSet<String> disallowSeekingReasons;
        private ImmutableSet<String> disallowSetQueueReasons;
        private ImmutableSet<String> disallowSkippingNextReasons;
        private ImmutableSet<String> disallowSkippingPrevReasons;
        private ImmutableSet<String> disallowTogglingRepeatContextReasons;
        private ImmutableSet<String> disallowTogglingRepeatTrackReasons;
        private ImmutableSet<String> disallowTogglingShuffleReasons;
        private ImmutableSet<String> disallowTransferringPlaybackReasons;
        private ImmutableSet<String> disallowUpdatingContextReasons;

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions build() {
            String str = this.disallowPausingReasons == null ? " disallowPausingReasons" : "";
            if (this.disallowResumingReasons == null) {
                str = je.x0(str, " disallowResumingReasons");
            }
            if (this.disallowSeekingReasons == null) {
                str = je.x0(str, " disallowSeekingReasons");
            }
            if (this.disallowPeekingPrevReasons == null) {
                str = je.x0(str, " disallowPeekingPrevReasons");
            }
            if (this.disallowPeekingNextReasons == null) {
                str = je.x0(str, " disallowPeekingNextReasons");
            }
            if (this.disallowSkippingPrevReasons == null) {
                str = je.x0(str, " disallowSkippingPrevReasons");
            }
            if (this.disallowSkippingNextReasons == null) {
                str = je.x0(str, " disallowSkippingNextReasons");
            }
            if (this.disallowTogglingRepeatContextReasons == null) {
                str = je.x0(str, " disallowTogglingRepeatContextReasons");
            }
            if (this.disallowTogglingRepeatTrackReasons == null) {
                str = je.x0(str, " disallowTogglingRepeatTrackReasons");
            }
            if (this.disallowTogglingShuffleReasons == null) {
                str = je.x0(str, " disallowTogglingShuffleReasons");
            }
            if (this.disallowSetQueueReasons == null) {
                str = je.x0(str, " disallowSetQueueReasons");
            }
            if (this.disallowInterruptingPlaybackReasons == null) {
                str = je.x0(str, " disallowInterruptingPlaybackReasons");
            }
            if (this.disallowTransferringPlaybackReasons == null) {
                str = je.x0(str, " disallowTransferringPlaybackReasons");
            }
            if (this.disallowRemoteControlReasons == null) {
                str = je.x0(str, " disallowRemoteControlReasons");
            }
            if (this.disallowInsertingIntoNextTracksReasons == null) {
                str = je.x0(str, " disallowInsertingIntoNextTracksReasons");
            }
            if (this.disallowInsertingIntoContextTracksReasons == null) {
                str = je.x0(str, " disallowInsertingIntoContextTracksReasons");
            }
            if (this.disallowReorderingInNextTracksReasons == null) {
                str = je.x0(str, " disallowReorderingInNextTracksReasons");
            }
            if (this.disallowReorderingInContextTracksReasons == null) {
                str = je.x0(str, " disallowReorderingInContextTracksReasons");
            }
            if (this.disallowRemovingFromNextTracksReasons == null) {
                str = je.x0(str, " disallowRemovingFromNextTracksReasons");
            }
            if (this.disallowRemovingFromContextTracksReasons == null) {
                str = je.x0(str, " disallowRemovingFromContextTracksReasons");
            }
            if (this.disallowUpdatingContextReasons == null) {
                str = je.x0(str, " disallowUpdatingContextReasons");
            }
            if (str.isEmpty()) {
                return new AutoValue_Restrictions(this.disallowPausingReasons, this.disallowResumingReasons, this.disallowSeekingReasons, this.disallowPeekingPrevReasons, this.disallowPeekingNextReasons, this.disallowSkippingPrevReasons, this.disallowSkippingNextReasons, this.disallowTogglingRepeatContextReasons, this.disallowTogglingRepeatTrackReasons, this.disallowTogglingShuffleReasons, this.disallowSetQueueReasons, this.disallowInterruptingPlaybackReasons, this.disallowTransferringPlaybackReasons, this.disallowRemoteControlReasons, this.disallowInsertingIntoNextTracksReasons, this.disallowInsertingIntoContextTracksReasons, this.disallowReorderingInNextTracksReasons, this.disallowReorderingInContextTracksReasons, this.disallowRemovingFromNextTracksReasons, this.disallowRemovingFromContextTracksReasons, this.disallowUpdatingContextReasons);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowInsertingIntoContextTracksReasons(Set<String> set) {
            this.disallowInsertingIntoContextTracksReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowInsertingIntoNextTracksReasons(Set<String> set) {
            this.disallowInsertingIntoNextTracksReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowInterruptingPlaybackReasons(Set<String> set) {
            this.disallowInterruptingPlaybackReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPausingReasons(Set<String> set) {
            this.disallowPausingReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPeekingNextReasons(Set<String> set) {
            this.disallowPeekingNextReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPeekingPrevReasons(Set<String> set) {
            this.disallowPeekingPrevReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowRemoteControlReasons(Set<String> set) {
            this.disallowRemoteControlReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowRemovingFromContextTracksReasons(Set<String> set) {
            this.disallowRemovingFromContextTracksReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowRemovingFromNextTracksReasons(Set<String> set) {
            this.disallowRemovingFromNextTracksReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingInContextTracksReasons(Set<String> set) {
            this.disallowReorderingInContextTracksReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingInNextTracksReasons(Set<String> set) {
            this.disallowReorderingInNextTracksReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowResumingReasons(Set<String> set) {
            this.disallowResumingReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSeekingReasons(Set<String> set) {
            this.disallowSeekingReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSetQueueReasons(Set<String> set) {
            this.disallowSetQueueReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSkippingNextReasons(Set<String> set) {
            this.disallowSkippingNextReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSkippingPrevReasons(Set<String> set) {
            this.disallowSkippingPrevReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTogglingRepeatContextReasons(Set<String> set) {
            this.disallowTogglingRepeatContextReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTogglingRepeatTrackReasons(Set<String> set) {
            this.disallowTogglingRepeatTrackReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTogglingShuffleReasons(Set<String> set) {
            this.disallowTogglingShuffleReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTransferringPlaybackReasons(Set<String> set) {
            this.disallowTransferringPlaybackReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowUpdatingContextReasons(Set<String> set) {
            this.disallowUpdatingContextReasons = ImmutableSet.copyOf((Collection) set);
            return this;
        }

        Builder() {
        }

        private Builder(Restrictions restrictions) {
            this.disallowPausingReasons = restrictions.disallowPausingReasons();
            this.disallowResumingReasons = restrictions.disallowResumingReasons();
            this.disallowSeekingReasons = restrictions.disallowSeekingReasons();
            this.disallowPeekingPrevReasons = restrictions.disallowPeekingPrevReasons();
            this.disallowPeekingNextReasons = restrictions.disallowPeekingNextReasons();
            this.disallowSkippingPrevReasons = restrictions.disallowSkippingPrevReasons();
            this.disallowSkippingNextReasons = restrictions.disallowSkippingNextReasons();
            this.disallowTogglingRepeatContextReasons = restrictions.disallowTogglingRepeatContextReasons();
            this.disallowTogglingRepeatTrackReasons = restrictions.disallowTogglingRepeatTrackReasons();
            this.disallowTogglingShuffleReasons = restrictions.disallowTogglingShuffleReasons();
            this.disallowSetQueueReasons = restrictions.disallowSetQueueReasons();
            this.disallowInterruptingPlaybackReasons = restrictions.disallowInterruptingPlaybackReasons();
            this.disallowTransferringPlaybackReasons = restrictions.disallowTransferringPlaybackReasons();
            this.disallowRemoteControlReasons = restrictions.disallowRemoteControlReasons();
            this.disallowInsertingIntoNextTracksReasons = restrictions.disallowInsertingIntoNextTracksReasons();
            this.disallowInsertingIntoContextTracksReasons = restrictions.disallowInsertingIntoContextTracksReasons();
            this.disallowReorderingInNextTracksReasons = restrictions.disallowReorderingInNextTracksReasons();
            this.disallowReorderingInContextTracksReasons = restrictions.disallowReorderingInContextTracksReasons();
            this.disallowRemovingFromNextTracksReasons = restrictions.disallowRemovingFromNextTracksReasons();
            this.disallowRemovingFromContextTracksReasons = restrictions.disallowRemovingFromContextTracksReasons();
            this.disallowUpdatingContextReasons = restrictions.disallowUpdatingContextReasons();
        }
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_inserting_into_context_tracks_reasons")
    public ImmutableSet<String> disallowInsertingIntoContextTracksReasons() {
        return this.disallowInsertingIntoContextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_inserting_into_next_tracks_reasons")
    public ImmutableSet<String> disallowInsertingIntoNextTracksReasons() {
        return this.disallowInsertingIntoNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_interrupting_playback_reasons")
    public ImmutableSet<String> disallowInterruptingPlaybackReasons() {
        return this.disallowInterruptingPlaybackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_pausing_reasons")
    public ImmutableSet<String> disallowPausingReasons() {
        return this.disallowPausingReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_peeking_next_reasons")
    public ImmutableSet<String> disallowPeekingNextReasons() {
        return this.disallowPeekingNextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_peeking_prev_reasons")
    public ImmutableSet<String> disallowPeekingPrevReasons() {
        return this.disallowPeekingPrevReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_remote_control_reasons")
    public ImmutableSet<String> disallowRemoteControlReasons() {
        return this.disallowRemoteControlReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_removing_from_context_tracks_reasons")
    public ImmutableSet<String> disallowRemovingFromContextTracksReasons() {
        return this.disallowRemovingFromContextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_removing_from_next_tracks_reasons")
    public ImmutableSet<String> disallowRemovingFromNextTracksReasons() {
        return this.disallowRemovingFromNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_reordering_in_context_tracks_reasons")
    public ImmutableSet<String> disallowReorderingInContextTracksReasons() {
        return this.disallowReorderingInContextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_reordering_in_next_tracks_reasons")
    public ImmutableSet<String> disallowReorderingInNextTracksReasons() {
        return this.disallowReorderingInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_resuming_reasons")
    public ImmutableSet<String> disallowResumingReasons() {
        return this.disallowResumingReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_seeking_reasons")
    public ImmutableSet<String> disallowSeekingReasons() {
        return this.disallowSeekingReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_set_queue_reasons")
    public ImmutableSet<String> disallowSetQueueReasons() {
        return this.disallowSetQueueReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_skipping_next_reasons")
    public ImmutableSet<String> disallowSkippingNextReasons() {
        return this.disallowSkippingNextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_skipping_prev_reasons")
    public ImmutableSet<String> disallowSkippingPrevReasons() {
        return this.disallowSkippingPrevReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_toggling_repeat_context_reasons")
    public ImmutableSet<String> disallowTogglingRepeatContextReasons() {
        return this.disallowTogglingRepeatContextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_toggling_repeat_track_reasons")
    public ImmutableSet<String> disallowTogglingRepeatTrackReasons() {
        return this.disallowTogglingRepeatTrackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_toggling_shuffle_reasons")
    public ImmutableSet<String> disallowTogglingShuffleReasons() {
        return this.disallowTogglingShuffleReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_transferring_playback_reasons")
    public ImmutableSet<String> disallowTransferringPlaybackReasons() {
        return this.disallowTransferringPlaybackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    @JsonProperty("disallow_updating_context_reasons")
    public ImmutableSet<String> disallowUpdatingContextReasons() {
        return this.disallowUpdatingContextReasons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Restrictions)) {
            return false;
        }
        Restrictions restrictions = (Restrictions) obj;
        if (!this.disallowPausingReasons.equals(restrictions.disallowPausingReasons()) || !this.disallowResumingReasons.equals(restrictions.disallowResumingReasons()) || !this.disallowSeekingReasons.equals(restrictions.disallowSeekingReasons()) || !this.disallowPeekingPrevReasons.equals(restrictions.disallowPeekingPrevReasons()) || !this.disallowPeekingNextReasons.equals(restrictions.disallowPeekingNextReasons()) || !this.disallowSkippingPrevReasons.equals(restrictions.disallowSkippingPrevReasons()) || !this.disallowSkippingNextReasons.equals(restrictions.disallowSkippingNextReasons()) || !this.disallowTogglingRepeatContextReasons.equals(restrictions.disallowTogglingRepeatContextReasons()) || !this.disallowTogglingRepeatTrackReasons.equals(restrictions.disallowTogglingRepeatTrackReasons()) || !this.disallowTogglingShuffleReasons.equals(restrictions.disallowTogglingShuffleReasons()) || !this.disallowSetQueueReasons.equals(restrictions.disallowSetQueueReasons()) || !this.disallowInterruptingPlaybackReasons.equals(restrictions.disallowInterruptingPlaybackReasons()) || !this.disallowTransferringPlaybackReasons.equals(restrictions.disallowTransferringPlaybackReasons()) || !this.disallowRemoteControlReasons.equals(restrictions.disallowRemoteControlReasons()) || !this.disallowInsertingIntoNextTracksReasons.equals(restrictions.disallowInsertingIntoNextTracksReasons()) || !this.disallowInsertingIntoContextTracksReasons.equals(restrictions.disallowInsertingIntoContextTracksReasons()) || !this.disallowReorderingInNextTracksReasons.equals(restrictions.disallowReorderingInNextTracksReasons()) || !this.disallowReorderingInContextTracksReasons.equals(restrictions.disallowReorderingInContextTracksReasons()) || !this.disallowRemovingFromNextTracksReasons.equals(restrictions.disallowRemovingFromNextTracksReasons()) || !this.disallowRemovingFromContextTracksReasons.equals(restrictions.disallowRemovingFromContextTracksReasons()) || !this.disallowUpdatingContextReasons.equals(restrictions.disallowUpdatingContextReasons())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((this.disallowPausingReasons.hashCode() ^ 1000003) * 1000003) ^ this.disallowResumingReasons.hashCode()) * 1000003) ^ this.disallowSeekingReasons.hashCode()) * 1000003) ^ this.disallowPeekingPrevReasons.hashCode()) * 1000003) ^ this.disallowPeekingNextReasons.hashCode()) * 1000003) ^ this.disallowSkippingPrevReasons.hashCode()) * 1000003) ^ this.disallowSkippingNextReasons.hashCode()) * 1000003) ^ this.disallowTogglingRepeatContextReasons.hashCode()) * 1000003) ^ this.disallowTogglingRepeatTrackReasons.hashCode()) * 1000003) ^ this.disallowTogglingShuffleReasons.hashCode()) * 1000003) ^ this.disallowSetQueueReasons.hashCode()) * 1000003) ^ this.disallowInterruptingPlaybackReasons.hashCode()) * 1000003) ^ this.disallowTransferringPlaybackReasons.hashCode()) * 1000003) ^ this.disallowRemoteControlReasons.hashCode()) * 1000003) ^ this.disallowInsertingIntoNextTracksReasons.hashCode()) * 1000003) ^ this.disallowInsertingIntoContextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingInContextTracksReasons.hashCode()) * 1000003) ^ this.disallowRemovingFromNextTracksReasons.hashCode()) * 1000003) ^ this.disallowRemovingFromContextTracksReasons.hashCode()) * 1000003) ^ this.disallowUpdatingContextReasons.hashCode();
    }

    @Override // com.spotify.player.model.Restrictions
    public Restrictions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Restrictions{disallowPausingReasons=");
        V0.append(this.disallowPausingReasons);
        V0.append(", disallowResumingReasons=");
        V0.append(this.disallowResumingReasons);
        V0.append(", disallowSeekingReasons=");
        V0.append(this.disallowSeekingReasons);
        V0.append(", disallowPeekingPrevReasons=");
        V0.append(this.disallowPeekingPrevReasons);
        V0.append(", disallowPeekingNextReasons=");
        V0.append(this.disallowPeekingNextReasons);
        V0.append(", disallowSkippingPrevReasons=");
        V0.append(this.disallowSkippingPrevReasons);
        V0.append(", disallowSkippingNextReasons=");
        V0.append(this.disallowSkippingNextReasons);
        V0.append(", disallowTogglingRepeatContextReasons=");
        V0.append(this.disallowTogglingRepeatContextReasons);
        V0.append(", disallowTogglingRepeatTrackReasons=");
        V0.append(this.disallowTogglingRepeatTrackReasons);
        V0.append(", disallowTogglingShuffleReasons=");
        V0.append(this.disallowTogglingShuffleReasons);
        V0.append(", disallowSetQueueReasons=");
        V0.append(this.disallowSetQueueReasons);
        V0.append(", disallowInterruptingPlaybackReasons=");
        V0.append(this.disallowInterruptingPlaybackReasons);
        V0.append(", disallowTransferringPlaybackReasons=");
        V0.append(this.disallowTransferringPlaybackReasons);
        V0.append(", disallowRemoteControlReasons=");
        V0.append(this.disallowRemoteControlReasons);
        V0.append(", disallowInsertingIntoNextTracksReasons=");
        V0.append(this.disallowInsertingIntoNextTracksReasons);
        V0.append(", disallowInsertingIntoContextTracksReasons=");
        V0.append(this.disallowInsertingIntoContextTracksReasons);
        V0.append(", disallowReorderingInNextTracksReasons=");
        V0.append(this.disallowReorderingInNextTracksReasons);
        V0.append(", disallowReorderingInContextTracksReasons=");
        V0.append(this.disallowReorderingInContextTracksReasons);
        V0.append(", disallowRemovingFromNextTracksReasons=");
        V0.append(this.disallowRemovingFromNextTracksReasons);
        V0.append(", disallowRemovingFromContextTracksReasons=");
        V0.append(this.disallowRemovingFromContextTracksReasons);
        V0.append(", disallowUpdatingContextReasons=");
        V0.append(this.disallowUpdatingContextReasons);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_Restrictions(ImmutableSet<String> immutableSet, ImmutableSet<String> immutableSet2, ImmutableSet<String> immutableSet3, ImmutableSet<String> immutableSet4, ImmutableSet<String> immutableSet5, ImmutableSet<String> immutableSet6, ImmutableSet<String> immutableSet7, ImmutableSet<String> immutableSet8, ImmutableSet<String> immutableSet9, ImmutableSet<String> immutableSet10, ImmutableSet<String> immutableSet11, ImmutableSet<String> immutableSet12, ImmutableSet<String> immutableSet13, ImmutableSet<String> immutableSet14, ImmutableSet<String> immutableSet15, ImmutableSet<String> immutableSet16, ImmutableSet<String> immutableSet17, ImmutableSet<String> immutableSet18, ImmutableSet<String> immutableSet19, ImmutableSet<String> immutableSet20, ImmutableSet<String> immutableSet21) {
        this.disallowPausingReasons = immutableSet;
        this.disallowResumingReasons = immutableSet2;
        this.disallowSeekingReasons = immutableSet3;
        this.disallowPeekingPrevReasons = immutableSet4;
        this.disallowPeekingNextReasons = immutableSet5;
        this.disallowSkippingPrevReasons = immutableSet6;
        this.disallowSkippingNextReasons = immutableSet7;
        this.disallowTogglingRepeatContextReasons = immutableSet8;
        this.disallowTogglingRepeatTrackReasons = immutableSet9;
        this.disallowTogglingShuffleReasons = immutableSet10;
        this.disallowSetQueueReasons = immutableSet11;
        this.disallowInterruptingPlaybackReasons = immutableSet12;
        this.disallowTransferringPlaybackReasons = immutableSet13;
        this.disallowRemoteControlReasons = immutableSet14;
        this.disallowInsertingIntoNextTracksReasons = immutableSet15;
        this.disallowInsertingIntoContextTracksReasons = immutableSet16;
        this.disallowReorderingInNextTracksReasons = immutableSet17;
        this.disallowReorderingInContextTracksReasons = immutableSet18;
        this.disallowRemovingFromNextTracksReasons = immutableSet19;
        this.disallowRemovingFromContextTracksReasons = immutableSet20;
        this.disallowUpdatingContextReasons = immutableSet21;
    }
}
