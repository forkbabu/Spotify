package com.spotify.music.features.yourlibrary.musicpages.view;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ h(r0 r0Var, MusicItem musicItem, int i) {
        this.a = r0Var;
        this.b = musicItem;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i(this.b, this.c, view);
    }
}
