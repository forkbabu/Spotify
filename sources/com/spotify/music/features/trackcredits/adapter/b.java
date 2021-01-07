package com.spotify.music.features.trackcredits.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ TrackCreditsAdapter a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(TrackCreditsAdapter trackCreditsAdapter, d dVar) {
        this.a = trackCreditsAdapter;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TrackCreditsAdapter trackCreditsAdapter = this.a;
        d dVar = this.b;
        trackCreditsAdapter.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(dVar.c().get()));
        view.getContext().startActivity(intent);
    }
}
