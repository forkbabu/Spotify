package com.spotify.music.features.freetierartist;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

class g implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ ArtistConcertFragment b;

    g(ArtistConcertFragment artistConcertFragment, String str) {
        this.b = artistConcertFragment;
        this.a = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ArtistConcertFragment artistConcertFragment = this.b;
        String str = this.a;
        int i = ArtistConcertFragment.N0;
        artistConcertFragment.getClass();
        String format = String.format("https://maps.google.com/maps?q=loc:%s", str);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
        artistConcertFragment.n0.a(format);
        artistConcertFragment.G4(intent, null);
    }
}
