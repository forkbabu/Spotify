package com.spotify.music.podcast.episode.util;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(h hVar, String str) {
        this.a = hVar;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(this.b, view);
    }
}
