package com.spotify.music.features.playlist.participants.ui;

import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;

public final class b implements fjf<a> {
    private final wlf<ParticipantRowPlaylist> a;

    public b(wlf<ParticipantRowPlaylist> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a);
    }
}
