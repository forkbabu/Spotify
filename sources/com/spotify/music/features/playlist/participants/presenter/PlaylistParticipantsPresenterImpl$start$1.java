package com.spotify.music.features.playlist.participants.presenter;

import com.spotify.playlist.endpoints.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlaylistParticipantsPresenterImpl$start$1 extends FunctionReferenceImpl implements nmf<d.a, f> {
    PlaylistParticipantsPresenterImpl$start$1(PlaylistParticipantsPresenterImpl playlistParticipantsPresenterImpl) {
        super(1, playlistParticipantsPresenterImpl, PlaylistParticipantsPresenterImpl.class, "collaboratorsUpdated", "collaboratorsUpdated(Lcom/spotify/playlist/endpoints/PlaylistEndpoint$Collaborators;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(d.a aVar) {
        d.a aVar2 = aVar;
        h.e(aVar2, "p1");
        PlaylistParticipantsPresenterImpl.e((PlaylistParticipantsPresenterImpl) this.receiver, aVar2);
        return f.a;
    }
}
