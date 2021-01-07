package com.spotify.encore.consumer.components.playlist.impl.participantrow;

import android.view.View;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultParticipantRowPlaylist implements ParticipantRowPlaylist {
    private final View view;
    private final DefaultParticipantRowPlaylistViewBinder viewBinder;

    public DefaultParticipantRowPlaylist(DefaultParticipantRowPlaylistViewBinder defaultParticipantRowPlaylistViewBinder) {
        h.e(defaultParticipantRowPlaylistViewBinder, "viewBinder");
        this.viewBinder = defaultParticipantRowPlaylistViewBinder;
        this.view = defaultParticipantRowPlaylistViewBinder.getView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.view;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ParticipantRowPlaylist.Event, f> nmf) {
        h.e(nmf, "event");
        this.viewBinder.setOnParticipantClickListener(nmf);
    }

    public void render(ParticipantRowPlaylist.Model model) {
        h.e(model, "model");
        this.viewBinder.render(model);
    }
}
