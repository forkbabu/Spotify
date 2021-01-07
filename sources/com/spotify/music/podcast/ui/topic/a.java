package com.spotify.music.podcast.ui.topic;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(f fVar, String str) {
        this.a = fVar;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
