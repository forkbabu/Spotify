package com.spotify.music.features.yourlibrary.musicpages.item;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ o a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ h(o oVar, MusicItem musicItem, int i) {
        this.a = oVar;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d(this.b, this.c, dialogInterface, i);
    }
}
