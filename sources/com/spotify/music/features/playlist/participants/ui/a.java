package com.spotify.music.features.playlist.participants.ui;

import androidx.recyclerview.widget.v;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.music.features.playlist.participants.ui.PlaylistParticipantsAdapter;

public final class a implements PlaylistParticipantsAdapter.b {
    private final wlf<ParticipantRowPlaylist> a;

    public a(wlf<ParticipantRowPlaylist> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlist.participants.ui.PlaylistParticipantsAdapter.b
    public v a(PlaylistParticipantsAdapter.c cVar) {
        wlf<ParticipantRowPlaylist> wlf = this.a;
        b(cVar, 2);
        return new PlaylistParticipantsAdapter(wlf, cVar);
    }
}
