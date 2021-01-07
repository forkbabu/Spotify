package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.functions.l;

/* renamed from: iec  reason: default package */
public final /* synthetic */ class iec implements l {
    public static final /* synthetic */ iec a = new iec();

    private /* synthetic */ iec() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayOptions.AudioStream audioStream;
        PlayerState playerState = (PlayerState) obj;
        long timestamp = playerState.timestamp();
        String contextUri = playerState.contextUri();
        PlayOrigin a2 = ixd.a(playerState.playOrigin());
        V orNull = playerState.track().transform(gxd.a).orNull();
        String orNull2 = playerState.playbackId().orNull();
        V orNull3 = playerState.index().transform(hxd.a).orNull();
        float floatValue = playerState.playbackSpeed().or((Optional<Double>) Double.valueOf(0.0d)).floatValue();
        long longValue = playerState.positionAsOfTimestamp().or((Optional<Long>) 0L).longValue();
        long longValue2 = playerState.duration().or((Optional<Long>) 0L).longValue();
        boolean isPlaying = playerState.isPlaying();
        boolean isPaused = playerState.isPaused();
        PlayerOptions options = playerState.options();
        com.spotify.mobile.android.cosmos.player.v2.PlayerOptions create = com.spotify.mobile.android.cosmos.player.v2.PlayerOptions.create(options.shufflingContext(), options.repeatingContext(), options.repeatingTrack());
        Restrictions restrictions = playerState.restrictions();
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(restrictions.disallowPeekingPrevReasons(), restrictions.disallowPeekingNextReasons(), restrictions.disallowSkippingPrevReasons(), restrictions.disallowSkippingNextReasons(), restrictions.disallowPausingReasons(), restrictions.disallowResumingReasons(), restrictions.disallowTogglingRepeatContextReasons(), restrictions.disallowTogglingRepeatTrackReasons(), restrictions.disallowTogglingShuffleReasons(), restrictions.disallowSeekingReasons(), restrictions.disallowTransferringPlaybackReasons(), restrictions.disallowRemoteControlReasons(), restrictions.disallowInsertingIntoNextTracksReasons(), restrictions.disallowInsertingIntoContextTracksReasons(), restrictions.disallowReorderingInNextTracksReasons(), restrictions.disallowReorderingInContextTracksReasons(), restrictions.disallowRemovingFromNextTracksReasons(), restrictions.disallowRemovingFromContextTracksReasons(), restrictions.disallowUpdatingContextReasons(), restrictions.disallowSetQueueReasons());
        PlayerSuppressions playerSuppressions = new PlayerSuppressions(playerState.suppressions().providers());
        PlayerTrack[] c = ixd.c(playerState.nextTracks());
        PlayerTrack[] c2 = ixd.c(playerState.prevTracks());
        ImmutableMap<String, String> contextMetadata = playerState.contextMetadata();
        ImmutableMap<String, String> pageMetadata = playerState.pageMetadata();
        if (playerState.audioStream().ordinal() != 1) {
            audioStream = PlayOptions.AudioStream.DEFAULT;
        } else {
            audioStream = PlayOptions.AudioStream.ALARM;
        }
        return new LegacyPlayerState(timestamp, contextUri, a2, orNull, orNull2, orNull3, floatValue, longValue, longValue2, isPlaying, isPaused, create, playerRestrictions, playerSuppressions, c, c2, contextMetadata, pageMetadata, audioStream);
    }
}
