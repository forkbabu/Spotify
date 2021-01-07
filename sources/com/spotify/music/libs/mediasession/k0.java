package com.spotify.music.libs.mediasession;

import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* access modifiers changed from: package-private */
public class k0 {
    private static void a(Intent intent, PlayerState playerState, cqe cqe) {
        ContextTrack contextTrack = playerState.track().isPresent() ? playerState.track().get() : null;
        String str = "";
        intent.putExtra("id", contextTrack != null ? contextTrack.uri() : str);
        intent.putExtra(AppProtocol.TrackData.TYPE_TRACK, contextTrack != null ? contextTrack.metadata().get("title") : str);
        intent.putExtra("artist", contextTrack != null ? contextTrack.metadata().get("artist_name") : str);
        intent.putExtra("album", contextTrack != null ? contextTrack.metadata().get("album_title") : str);
        if (contextTrack != null) {
            str = contextTrack.metadata().get("album_uri");
        }
        intent.putExtra("albumId", str);
        long j = 0;
        long longValue = playerState.duration().isPresent() ? playerState.duration().get().longValue() : 0;
        intent.putExtra("duration", longValue);
        Optional<Long> position = playerState.position(cqe.d());
        if (position.isPresent()) {
            j = position.get().longValue();
        }
        intent.putExtra("position", j);
        intent.putExtra("length", (int) longValue);
        intent.putExtra("playbackPosition", (int) j);
    }

    public static Intent b(Intent intent, PlayerState playerState, cqe cqe) {
        a(intent, playerState, cqe);
        return intent;
    }

    public static Intent c(Intent intent, PlayerState playerState, cqe cqe) {
        a(intent, playerState, cqe);
        boolean z = false;
        intent.putExtra("playing", !playerState.isPaused() && playerState.isPlaying());
        if (!playerState.isPaused() && playerState.isPlaying()) {
            z = true;
        }
        intent.putExtra("playstate", z);
        return intent;
    }
}
