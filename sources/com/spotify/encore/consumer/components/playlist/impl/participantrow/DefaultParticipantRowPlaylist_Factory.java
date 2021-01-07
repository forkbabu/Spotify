package com.spotify.encore.consumer.components.playlist.impl.participantrow;

public final class DefaultParticipantRowPlaylist_Factory implements fjf<DefaultParticipantRowPlaylist> {
    private final wlf<DefaultParticipantRowPlaylistViewBinder> viewBinderProvider;

    public DefaultParticipantRowPlaylist_Factory(wlf<DefaultParticipantRowPlaylistViewBinder> wlf) {
        this.viewBinderProvider = wlf;
    }

    public static DefaultParticipantRowPlaylist_Factory create(wlf<DefaultParticipantRowPlaylistViewBinder> wlf) {
        return new DefaultParticipantRowPlaylist_Factory(wlf);
    }

    public static DefaultParticipantRowPlaylist newInstance(DefaultParticipantRowPlaylistViewBinder defaultParticipantRowPlaylistViewBinder) {
        return new DefaultParticipantRowPlaylist(defaultParticipantRowPlaylistViewBinder);
    }

    @Override // defpackage.wlf
    public DefaultParticipantRowPlaylist get() {
        return newInstance(this.viewBinderProvider.get());
    }
}
