package com.spotify.music.features.yourepisodes.view;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class h implements DialogInterface.OnClickListener {
    final /* synthetic */ YourEpisodesDownloadListenerImpl a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int f;

    h(YourEpisodesDownloadListenerImpl yourEpisodesDownloadListenerImpl, String str, String str2, int i) {
        this.a = yourEpisodesDownloadListenerImpl;
        this.b = str;
        this.c = str2;
        this.f = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        YourEpisodesDownloadListenerImpl.d(this.a, this.b, this.c, this.f);
    }
}
