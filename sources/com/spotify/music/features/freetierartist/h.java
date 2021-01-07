package com.spotify.music.features.freetierartist;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

class h implements View.OnClickListener {
    final /* synthetic */ ArtistConcertFragment a;

    h(ArtistConcertFragment artistConcertFragment) {
        this.a = artistConcertFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ArtistConcertFragment artistConcertFragment = this.a;
        String V4 = ArtistConcertFragment.V4(artistConcertFragment);
        artistConcertFragment.getClass();
        String format = String.format("https://www.songkick.com/concerts/%s", V4);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
        artistConcertFragment.n0.a(format);
        artistConcertFragment.G4(intent, null);
    }
}
