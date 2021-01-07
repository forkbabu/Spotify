package com.spotify.music.features.freetierartist;

import android.view.View;
import com.spotify.music.artist.model.ArtistModel;

class f implements View.OnClickListener {
    final /* synthetic */ ArtistModel a;
    final /* synthetic */ ArtistConcertFragment b;

    f(ArtistConcertFragment artistConcertFragment, ArtistModel artistModel) {
        this.b = artistConcertFragment;
        this.a = artistModel;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.n0.a(this.a.uri);
        this.b.M0.d(this.a.uri);
    }
}
