package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ x a;
    public final /* synthetic */ int b;

    public /* synthetic */ a(x xVar, int i) {
        this.a = xVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.X(this.b, view);
    }
}
