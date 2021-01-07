package com.spotify.music.features.trackcredits.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ TrackCreditsAdapter a;

    public /* synthetic */ a(TrackCreditsAdapter trackCreditsAdapter) {
        this.a = trackCreditsAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://artists.spotify.com/faq/music#this-songs-credits-are-incorrect-how-can-they-be-fixed"));
        view.getContext().startActivity(intent);
    }
}
