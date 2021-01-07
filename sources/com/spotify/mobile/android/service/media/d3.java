package com.spotify.mobile.android.service.media;

import com.google.common.collect.ImmutableMap;
import com.spotify.mediasession.playbackactions.MediaAction;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

public class d3 {
    public List<MediaAction> a(PlayerState playerState, int i) {
        MediaAction mediaAction;
        ArrayList arrayList = new ArrayList(30);
        if (playerState != null && playerState.track().isPresent()) {
            ContextTrack contextTrack = playerState.track().get();
            if (playerState.isPaused()) {
                arrayList.add(MediaAction.PLAY);
            } else {
                arrayList.add(MediaAction.PAUSE);
                arrayList.add(MediaAction.STOP);
            }
            if (Boolean.parseBoolean(contextTrack.metadata().get("is_advertisement"))) {
                return arrayList;
            }
            boolean z = true;
            if (kxd.i(contextTrack)) {
                arrayList.add(MediaAction.SEEK_15_SECONDS_BACK);
                arrayList.add(MediaAction.SEEK_15_SECONDS_FORWARD);
                if (i == 50) {
                    mediaAction = MediaAction.PLAYBACK_SPEED_0_5;
                } else if (i == 80) {
                    mediaAction = MediaAction.PLAYBACK_SPEED_0_8;
                } else if (i == 120) {
                    mediaAction = MediaAction.PLAYBACK_SPEED_1_2;
                } else if (i == 150) {
                    mediaAction = MediaAction.PLAYBACK_SPEED_1_5;
                } else if (i == 200) {
                    mediaAction = MediaAction.PLAYBACK_SPEED_2_0;
                } else if (i != 300) {
                    mediaAction = MediaAction.PLAYBACK_SPEED_1_0;
                } else {
                    mediaAction = MediaAction.PLAYBACK_SPEED_3_0;
                }
                arrayList.add(mediaAction);
                if (!l0.c(playerState.contextUri(), LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                    return arrayList;
                }
            }
            if (playerState.restrictions().disallowSeekingReasons().isEmpty()) {
                arrayList.add(MediaAction.SEEK_TO);
            }
            if (playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
                arrayList.add(MediaAction.SKIP_TO_NEXT);
            }
            if (playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty()) {
                arrayList.add(MediaAction.SKIP_TO_PREVIOUS);
            }
            if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
                arrayList.add(MediaAction.TOGGLE_SHUFFLE);
                if (playerState.options().shufflingContext()) {
                    arrayList.add(MediaAction.TURN_SHUFFLE_OFF);
                } else {
                    arrayList.add(MediaAction.TURN_SHUFFLE_ON);
                }
            }
            ImmutableMap<String, String> metadata = contextTrack.metadata();
            boolean parseBoolean = Boolean.parseBoolean(metadata.get("collection.can_add"));
            boolean parseBoolean2 = Boolean.parseBoolean(metadata.get("collection.in_collection"));
            if (parseBoolean) {
                if (parseBoolean2) {
                    arrayList.add(MediaAction.REMOVE_FROM_COLLECTION);
                } else {
                    arrayList.add(MediaAction.ADD_TO_COLLECTION);
                }
            }
            if (!ViewUris.c2.a(playerState.contextUri()) && !kxd.i(contextTrack)) {
                arrayList.add(MediaAction.START_RADIO);
            }
            if (!playerState.options().repeatingContext() || playerState.options().repeatingTrack()) {
                z = false;
            }
            if (z) {
                if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                    arrayList.add(MediaAction.TURN_REPEAT_ONE_ON);
                    arrayList.add(MediaAction.TOGGLE_REPEAT);
                } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                    arrayList.add(MediaAction.TURN_REPEAT_ALL_OFF);
                    arrayList.add(MediaAction.TOGGLE_REPEAT);
                }
            } else if (playerState.options().repeatingTrack()) {
                if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                    arrayList.add(MediaAction.TURN_REPEAT_ONE_OFF);
                    arrayList.add(MediaAction.TOGGLE_REPEAT);
                }
            } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                arrayList.add(MediaAction.TURN_REPEAT_ALL_ON);
                arrayList.add(MediaAction.TOGGLE_REPEAT);
            }
            if (!kxd.i(contextTrack)) {
                arrayList.add(MediaAction.SET_STANDARD_RATING);
            }
        }
        return arrayList;
    }
}
