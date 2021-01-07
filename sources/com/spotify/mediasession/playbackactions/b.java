package com.spotify.mediasession.playbackactions;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;

public class b implements a {
    public PlaybackStateCompat.CustomAction a(MediaAction mediaAction) {
        return b(mediaAction, null);
    }

    public PlaybackStateCompat.CustomAction b(MediaAction mediaAction, Bundle bundle) {
        if (mediaAction == null || 0 != c(mediaAction)) {
            return null;
        }
        PlaybackStateCompat.CustomAction.b bVar = new PlaybackStateCompat.CustomAction.b(mediaAction.name(), mediaAction.name(), mediaAction.d());
        if (bundle != null) {
            bVar.b(bundle);
        }
        return bVar.a();
    }

    public long c(MediaAction mediaAction) {
        if (mediaAction == MediaAction.PLAY) {
            return 4;
        }
        if (mediaAction == MediaAction.PAUSE) {
            return 2;
        }
        if (mediaAction == MediaAction.SKIP_TO_NEXT) {
            return 32;
        }
        if (mediaAction == MediaAction.SKIP_TO_PREVIOUS) {
            return 16;
        }
        if (mediaAction == MediaAction.STOP) {
            return 1;
        }
        if (mediaAction == MediaAction.PREPARE_FROM_URI) {
            return 131072;
        }
        if (mediaAction == MediaAction.PLAY_FROM_URI) {
            return 8192;
        }
        if (mediaAction == MediaAction.PLAY_FROM_SEARCH) {
            return 2048;
        }
        if (mediaAction == MediaAction.TOGGLE_REPEAT) {
            return 262144;
        }
        if (mediaAction == MediaAction.TOGGLE_SHUFFLE) {
            return 2621440;
        }
        if (mediaAction == MediaAction.SEEK_TO) {
            return 256;
        }
        return mediaAction == MediaAction.SET_STANDARD_RATING ? 128 : 0;
    }
}
