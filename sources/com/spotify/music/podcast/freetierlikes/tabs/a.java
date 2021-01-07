package com.spotify.music.podcast.freetierlikes.tabs;

import android.content.Context;
import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a(g gVar, Context context) {
        this.a = gVar;
        this.b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b(this.b, view);
    }
}
