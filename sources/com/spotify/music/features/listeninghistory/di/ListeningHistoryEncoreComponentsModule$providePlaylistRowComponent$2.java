package com.spotify.music.features.listeninghistory.di;

import com.spotify.encore.consumer.components.listeninghistory.api.playlistrow.PlaylistRowListeningHistory;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$2 extends Lambda implements smf<String, String, String, PlaylistRowListeningHistory.Model> {
    public static final ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$2 a = new ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$2();

    ListeningHistoryEncoreComponentsModule$providePlaylistRowComponent$2() {
        super(3);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public PlaylistRowListeningHistory.Model c(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        h.e(str4, "title");
        h.e(str5, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str6, "image");
        return new PlaylistRowListeningHistory.Model(str4, str5, str6);
    }
}
