package com.spotify.music.features.yourepisodes.view;

import android.content.DialogInterface;

final class f implements DialogInterface.OnClickListener {
    final /* synthetic */ YourEpisodesDownloadListenerImpl a;

    f(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl) {
        this.a = yourEpisodesDownloadListenerImpl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        YourEpisodesDownloadListenerImpl.c(this.a).d("spotify:internal:preferences");
    }
}
