package com.spotify.music.artist.dac.ui.binders;

import android.view.View;
import com.spotify.music.artist.dac.proto.ArtistItemComponent;

final class d implements View.OnClickListener {
    final /* synthetic */ ArtistItemComponentBinder$binder$1 a;
    final /* synthetic */ ArtistItemComponent b;

    d(ArtistItemComponentBinder$binder$1 artistItemComponentBinder$binder$1, ArtistItemComponent artistItemComponent) {
        this.a = artistItemComponentBinder$binder$1;
        this.b = artistItemComponent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.this$0.c.d(this.b.l());
    }
}
