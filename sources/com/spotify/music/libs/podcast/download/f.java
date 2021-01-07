package com.spotify.music.libs.podcast.download;

import android.content.DialogInterface;
import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.podcast.download.a0;

public final /* synthetic */ class f implements DialogInterface.OnClickListener {
    public final /* synthetic */ a0.b a;

    public /* synthetic */ f(a0.b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(ImmutableList.of());
    }
}
