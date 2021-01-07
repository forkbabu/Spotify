package com.spotify.music.libs.podcast.download;

import android.content.DialogInterface;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ a0 a;

    public /* synthetic */ l(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.e(dialogInterface, i);
    }
}
