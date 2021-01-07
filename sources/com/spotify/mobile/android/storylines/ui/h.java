package com.spotify.mobile.android.storylines.ui;

import com.spotify.mobile.android.storylines.model.b;
import com.squareup.picasso.g;

class h implements g {
    final /* synthetic */ b a;
    final /* synthetic */ StorylinesCardView b;

    h(StorylinesCardView storylinesCardView, b bVar) {
        this.b = storylinesCardView;
        this.a = bVar;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        ((StorylinesView) StorylinesCardView.a(this.b)).w(this.a);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        ((StorylinesView) StorylinesCardView.a(this.b)).y(this.a);
    }
}
