package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;

public abstract class r1 {
    private Optional<String> a = Optional.absent();
    private AudioStream b;

    public void a() {
        if (this.a.isPresent() && this.b != null) {
            b(this.a.get(), this.b);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(String str, AudioStream audioStream);

    public void c(PlayerState playerState) {
        if (this.a.isPresent() && this.b != null && !this.a.equals(playerState.playbackId())) {
            b(this.a.get(), this.b);
            this.a = Optional.absent();
        }
        if (playerState.playbackId().isPresent() && playerState.isPlaying() && !playerState.isPaused()) {
            this.a = playerState.playbackId();
            this.b = playerState.audioStream() != null ? playerState.audioStream() : AudioStream.DEFAULT;
        }
    }
}
