package com.spotify.music.features.queue;

import com.google.common.base.Function;
import com.spotify.music.sociallistening.facepile.g;
import com.spotify.music.sociallistening.models.Participant;

public final /* synthetic */ class i implements Function {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Participant participant = (Participant) obj;
        String username = participant.getUsername();
        username.getClass();
        return new g(username, participant.getDisplayName(), participant.getLargeImageUrl());
    }
}
